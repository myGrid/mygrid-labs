package uk.org.taverna.t3.workbench.canvas.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.CanvasEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceInput2EditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceInputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceOutput2EditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceOutputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.CoreComponentInstanceEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.HelperComponentInstanceEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.NodeEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.SenderReceiversEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowInputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowOutputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.part.CanvasDiagramEditorPlugin;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage;

/**
 * @generated
 */
public class CanvasElementTypes {

	/**
	 * @generated
	 */
	private CanvasElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Canvas_1000 = getElementType("uk.org.taverna.t3.workbench.canvas.diagram.Canvas_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WorkflowInput_2001 = getElementType("uk.org.taverna.t3.workbench.canvas.diagram.WorkflowInput_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_2002 = getElementType("uk.org.taverna.t3.workbench.canvas.diagram.Node_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WorkflowOutput_2003 = getElementType("uk.org.taverna.t3.workbench.canvas.diagram.WorkflowOutput_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CoreComponentInstance_3001 = getElementType("uk.org.taverna.t3.workbench.canvas.diagram.CoreComponentInstance_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentInstanceInput_3002 = getElementType("uk.org.taverna.t3.workbench.canvas.diagram.ComponentInstanceInput_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentInstanceOutput_3003 = getElementType("uk.org.taverna.t3.workbench.canvas.diagram.ComponentInstanceOutput_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HelperComponentInstance_3004 = getElementType("uk.org.taverna.t3.workbench.canvas.diagram.HelperComponentInstance_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentInstanceInput_3005 = getElementType("uk.org.taverna.t3.workbench.canvas.diagram.ComponentInstanceInput_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ComponentInstanceOutput_3006 = getElementType("uk.org.taverna.t3.workbench.canvas.diagram.ComponentInstanceOutput_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SenderReceivers_4001 = getElementType("uk.org.taverna.t3.workbench.canvas.diagram.SenderReceivers_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return CanvasDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Canvas_1000, CanvasPackage.eINSTANCE.getCanvas());

			elements.put(WorkflowInput_2001,
					CanvasPackage.eINSTANCE.getWorkflowInput());

			elements.put(Node_2002, CanvasPackage.eINSTANCE.getNode());

			elements.put(WorkflowOutput_2003,
					CanvasPackage.eINSTANCE.getWorkflowOutput());

			elements.put(CoreComponentInstance_3001,
					CanvasPackage.eINSTANCE.getCoreComponentInstance());

			elements.put(ComponentInstanceInput_3002,
					CanvasPackage.eINSTANCE.getComponentInstanceInput());

			elements.put(ComponentInstanceOutput_3003,
					CanvasPackage.eINSTANCE.getComponentInstanceOutput());

			elements.put(HelperComponentInstance_3004,
					CanvasPackage.eINSTANCE.getHelperComponentInstance());

			elements.put(ComponentInstanceInput_3005,
					CanvasPackage.eINSTANCE.getComponentInstanceInput());

			elements.put(ComponentInstanceOutput_3006,
					CanvasPackage.eINSTANCE.getComponentInstanceOutput());

			elements.put(SenderReceivers_4001,
					CanvasPackage.eINSTANCE.getSender_Receivers());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Canvas_1000);
			KNOWN_ELEMENT_TYPES.add(WorkflowInput_2001);
			KNOWN_ELEMENT_TYPES.add(Node_2002);
			KNOWN_ELEMENT_TYPES.add(WorkflowOutput_2003);
			KNOWN_ELEMENT_TYPES.add(CoreComponentInstance_3001);
			KNOWN_ELEMENT_TYPES.add(ComponentInstanceInput_3002);
			KNOWN_ELEMENT_TYPES.add(ComponentInstanceOutput_3003);
			KNOWN_ELEMENT_TYPES.add(HelperComponentInstance_3004);
			KNOWN_ELEMENT_TYPES.add(ComponentInstanceInput_3005);
			KNOWN_ELEMENT_TYPES.add(ComponentInstanceOutput_3006);
			KNOWN_ELEMENT_TYPES.add(SenderReceivers_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CanvasEditPart.VISUAL_ID:
			return Canvas_1000;
		case WorkflowInputEditPart.VISUAL_ID:
			return WorkflowInput_2001;
		case NodeEditPart.VISUAL_ID:
			return Node_2002;
		case WorkflowOutputEditPart.VISUAL_ID:
			return WorkflowOutput_2003;
		case CoreComponentInstanceEditPart.VISUAL_ID:
			return CoreComponentInstance_3001;
		case ComponentInstanceInputEditPart.VISUAL_ID:
			return ComponentInstanceInput_3002;
		case ComponentInstanceOutputEditPart.VISUAL_ID:
			return ComponentInstanceOutput_3003;
		case HelperComponentInstanceEditPart.VISUAL_ID:
			return HelperComponentInstance_3004;
		case ComponentInstanceInput2EditPart.VISUAL_ID:
			return ComponentInstanceInput_3005;
		case ComponentInstanceOutput2EditPart.VISUAL_ID:
			return ComponentInstanceOutput_3006;
		case SenderReceiversEditPart.VISUAL_ID:
			return SenderReceivers_4001;
		}
		return null;
	}

}
