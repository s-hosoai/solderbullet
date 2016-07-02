/**
 */
package MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwResourceImpl;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentKind;
import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition;
import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent;
import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage;

import MARTE_Library.BasicNFP_Types.NFP_Area;
import MARTE_Library.BasicNFP_Types.NFP_Length;
import MARTE_Library.BasicNFP_Types.NFP_Natural;
import MARTE_Library.BasicNFP_Types.NFP_Power;
import MARTE_Library.BasicNFP_Types.NFP_Price;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import MARTE_Library.MARTE_DataTypes.NFP_NaturalInterval;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl#getArea <em>Area</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl#getNbPins <em>Nb Pins</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl#getR_Conditions <em>RConditions</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl#getPoweredServices <em>Powered Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl#getStaticConsumption <em>Static Consumption</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl#getStaticDissipation <em>Static Dissipation</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl#getSubComponents <em>Sub Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwComponentImpl extends HwResourceImpl implements HwComponent {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentKind KIND_EDEFAULT = ComponentKind.CARD_LITERAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ComponentKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList dimensions;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected EList position;

	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected EList grid;

	/**
	 * The cached value of the '{@link #getNbPins() <em>Nb Pins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbPins()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural nbPins;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected NFP_Real weight;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected NFP_Price price;

	/**
	 * The cached value of the '{@link #getR_Conditions() <em>RConditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR_Conditions()
	 * @generated
	 * @ordered
	 */
	protected EList r_Conditions;

	/**
	 * The cached value of the '{@link #getPoweredServices() <em>Powered Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoweredServices()
	 * @generated
	 * @ordered
	 */
	protected EList poweredServices;

	/**
	 * The cached value of the '{@link #getStaticConsumption() <em>Static Consumption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticConsumption()
	 * @generated
	 * @ordered
	 */
	protected NFP_Power staticConsumption;

	/**
	 * The cached value of the '{@link #getStaticDissipation() <em>Static Dissipation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticDissipation()
	 * @generated
	 * @ordered
	 */
	protected NFP_Power staticDissipation;

	/**
	 * The cached value of the '{@link #getSubComponents() <em>Sub Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubComponents()
	 * @generated
	 * @ordered
	 */
	protected EList subComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwLayoutPackage.Literals.HW_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ComponentKind newKind) {
		ComponentKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwLayoutPackage.HW_COMPONENT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDimensions() {
		if (dimensions == null) {
			dimensions = new EObjectContainmentEList(NFP_Length.class, this, HwLayoutPackage.HW_COMPONENT__DIMENSIONS);
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Area getArea() {
		NFP_Area area = basicGetArea();
		return area != null && area.eIsProxy() ? (NFP_Area)eResolveProxy((InternalEObject)area) : area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Area basicGetArea() {
		// TODO: implement this method to return the 'Area' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArea(NFP_Area newArea) {
		// TODO: implement this method to set the 'Area' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPosition() {
		if (position == null) {
			position = new EObjectContainmentEList(NFP_NaturalInterval.class, this, HwLayoutPackage.HW_COMPONENT__POSITION);
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGrid() {
		if (grid == null) {
			grid = new EObjectContainmentEList(NFP_Natural.class, this, HwLayoutPackage.HW_COMPONENT__GRID);
		}
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getNbPins() {
		return nbPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbPins(NFP_Natural newNbPins, NotificationChain msgs) {
		NFP_Natural oldNbPins = nbPins;
		nbPins = newNbPins;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwLayoutPackage.HW_COMPONENT__NB_PINS, oldNbPins, newNbPins);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbPins(NFP_Natural newNbPins) {
		if (newNbPins != nbPins) {
			NotificationChain msgs = null;
			if (nbPins != null)
				msgs = ((InternalEObject)nbPins).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwLayoutPackage.HW_COMPONENT__NB_PINS, null, msgs);
			if (newNbPins != null)
				msgs = ((InternalEObject)newNbPins).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwLayoutPackage.HW_COMPONENT__NB_PINS, null, msgs);
			msgs = basicSetNbPins(newNbPins, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwLayoutPackage.HW_COMPONENT__NB_PINS, newNbPins, newNbPins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Real getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeight(NFP_Real newWeight, NotificationChain msgs) {
		NFP_Real oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwLayoutPackage.HW_COMPONENT__WEIGHT, oldWeight, newWeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(NFP_Real newWeight) {
		if (newWeight != weight) {
			NotificationChain msgs = null;
			if (weight != null)
				msgs = ((InternalEObject)weight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwLayoutPackage.HW_COMPONENT__WEIGHT, null, msgs);
			if (newWeight != null)
				msgs = ((InternalEObject)newWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwLayoutPackage.HW_COMPONENT__WEIGHT, null, msgs);
			msgs = basicSetWeight(newWeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwLayoutPackage.HW_COMPONENT__WEIGHT, newWeight, newWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Price getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrice(NFP_Price newPrice, NotificationChain msgs) {
		NFP_Price oldPrice = price;
		price = newPrice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwLayoutPackage.HW_COMPONENT__PRICE, oldPrice, newPrice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(NFP_Price newPrice) {
		if (newPrice != price) {
			NotificationChain msgs = null;
			if (price != null)
				msgs = ((InternalEObject)price).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwLayoutPackage.HW_COMPONENT__PRICE, null, msgs);
			if (newPrice != null)
				msgs = ((InternalEObject)newPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwLayoutPackage.HW_COMPONENT__PRICE, null, msgs);
			msgs = basicSetPrice(newPrice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwLayoutPackage.HW_COMPONENT__PRICE, newPrice, newPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getR_Conditions() {
		if (r_Conditions == null) {
			r_Conditions = new EObjectContainmentEList(Env_Condition.class, this, HwLayoutPackage.HW_COMPONENT__RCONDITIONS);
		}
		return r_Conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPoweredServices() {
		if (poweredServices == null) {
			poweredServices = new EObjectContainmentEList(HwResourceService.class, this, HwLayoutPackage.HW_COMPONENT__POWERED_SERVICES);
		}
		return poweredServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Power getStaticConsumption() {
		return staticConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticConsumption(NFP_Power newStaticConsumption, NotificationChain msgs) {
		NFP_Power oldStaticConsumption = staticConsumption;
		staticConsumption = newStaticConsumption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwLayoutPackage.HW_COMPONENT__STATIC_CONSUMPTION, oldStaticConsumption, newStaticConsumption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticConsumption(NFP_Power newStaticConsumption) {
		if (newStaticConsumption != staticConsumption) {
			NotificationChain msgs = null;
			if (staticConsumption != null)
				msgs = ((InternalEObject)staticConsumption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwLayoutPackage.HW_COMPONENT__STATIC_CONSUMPTION, null, msgs);
			if (newStaticConsumption != null)
				msgs = ((InternalEObject)newStaticConsumption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwLayoutPackage.HW_COMPONENT__STATIC_CONSUMPTION, null, msgs);
			msgs = basicSetStaticConsumption(newStaticConsumption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwLayoutPackage.HW_COMPONENT__STATIC_CONSUMPTION, newStaticConsumption, newStaticConsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Power getStaticDissipation() {
		return staticDissipation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticDissipation(NFP_Power newStaticDissipation, NotificationChain msgs) {
		NFP_Power oldStaticDissipation = staticDissipation;
		staticDissipation = newStaticDissipation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwLayoutPackage.HW_COMPONENT__STATIC_DISSIPATION, oldStaticDissipation, newStaticDissipation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticDissipation(NFP_Power newStaticDissipation) {
		if (newStaticDissipation != staticDissipation) {
			NotificationChain msgs = null;
			if (staticDissipation != null)
				msgs = ((InternalEObject)staticDissipation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwLayoutPackage.HW_COMPONENT__STATIC_DISSIPATION, null, msgs);
			if (newStaticDissipation != null)
				msgs = ((InternalEObject)newStaticDissipation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwLayoutPackage.HW_COMPONENT__STATIC_DISSIPATION, null, msgs);
			msgs = basicSetStaticDissipation(newStaticDissipation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwLayoutPackage.HW_COMPONENT__STATIC_DISSIPATION, newStaticDissipation, newStaticDissipation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubComponents() {
		if (subComponents == null) {
			subComponents = new EObjectContainmentEList(HwComponent.class, this, HwLayoutPackage.HW_COMPONENT__SUB_COMPONENTS);
		}
		return subComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwLayoutPackage.HW_COMPONENT__DIMENSIONS:
				return ((InternalEList)getDimensions()).basicRemove(otherEnd, msgs);
			case HwLayoutPackage.HW_COMPONENT__POSITION:
				return ((InternalEList)getPosition()).basicRemove(otherEnd, msgs);
			case HwLayoutPackage.HW_COMPONENT__GRID:
				return ((InternalEList)getGrid()).basicRemove(otherEnd, msgs);
			case HwLayoutPackage.HW_COMPONENT__NB_PINS:
				return basicSetNbPins(null, msgs);
			case HwLayoutPackage.HW_COMPONENT__WEIGHT:
				return basicSetWeight(null, msgs);
			case HwLayoutPackage.HW_COMPONENT__PRICE:
				return basicSetPrice(null, msgs);
			case HwLayoutPackage.HW_COMPONENT__RCONDITIONS:
				return ((InternalEList)getR_Conditions()).basicRemove(otherEnd, msgs);
			case HwLayoutPackage.HW_COMPONENT__POWERED_SERVICES:
				return ((InternalEList)getPoweredServices()).basicRemove(otherEnd, msgs);
			case HwLayoutPackage.HW_COMPONENT__STATIC_CONSUMPTION:
				return basicSetStaticConsumption(null, msgs);
			case HwLayoutPackage.HW_COMPONENT__STATIC_DISSIPATION:
				return basicSetStaticDissipation(null, msgs);
			case HwLayoutPackage.HW_COMPONENT__SUB_COMPONENTS:
				return ((InternalEList)getSubComponents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwLayoutPackage.HW_COMPONENT__KIND:
				return getKind();
			case HwLayoutPackage.HW_COMPONENT__DIMENSIONS:
				return getDimensions();
			case HwLayoutPackage.HW_COMPONENT__AREA:
				if (resolve) return getArea();
				return basicGetArea();
			case HwLayoutPackage.HW_COMPONENT__POSITION:
				return getPosition();
			case HwLayoutPackage.HW_COMPONENT__GRID:
				return getGrid();
			case HwLayoutPackage.HW_COMPONENT__NB_PINS:
				return getNbPins();
			case HwLayoutPackage.HW_COMPONENT__WEIGHT:
				return getWeight();
			case HwLayoutPackage.HW_COMPONENT__PRICE:
				return getPrice();
			case HwLayoutPackage.HW_COMPONENT__RCONDITIONS:
				return getR_Conditions();
			case HwLayoutPackage.HW_COMPONENT__POWERED_SERVICES:
				return getPoweredServices();
			case HwLayoutPackage.HW_COMPONENT__STATIC_CONSUMPTION:
				return getStaticConsumption();
			case HwLayoutPackage.HW_COMPONENT__STATIC_DISSIPATION:
				return getStaticDissipation();
			case HwLayoutPackage.HW_COMPONENT__SUB_COMPONENTS:
				return getSubComponents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HwLayoutPackage.HW_COMPONENT__KIND:
				setKind((ComponentKind)newValue);
				return;
			case HwLayoutPackage.HW_COMPONENT__DIMENSIONS:
				getDimensions().clear();
				getDimensions().addAll((Collection)newValue);
				return;
			case HwLayoutPackage.HW_COMPONENT__AREA:
				setArea((NFP_Area)newValue);
				return;
			case HwLayoutPackage.HW_COMPONENT__POSITION:
				getPosition().clear();
				getPosition().addAll((Collection)newValue);
				return;
			case HwLayoutPackage.HW_COMPONENT__GRID:
				getGrid().clear();
				getGrid().addAll((Collection)newValue);
				return;
			case HwLayoutPackage.HW_COMPONENT__NB_PINS:
				setNbPins((NFP_Natural)newValue);
				return;
			case HwLayoutPackage.HW_COMPONENT__WEIGHT:
				setWeight((NFP_Real)newValue);
				return;
			case HwLayoutPackage.HW_COMPONENT__PRICE:
				setPrice((NFP_Price)newValue);
				return;
			case HwLayoutPackage.HW_COMPONENT__RCONDITIONS:
				getR_Conditions().clear();
				getR_Conditions().addAll((Collection)newValue);
				return;
			case HwLayoutPackage.HW_COMPONENT__POWERED_SERVICES:
				getPoweredServices().clear();
				getPoweredServices().addAll((Collection)newValue);
				return;
			case HwLayoutPackage.HW_COMPONENT__STATIC_CONSUMPTION:
				setStaticConsumption((NFP_Power)newValue);
				return;
			case HwLayoutPackage.HW_COMPONENT__STATIC_DISSIPATION:
				setStaticDissipation((NFP_Power)newValue);
				return;
			case HwLayoutPackage.HW_COMPONENT__SUB_COMPONENTS:
				getSubComponents().clear();
				getSubComponents().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case HwLayoutPackage.HW_COMPONENT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case HwLayoutPackage.HW_COMPONENT__DIMENSIONS:
				getDimensions().clear();
				return;
			case HwLayoutPackage.HW_COMPONENT__AREA:
				setArea((NFP_Area)null);
				return;
			case HwLayoutPackage.HW_COMPONENT__POSITION:
				getPosition().clear();
				return;
			case HwLayoutPackage.HW_COMPONENT__GRID:
				getGrid().clear();
				return;
			case HwLayoutPackage.HW_COMPONENT__NB_PINS:
				setNbPins((NFP_Natural)null);
				return;
			case HwLayoutPackage.HW_COMPONENT__WEIGHT:
				setWeight((NFP_Real)null);
				return;
			case HwLayoutPackage.HW_COMPONENT__PRICE:
				setPrice((NFP_Price)null);
				return;
			case HwLayoutPackage.HW_COMPONENT__RCONDITIONS:
				getR_Conditions().clear();
				return;
			case HwLayoutPackage.HW_COMPONENT__POWERED_SERVICES:
				getPoweredServices().clear();
				return;
			case HwLayoutPackage.HW_COMPONENT__STATIC_CONSUMPTION:
				setStaticConsumption((NFP_Power)null);
				return;
			case HwLayoutPackage.HW_COMPONENT__STATIC_DISSIPATION:
				setStaticDissipation((NFP_Power)null);
				return;
			case HwLayoutPackage.HW_COMPONENT__SUB_COMPONENTS:
				getSubComponents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HwLayoutPackage.HW_COMPONENT__KIND:
				return kind != KIND_EDEFAULT;
			case HwLayoutPackage.HW_COMPONENT__DIMENSIONS:
				return dimensions != null && !dimensions.isEmpty();
			case HwLayoutPackage.HW_COMPONENT__AREA:
				return basicGetArea() != null;
			case HwLayoutPackage.HW_COMPONENT__POSITION:
				return position != null && !position.isEmpty();
			case HwLayoutPackage.HW_COMPONENT__GRID:
				return grid != null && !grid.isEmpty();
			case HwLayoutPackage.HW_COMPONENT__NB_PINS:
				return nbPins != null;
			case HwLayoutPackage.HW_COMPONENT__WEIGHT:
				return weight != null;
			case HwLayoutPackage.HW_COMPONENT__PRICE:
				return price != null;
			case HwLayoutPackage.HW_COMPONENT__RCONDITIONS:
				return r_Conditions != null && !r_Conditions.isEmpty();
			case HwLayoutPackage.HW_COMPONENT__POWERED_SERVICES:
				return poweredServices != null && !poweredServices.isEmpty();
			case HwLayoutPackage.HW_COMPONENT__STATIC_CONSUMPTION:
				return staticConsumption != null;
			case HwLayoutPackage.HW_COMPONENT__STATIC_DISSIPATION:
				return staticDissipation != null;
			case HwLayoutPackage.HW_COMPONENT__SUB_COMPONENTS:
				return subComponents != null && !subComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //HwComponentImpl
