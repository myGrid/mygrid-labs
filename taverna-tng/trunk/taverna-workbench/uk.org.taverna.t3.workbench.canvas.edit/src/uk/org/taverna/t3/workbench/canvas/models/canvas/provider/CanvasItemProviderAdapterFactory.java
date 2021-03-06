/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import uk.org.taverna.t3.workbench.canvas.models.canvas.util.CanvasAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CanvasItemProviderAdapterFactory extends CanvasAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowInput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowInputItemProvider workflowInputItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowInputAdapter() {
		if (workflowInputItemProvider == null) {
			workflowInputItemProvider = new WorkflowInputItemProvider(this);
		}

		return workflowInputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowOutput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowOutputItemProvider workflowOutputItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowOutputAdapter() {
		if (workflowOutputItemProvider == null) {
			workflowOutputItemProvider = new WorkflowOutputItemProvider(this);
		}

		return workflowOutputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentDefinitionReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDefinitionReferenceItemProvider componentDefinitionReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentDefinitionReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentDefinitionReferenceAdapter() {
		if (componentDefinitionReferenceItemProvider == null) {
			componentDefinitionReferenceItemProvider = new ComponentDefinitionReferenceItemProvider(this);
		}

		return componentDefinitionReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanvasItemProvider canvasItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCanvasAdapter() {
		if (canvasItemProvider == null) {
			canvasItemProvider = new CanvasItemProvider(this);
		}

		return canvasItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorItemProvider processorItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessorAdapter() {
		if (processorItemProvider == null) {
			processorItemProvider = new ProcessorItemProvider(this);
		}

		return processorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorInput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorInputItemProvider processorInputItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessorInputAdapter() {
		if (processorInputItemProvider == null) {
			processorInputItemProvider = new ProcessorInputItemProvider(this);
		}

		return processorInputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorOutputItemProvider processorOutputItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessorOutputAdapter() {
		if (processorOutputItemProvider == null) {
			processorOutputItemProvider = new ProcessorOutputItemProvider(this);
		}

		return processorOutputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInputItemProvider componentInputItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentInputAdapter() {
		if (componentInputItemProvider == null) {
			componentInputItemProvider = new ComponentInputItemProvider(this);
		}

		return componentInputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentOutput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentOutputItemProvider componentOutputItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentOutputAdapter() {
		if (componentOutputItemProvider == null) {
			componentOutputItemProvider = new ComponentOutputItemProvider(this);
		}

		return componentOutputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteralOption} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationPropertyLiteralOptionItemProvider configurationPropertyLiteralOptionItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteralOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigurationPropertyLiteralOptionAdapter() {
		if (configurationPropertyLiteralOptionItemProvider == null) {
			configurationPropertyLiteralOptionItemProvider = new ConfigurationPropertyLiteralOptionItemProvider(this);
		}

		return configurationPropertyLiteralOptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationPropertyLiteralItemProvider configurationPropertyLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigurationPropertyLiteralAdapter() {
		if (configurationPropertyLiteralItemProvider == null) {
			configurationPropertyLiteralItemProvider = new ConfigurationPropertyLiteralItemProvider(this);
		}

		return configurationPropertyLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationPropertyReferenceItemProvider configurationPropertyReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigurationPropertyReferenceAdapter() {
		if (configurationPropertyReferenceItemProvider == null) {
			configurationPropertyReferenceItemProvider = new ConfigurationPropertyReferenceItemProvider(this);
		}

		return configurationPropertyReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyComplex} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationPropertyComplexItemProvider configurationPropertyComplexItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyComplex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigurationPropertyComplexAdapter() {
		if (configurationPropertyComplexItemProvider == null) {
			configurationPropertyComplexItemProvider = new ConfigurationPropertyComplexItemProvider(this);
		}

		return configurationPropertyComplexItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyStack} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterationStrategyStackItemProvider iterationStrategyStackItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyStack}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIterationStrategyStackAdapter() {
		if (iterationStrategyStackItemProvider == null) {
			iterationStrategyStackItemProvider = new IterationStrategyStackItemProvider(this);
		}

		return iterationStrategyStackItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyPortNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterationStrategyPortNodeItemProvider iterationStrategyPortNodeItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyPortNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIterationStrategyPortNodeAdapter() {
		if (iterationStrategyPortNodeItemProvider == null) {
			iterationStrategyPortNodeItemProvider = new IterationStrategyPortNodeItemProvider(this);
		}

		return iterationStrategyPortNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.CrossProduct} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrossProductItemProvider crossProductItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.CrossProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCrossProductAdapter() {
		if (crossProductItemProvider == null) {
			crossProductItemProvider = new CrossProductItemProvider(this);
		}

		return crossProductItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.org.taverna.t3.workbench.canvas.models.canvas.DotProduct} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DotProductItemProvider dotProductItemProvider;

	/**
	 * This creates an adapter for a {@link uk.org.taverna.t3.workbench.canvas.models.canvas.DotProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDotProductAdapter() {
		if (dotProductItemProvider == null) {
			dotProductItemProvider = new DotProductItemProvider(this);
		}

		return dotProductItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (workflowInputItemProvider != null) workflowInputItemProvider.dispose();
		if (workflowOutputItemProvider != null) workflowOutputItemProvider.dispose();
		if (componentDefinitionReferenceItemProvider != null) componentDefinitionReferenceItemProvider.dispose();
		if (canvasItemProvider != null) canvasItemProvider.dispose();
		if (componentItemProvider != null) componentItemProvider.dispose();
		if (processorItemProvider != null) processorItemProvider.dispose();
		if (processorInputItemProvider != null) processorInputItemProvider.dispose();
		if (processorOutputItemProvider != null) processorOutputItemProvider.dispose();
		if (componentInputItemProvider != null) componentInputItemProvider.dispose();
		if (componentOutputItemProvider != null) componentOutputItemProvider.dispose();
		if (configurationPropertyLiteralItemProvider != null) configurationPropertyLiteralItemProvider.dispose();
		if (configurationPropertyLiteralOptionItemProvider != null) configurationPropertyLiteralOptionItemProvider.dispose();
		if (configurationPropertyReferenceItemProvider != null) configurationPropertyReferenceItemProvider.dispose();
		if (configurationPropertyComplexItemProvider != null) configurationPropertyComplexItemProvider.dispose();
		if (iterationStrategyStackItemProvider != null) iterationStrategyStackItemProvider.dispose();
		if (iterationStrategyPortNodeItemProvider != null) iterationStrategyPortNodeItemProvider.dispose();
		if (crossProductItemProvider != null) crossProductItemProvider.dispose();
		if (dotProductItemProvider != null) dotProductItemProvider.dispose();
	}

}
