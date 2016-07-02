/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;
import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource;
import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationResource;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwEndPoint;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia;

import MARTE.MARTE_Foundations.GRM.impl.CommunicationMediaImpl;

import MARTE_Library.BasicNFP_Types.NFP_DataTxRate;
import MARTE_Library.BasicNFP_Types.NFP_Frequency;
import MARTE_Library.BasicNFP_Types.NFP_String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Media</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwMediaImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwMediaImpl#getP_HW_Services <em>PHW Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwMediaImpl#getR_HW_Services <em>RHW Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwMediaImpl#getOwnedHW <em>Owned HW</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwMediaImpl#getEndPoints <em>End Points</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwMediaImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwMediaImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwMediaImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwMediaImpl#getName <em>Name</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwMediaImpl#getBandWidth <em>Band Width</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwMediaImpl#getArbiters <em>Arbiters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwMediaImpl extends CommunicationMediaImpl implements HwMedia {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected NFP_String description;

	/**
	 * The cached value of the '{@link #getP_HW_Services() <em>PHW Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_HW_Services()
	 * @generated
	 * @ordered
	 */
	protected EList p_HW_Services;

	/**
	 * The cached value of the '{@link #getR_HW_Services() <em>RHW Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR_HW_Services()
	 * @generated
	 * @ordered
	 */
	protected EList r_HW_Services;

	/**
	 * The cached value of the '{@link #getOwnedHW() <em>Owned HW</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedHW()
	 * @generated
	 * @ordered
	 */
	protected EList ownedHW;

	/**
	 * The cached value of the '{@link #getEndPoints() <em>End Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoints()
	 * @generated
	 * @ordered
	 */
	protected EList endPoints;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected NFP_Frequency frequency;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList operations;

	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList activities;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBandWidth() <em>Band Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandWidth()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataTxRate bandWidth;

	/**
	 * The cached value of the '{@link #getArbiters() <em>Arbiters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArbiters()
	 * @generated
	 * @ordered
	 */
	protected EList arbiters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwMediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwCommunicationPackage.Literals.HW_MEDIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(NFP_String newDescription, NotificationChain msgs) {
		NFP_String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwCommunicationPackage.HW_MEDIA__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(NFP_String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwCommunicationPackage.HW_MEDIA__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwCommunicationPackage.HW_MEDIA__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwCommunicationPackage.HW_MEDIA__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getP_HW_Services() {
		if (p_HW_Services == null) {
			p_HW_Services = new EObjectContainmentEList(HwResourceService.class, this, HwCommunicationPackage.HW_MEDIA__PHW_SERVICES);
		}
		return p_HW_Services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getR_HW_Services() {
		if (r_HW_Services == null) {
			r_HW_Services = new EObjectResolvingEList(HwResourceService.class, this, HwCommunicationPackage.HW_MEDIA__RHW_SERVICES);
		}
		return r_HW_Services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedHW() {
		if (ownedHW == null) {
			ownedHW = new EObjectContainmentEList(HwResource.class, this, HwCommunicationPackage.HW_MEDIA__OWNED_HW);
		}
		return ownedHW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEndPoints() {
		if (endPoints == null) {
			endPoints = new EObjectContainmentEList(HwEndPoint.class, this, HwCommunicationPackage.HW_MEDIA__END_POINTS);
		}
		return endPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Frequency getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequency(NFP_Frequency newFrequency, NotificationChain msgs) {
		NFP_Frequency oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwCommunicationPackage.HW_MEDIA__FREQUENCY, oldFrequency, newFrequency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(NFP_Frequency newFrequency) {
		if (newFrequency != frequency) {
			NotificationChain msgs = null;
			if (frequency != null)
				msgs = ((InternalEObject)frequency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwCommunicationPackage.HW_MEDIA__FREQUENCY, null, msgs);
			if (newFrequency != null)
				msgs = ((InternalEObject)newFrequency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwCommunicationPackage.HW_MEDIA__FREQUENCY, null, msgs);
			msgs = basicSetFrequency(newFrequency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwCommunicationPackage.HW_MEDIA__FREQUENCY, newFrequency, newFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList(Operation.class, this, HwCommunicationPackage.HW_MEDIA__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList(Activity.class, this, HwCommunicationPackage.HW_MEDIA__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwCommunicationPackage.HW_MEDIA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataTxRate getBandWidth() {
		return bandWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBandWidth(NFP_DataTxRate newBandWidth, NotificationChain msgs) {
		NFP_DataTxRate oldBandWidth = bandWidth;
		bandWidth = newBandWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwCommunicationPackage.HW_MEDIA__BAND_WIDTH, oldBandWidth, newBandWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandWidth(NFP_DataTxRate newBandWidth) {
		if (newBandWidth != bandWidth) {
			NotificationChain msgs = null;
			if (bandWidth != null)
				msgs = ((InternalEObject)bandWidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwCommunicationPackage.HW_MEDIA__BAND_WIDTH, null, msgs);
			if (newBandWidth != null)
				msgs = ((InternalEObject)newBandWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwCommunicationPackage.HW_MEDIA__BAND_WIDTH, null, msgs);
			msgs = basicSetBandWidth(newBandWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwCommunicationPackage.HW_MEDIA__BAND_WIDTH, newBandWidth, newBandWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArbiters() {
		if (arbiters == null) {
			arbiters = new EObjectWithInverseResolvingEList.ManyInverse(HwArbiter.class, this, HwCommunicationPackage.HW_MEDIA__ARBITERS, HwCommunicationPackage.HW_ARBITER__CONTROLLED_MEDIAS);
		}
		return arbiters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwCommunicationPackage.HW_MEDIA__ARBITERS:
				return ((InternalEList)getArbiters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwCommunicationPackage.HW_MEDIA__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case HwCommunicationPackage.HW_MEDIA__PHW_SERVICES:
				return ((InternalEList)getP_HW_Services()).basicRemove(otherEnd, msgs);
			case HwCommunicationPackage.HW_MEDIA__OWNED_HW:
				return ((InternalEList)getOwnedHW()).basicRemove(otherEnd, msgs);
			case HwCommunicationPackage.HW_MEDIA__END_POINTS:
				return ((InternalEList)getEndPoints()).basicRemove(otherEnd, msgs);
			case HwCommunicationPackage.HW_MEDIA__FREQUENCY:
				return basicSetFrequency(null, msgs);
			case HwCommunicationPackage.HW_MEDIA__OPERATIONS:
				return ((InternalEList)getOperations()).basicRemove(otherEnd, msgs);
			case HwCommunicationPackage.HW_MEDIA__ACTIVITIES:
				return ((InternalEList)getActivities()).basicRemove(otherEnd, msgs);
			case HwCommunicationPackage.HW_MEDIA__BAND_WIDTH:
				return basicSetBandWidth(null, msgs);
			case HwCommunicationPackage.HW_MEDIA__ARBITERS:
				return ((InternalEList)getArbiters()).basicRemove(otherEnd, msgs);
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
			case HwCommunicationPackage.HW_MEDIA__DESCRIPTION:
				return getDescription();
			case HwCommunicationPackage.HW_MEDIA__PHW_SERVICES:
				return getP_HW_Services();
			case HwCommunicationPackage.HW_MEDIA__RHW_SERVICES:
				return getR_HW_Services();
			case HwCommunicationPackage.HW_MEDIA__OWNED_HW:
				return getOwnedHW();
			case HwCommunicationPackage.HW_MEDIA__END_POINTS:
				return getEndPoints();
			case HwCommunicationPackage.HW_MEDIA__FREQUENCY:
				return getFrequency();
			case HwCommunicationPackage.HW_MEDIA__OPERATIONS:
				return getOperations();
			case HwCommunicationPackage.HW_MEDIA__ACTIVITIES:
				return getActivities();
			case HwCommunicationPackage.HW_MEDIA__NAME:
				return getName();
			case HwCommunicationPackage.HW_MEDIA__BAND_WIDTH:
				return getBandWidth();
			case HwCommunicationPackage.HW_MEDIA__ARBITERS:
				return getArbiters();
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
			case HwCommunicationPackage.HW_MEDIA__DESCRIPTION:
				setDescription((NFP_String)newValue);
				return;
			case HwCommunicationPackage.HW_MEDIA__PHW_SERVICES:
				getP_HW_Services().clear();
				getP_HW_Services().addAll((Collection)newValue);
				return;
			case HwCommunicationPackage.HW_MEDIA__RHW_SERVICES:
				getR_HW_Services().clear();
				getR_HW_Services().addAll((Collection)newValue);
				return;
			case HwCommunicationPackage.HW_MEDIA__OWNED_HW:
				getOwnedHW().clear();
				getOwnedHW().addAll((Collection)newValue);
				return;
			case HwCommunicationPackage.HW_MEDIA__END_POINTS:
				getEndPoints().clear();
				getEndPoints().addAll((Collection)newValue);
				return;
			case HwCommunicationPackage.HW_MEDIA__FREQUENCY:
				setFrequency((NFP_Frequency)newValue);
				return;
			case HwCommunicationPackage.HW_MEDIA__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection)newValue);
				return;
			case HwCommunicationPackage.HW_MEDIA__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection)newValue);
				return;
			case HwCommunicationPackage.HW_MEDIA__NAME:
				setName((String)newValue);
				return;
			case HwCommunicationPackage.HW_MEDIA__BAND_WIDTH:
				setBandWidth((NFP_DataTxRate)newValue);
				return;
			case HwCommunicationPackage.HW_MEDIA__ARBITERS:
				getArbiters().clear();
				getArbiters().addAll((Collection)newValue);
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
			case HwCommunicationPackage.HW_MEDIA__DESCRIPTION:
				setDescription((NFP_String)null);
				return;
			case HwCommunicationPackage.HW_MEDIA__PHW_SERVICES:
				getP_HW_Services().clear();
				return;
			case HwCommunicationPackage.HW_MEDIA__RHW_SERVICES:
				getR_HW_Services().clear();
				return;
			case HwCommunicationPackage.HW_MEDIA__OWNED_HW:
				getOwnedHW().clear();
				return;
			case HwCommunicationPackage.HW_MEDIA__END_POINTS:
				getEndPoints().clear();
				return;
			case HwCommunicationPackage.HW_MEDIA__FREQUENCY:
				setFrequency((NFP_Frequency)null);
				return;
			case HwCommunicationPackage.HW_MEDIA__OPERATIONS:
				getOperations().clear();
				return;
			case HwCommunicationPackage.HW_MEDIA__ACTIVITIES:
				getActivities().clear();
				return;
			case HwCommunicationPackage.HW_MEDIA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HwCommunicationPackage.HW_MEDIA__BAND_WIDTH:
				setBandWidth((NFP_DataTxRate)null);
				return;
			case HwCommunicationPackage.HW_MEDIA__ARBITERS:
				getArbiters().clear();
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
			case HwCommunicationPackage.HW_MEDIA__DESCRIPTION:
				return description != null;
			case HwCommunicationPackage.HW_MEDIA__PHW_SERVICES:
				return p_HW_Services != null && !p_HW_Services.isEmpty();
			case HwCommunicationPackage.HW_MEDIA__RHW_SERVICES:
				return r_HW_Services != null && !r_HW_Services.isEmpty();
			case HwCommunicationPackage.HW_MEDIA__OWNED_HW:
				return ownedHW != null && !ownedHW.isEmpty();
			case HwCommunicationPackage.HW_MEDIA__END_POINTS:
				return endPoints != null && !endPoints.isEmpty();
			case HwCommunicationPackage.HW_MEDIA__FREQUENCY:
				return frequency != null;
			case HwCommunicationPackage.HW_MEDIA__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case HwCommunicationPackage.HW_MEDIA__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case HwCommunicationPackage.HW_MEDIA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HwCommunicationPackage.HW_MEDIA__BAND_WIDTH:
				return bandWidth != null;
			case HwCommunicationPackage.HW_MEDIA__ARBITERS:
				return arbiters != null && !arbiters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == HwResource.class) {
			switch (derivedFeatureID) {
				case HwCommunicationPackage.HW_MEDIA__DESCRIPTION: return HwGeneralPackage.HW_RESOURCE__DESCRIPTION;
				case HwCommunicationPackage.HW_MEDIA__PHW_SERVICES: return HwGeneralPackage.HW_RESOURCE__PHW_SERVICES;
				case HwCommunicationPackage.HW_MEDIA__RHW_SERVICES: return HwGeneralPackage.HW_RESOURCE__RHW_SERVICES;
				case HwCommunicationPackage.HW_MEDIA__OWNED_HW: return HwGeneralPackage.HW_RESOURCE__OWNED_HW;
				case HwCommunicationPackage.HW_MEDIA__END_POINTS: return HwGeneralPackage.HW_RESOURCE__END_POINTS;
				case HwCommunicationPackage.HW_MEDIA__FREQUENCY: return HwGeneralPackage.HW_RESOURCE__FREQUENCY;
				case HwCommunicationPackage.HW_MEDIA__OPERATIONS: return HwGeneralPackage.HW_RESOURCE__OPERATIONS;
				case HwCommunicationPackage.HW_MEDIA__ACTIVITIES: return HwGeneralPackage.HW_RESOURCE__ACTIVITIES;
				case HwCommunicationPackage.HW_MEDIA__NAME: return HwGeneralPackage.HW_RESOURCE__NAME;
				default: return -1;
			}
		}
		if (baseClass == HwCommunicationResource.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == HwResource.class) {
			switch (baseFeatureID) {
				case HwGeneralPackage.HW_RESOURCE__DESCRIPTION: return HwCommunicationPackage.HW_MEDIA__DESCRIPTION;
				case HwGeneralPackage.HW_RESOURCE__PHW_SERVICES: return HwCommunicationPackage.HW_MEDIA__PHW_SERVICES;
				case HwGeneralPackage.HW_RESOURCE__RHW_SERVICES: return HwCommunicationPackage.HW_MEDIA__RHW_SERVICES;
				case HwGeneralPackage.HW_RESOURCE__OWNED_HW: return HwCommunicationPackage.HW_MEDIA__OWNED_HW;
				case HwGeneralPackage.HW_RESOURCE__END_POINTS: return HwCommunicationPackage.HW_MEDIA__END_POINTS;
				case HwGeneralPackage.HW_RESOURCE__FREQUENCY: return HwCommunicationPackage.HW_MEDIA__FREQUENCY;
				case HwGeneralPackage.HW_RESOURCE__OPERATIONS: return HwCommunicationPackage.HW_MEDIA__OPERATIONS;
				case HwGeneralPackage.HW_RESOURCE__ACTIVITIES: return HwCommunicationPackage.HW_MEDIA__ACTIVITIES;
				case HwGeneralPackage.HW_RESOURCE__NAME: return HwCommunicationPackage.HW_MEDIA__NAME;
				default: return -1;
			}
		}
		if (baseClass == HwCommunicationResource.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //HwMediaImpl
