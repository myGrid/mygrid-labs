package uk.org.taverna.t3.workbench.ui.canvas;

import java.util.ArrayList;
import java.util.List;

import uk.org.taverna.platform.activity.ActivityConfigurationException;
import uk.org.taverna.platform.activity.ActivityNotFoundException;
import uk.org.taverna.scufl2.api.configurations.ConfigurationDefinition;
import uk.org.taverna.scufl2.api.configurations.PropertyDefinition;
import uk.org.taverna.scufl2.api.configurations.PropertyLiteralDefinition;
import uk.org.taverna.scufl2.api.configurations.PropertyReferenceDefinition;
import uk.org.taverna.scufl2.api.configurations.PropertyResourceDefinition;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasFactory;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Component;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentDefinitionReference;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentOutput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyComplex;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteral;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteralOption;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyReference;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Processor;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput;
import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.ConfigFieldDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.ConfigFieldType;
import uk.org.taverna.t3.workbench.components.definitions.model.PortDefinition;
import uk.org.taverna.t3.workbench.ui.util.Services;

import com.google.common.base.Preconditions;


/**
 * Helper class to work with the Canvas.
 * 
 * Currently contains utility methods only.
 * 
 * @author Jiten Bhagat
 *
 */
public class CanvasHelper {
	
	public Component buildComponentFrom(ComponentDefinition cd) {
		Preconditions.checkNotNull(cd);
		
		final Component component = CanvasFactory.eINSTANCE.createComponent();
		
		component.setLabel(cd.getLabel());
		component.setTitle(cd.getTitle());
		component.setDescription(cd.getDescription());
		
		// Reference to original component definition 
		
		ComponentDefinitionReference cdRef = CanvasFactory.eINSTANCE.createComponentDefinitionReference();
		cdRef.setComponentDefinitionId(cd.getId().toString());
		if (cd.getPublisher() != null)
			cdRef.setDiscoveryUrl(cd.getPublisher().getResource().toString());
		component.setOriginalComponentDefinition(cdRef);
		
		// Processor
		
		// FIXME: take into account nested workflows! 
		// For now this is assuming a 1:1 mapping between Component
		// and Processor
		
		Processor processor = CanvasFactory.eINSTANCE.createProcessor();
		processor.setType(cd.getTavernaActivity().getType().toString());	// FIXME:
		processor.setActivitiy(cd.getTavernaActivity().getType().toString());
		processor.setLabel(cd.getLabel());
		processor.setName(cd.getLabel().replaceAll("\\s", "_").toLowerCase());
		
		// Inputs and outputs
		
		// TODO: instead of just taking the ins/outs from the component definition,
		// need to do a merge operation similar to that being done for the configuration
		// properties. E.g.: to take into account changes in the SOAP operation, etc.
		
		for (PortDefinition portDef : cd.getPorts().getInputs()) {
			ProcessorInput pPort = CanvasFactory.eINSTANCE.createProcessorInput();
			pPort.setLabel(portDef.getLabel());
			pPort.setName(portDef.getName());
			pPort.setDepth(portDef.getDepth());
			processor.getProcessorInputs().add(pPort);
			
			// FIXME: take into account nested workflows that have workflow inputs
			
			ComponentInput cPort = CanvasFactory.eINSTANCE.createComponentInput();
			cPort.setLabel(portDef.getLabel());
			cPort.setName(portDef.getName());
			cPort.setDepth(portDef.getDepth());
			component.getComponentInputs().add(cPort);
			
			// Receiver
			cPort.getReceivers().add(pPort);
		}
		
		for (PortDefinition portDef : cd.getPorts().getOutputs()) {
			ProcessorOutput pPort = CanvasFactory.eINSTANCE.createProcessorOutput();
			pPort.setName(portDef.getName());
			pPort.setDepth(portDef.getDepth());
			processor.getProcessorOutputs().add(pPort);
			
			// FIXME: take into account nested workflows that have workflow outputs
			
			ComponentOutput cPort = CanvasFactory.eINSTANCE.createComponentOutput();
			cPort.setLabel(portDef.getLabel());
			cPort.setName(portDef.getName());
			cPort.setDepth(portDef.getDepth());
			component.getComponentOutputs().add(cPort);
			
			// Receiver
			pPort.getReceivers().add(cPort);
		}
		
		component.getProcessors().add(processor);
		
		// Configuration Properties
		
		component.getConfigurationProperties().addAll(mergeConfigFields(cd));

		return component;
	}
	
