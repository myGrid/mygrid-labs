/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workbench.canvas;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.CanvasFactory
 * @model kind="package"
 * @generated
 */
public interface CanvasPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "canvas";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uk.org.taverna/tng/mockup3/1.0/canvas";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "canvas";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CanvasPackage eINSTANCE = uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.CanvasPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.DataImpl
	 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.CanvasPackageImpl#getData()
	 * @generated
	 */
	int DATA = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Data Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATA_LINK = 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.DataSourceImpl
	 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.CanvasPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.CanvasImpl <em>Canvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.CanvasImpl
	 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.CanvasPackageImpl#getCanvas()
	 * @generated
	 */
	int CANVAS = 2;

	/**
	 * The feature id for the '<em><b>Data Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__DATA_LINKS = 0;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__WORKFLOW = 1;

	/**
	 * The number of structural features of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the reference list '{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.Data#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.Data#getSource()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Source();

	/**
	 * Returns the meta object for the reference '{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.Data#getDataLink <em>Data Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Link</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.Data#getDataLink()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_DataLink();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.Canvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canvas</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.Canvas
	 * @generated
	 */
	EClass getCanvas();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.Canvas#getDataLinks <em>Data Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Links</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.Canvas#getDataLinks()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_DataLinks();

	/**
	 * Returns the meta object for the containment reference '{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.Canvas#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workflow</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.Canvas#getWorkflow()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Workflow();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CanvasFactory getCanvasFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.DataImpl
		 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.CanvasPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__SOURCE = eINSTANCE.getData_Source();

		/**
		 * The meta object literal for the '<em><b>Data Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__DATA_LINK = eINSTANCE.getData_DataLink();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.DataSourceImpl
		 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.CanvasPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.CanvasImpl <em>Canvas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.CanvasImpl
		 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.CanvasPackageImpl#getCanvas()
		 * @generated
		 */
		EClass CANVAS = eINSTANCE.getCanvas();

		/**
		 * The meta object literal for the '<em><b>Data Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS__DATA_LINKS = eINSTANCE.getCanvas_DataLinks();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS__WORKFLOW = eINSTANCE.getCanvas_Workflow();

	}

} //CanvasPackage