	private List<ConfigurationProperty> mergeConfigFields(ComponentDefinition cd) {
		List<ConfigurationProperty> properties = new ArrayList<ConfigurationProperty>();
		
		ConfigurationDefinition activityConfigurationDefinition = null;
		try {
			activityConfigurationDefinition = Services.getInstance().getActivityService().getActivityConfigurationDefinition(cd.getTavernaActivity().getType());
		} catch (ActivityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ActivityConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (activityConfigurationDefinition != null) {
			List<PropertyDefinition> propertyDefinitions = activityConfigurationDefinition.getPropertyResourceDefinition().getPropertyDefinitions();
			
			// Can be:
			// - PropertyLiteralDefinition - string
			// - PropertyReferenceDefinition - reference to WSDL; reference to a nested wf within the SCUFL2
			// - PropertyResourceDefinition - a complex property bean
			
			Debug.print(propertyDefinitions, cd.getTavernaActivity().getType().toString());
			
			// TODO: UNFINISHED: only doing a very partial and rudimentary merge for now
			// Also, improve efficiency and performance of this!
			
			final List<PropertyDefinition> excludeActivityProperties = new ArrayList<PropertyDefinition>();
			
			for (ConfigFieldDefinition configFieldDefinition : cd.getConfiguration().getFields()) {
				
				ConfigurationProperty p = configurationPropertyFrom(configFieldDefinition);
				
				if (p != null) {
					properties.add(p);
				}
				
				// Find out which properties from the activity should be excluded
				// (i.e.: the ones that are already in the component definition
				for (PropertyDefinition propertyDefinition : propertyDefinitions) {
					if (configFieldDefinition.getMapping().isToActivityConfigurationProperty()) {
						if (configFieldDefinition.getMapping().getActivityConfigurationProperty().getPredicate() == 
							propertyDefinition.getPredicate()) {
							excludeActivityProperties.add(propertyDefinition);
						}
					}
				}
				
			}
			
			for (PropertyDefinition propertyDefinition : propertyDefinitions) {
				if (!excludeActivityProperties.contains(propertyDefinition)) {
					ConfigurationProperty p = configurationPropertyFrom(propertyDefinition);
					
					if (p != null) {
						properties.add(p);
					}
				}
			}
			
		}
		
		return properties;
	}
	
	private ConfigurationProperty configurationPropertyFrom(PropertyDefinition def) {
		ConfigurationProperty p = null;
		
		if (def instanceof PropertyLiteralDefinition) {
			PropertyLiteralDefinition literalDef = (PropertyLiteralDefinition) def;
			
			ConfigurationPropertyLiteral newProperty = CanvasFactory.eINSTANCE.createConfigurationPropertyLiteral();
			
			newProperty.setFieldType(ConfigFieldType.SINGLE_TEXT.toString());		// FIXME: currently assuming it's just text
			newProperty.setDataType(literalDef.getLiteralType().toString());
			
			// TODO: support PropertyLiteralDefinition#options
			
			p = newProperty;
		} else if (def instanceof PropertyReferenceDefinition) {
			PropertyReferenceDefinition referenceDef = (PropertyReferenceDefinition) def;
			
			ConfigurationPropertyReference newProperty = CanvasFactory.eINSTANCE.createConfigurationPropertyReference();
			
			// TODO: support PropertyReferenceDefinition#options
			
			p = newProperty;
		} else if (def instanceof PropertyResourceDefinition) {
			PropertyResourceDefinition resourceDef = (PropertyResourceDefinition) def;
			
			ConfigurationPropertyComplex newProperty = CanvasFactory.eINSTANCE.createConfigurationPropertyComplex();
			
			// TODO: add the typeURI
			
			for (PropertyDefinition innerDefinition : resourceDef.getPropertyDefinitions()) {
				newProperty.getProperties().add(configurationPropertyFrom(innerDefinition));
			}
			
			p = newProperty;
		}
		
		p.setPredicate(def.getPredicate().toString());
		p.setLabel(def.getLabel());
		p.setName(def.getName());
		p.setDescription(def.getDescription());
		p.setRequired(def.isRequired());
		
		return p;
	}

	private ConfigurationProperty configurationPropertyFrom(ConfigFieldDefinition def) {
		ConfigurationPropertyLiteral p = CanvasFactory.eINSTANCE.createConfigurationPropertyLiteral();
		
		p.setLabel(def.getLabel());
		p.setName(def.getName());
		p.setDescription(def.getDescription());
		p.setRequired(def.isRequired());
		p.setHidden(def.isHidden());
		p.setFixed(def.isFixed());
		p.getExamples().addAll(def.getExamples());
		p.setConstrainedToOptions(def.isConstrainedToOptions());
		
		// FIXME: Temporarily assume this is a literal property
		
		p.setFieldType(def.getFieldType().toString());
		p.setDataType(def.getDataType().toString());
		p.setValue(def.getDefaultValue());
		
		if (def.isConstrainedToOptions()) {
			for (ConfigFieldDefinition.Option defOption : def.getOptions()) {
				ConfigurationPropertyLiteralOption option = CanvasFactory.eINSTANCE.createConfigurationPropertyLiteralOption();
				option.setLabel(defOption.getLabel());
				option.setValue(defOption.getValue());
				p.getOptions().add(option);
			}
		}
		
		if (def.getMapping().isToActivityConfigurationProperty()) {
			p.setPredicate(def.getMapping().getActivityConfigurationProperty().getPredicate().toString());
		}
		
		return p;
	}
	
	private static class Debug {
		
		public static void print(List<PropertyDefinition> defs, String activityURI) {
			System.out.println("\n****** PropertyDefinitions for: " + activityURI + " ******");
			for (PropertyDefinition def : defs) {
				print(def);
			}
			System.out.println("***********************************************************************\n");
		}
		
		public static void print(PropertyDefinition def) {
			print(def, "");
		}
		
		public static void print(PropertyDefinition def, String outputPrefix) {
			System.out.println(outputPrefix + def.getClass().toString() + ": " + def.getPredicate());
			
			if (def instanceof PropertyResourceDefinition) {
				PropertyResourceDefinition resourceDef = (PropertyResourceDefinition) def;
				for (PropertyDefinition innerDef : resourceDef.getPropertyDefinitions()) {
					print(innerDef, outputPrefix + "\t");
				}
			}
		}
		
	}
	
}
