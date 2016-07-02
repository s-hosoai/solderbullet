/**
 */
package MARTE_Library.BasicNFP_Types.impl;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;
import MARTE_Library.BasicNFP_Types.DirectionKind;
import MARTE_Library.BasicNFP_Types.NFP_CommonType;
import MARTE_Library.BasicNFP_Types.SourceKind;
import MARTE_Library.BasicNFP_Types.StatisticalQualifierKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NFP Common Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.NFP_CommonTypeImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.NFP_CommonTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.NFP_CommonTypeImpl#getStatQ <em>Stat Q</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.NFP_CommonTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.NFP_CommonTypeImpl#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NFP_CommonTypeImpl extends EObjectImpl implements NFP_CommonType {
	/**
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected Object expr;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final SourceKind SOURCE_EDEFAULT = SourceKind.EST;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SourceKind source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatQ() <em>Stat Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatQ()
	 * @generated
	 * @ordered
	 */
	protected static final StatisticalQualifierKind STAT_Q_EDEFAULT = StatisticalQualifierKind.MAX;

	/**
	 * The cached value of the '{@link #getStatQ() <em>Stat Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatQ()
	 * @generated
	 * @ordered
	 */
	protected StatisticalQualifierKind statQ = STAT_Q_EDEFAULT;

	/**
	 * The default value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionKind DIR_EDEFAULT = DirectionKind.INCR;

	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected DirectionKind dir = DIR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NFP_CommonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicNFP_TypesPackage.Literals.NFP_COMMON_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpr(Object newExpr) {
		Object oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.NFP_COMMON_TYPE__EXPR, oldExpr, expr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceKind getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SourceKind newSource) {
		SourceKind oldSource = source;
		source = newSource == null ? SOURCE_EDEFAULT : newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.NFP_COMMON_TYPE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticalQualifierKind getStatQ() {
		return statQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatQ(StatisticalQualifierKind newStatQ) {
		StatisticalQualifierKind oldStatQ = statQ;
		statQ = newStatQ == null ? STAT_Q_EDEFAULT : newStatQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.NFP_COMMON_TYPE__STAT_Q, oldStatQ, statQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionKind getDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDir(DirectionKind newDir) {
		DirectionKind oldDir = dir;
		dir = newDir == null ? DIR_EDEFAULT : newDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.NFP_COMMON_TYPE__DIR, oldDir, dir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMode() {
		if (mode == null) {
			mode = new EDataTypeEList<String>(String.class, this, BasicNFP_TypesPackage.NFP_COMMON_TYPE__MODE);
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void bernoulli(Object prob) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void binomial(Object prob, Object trials) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void exp(Object mean) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void gamma(Object k, Object mean) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void normal(Object mean, Object standDev) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void poisson(Object mean) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void uniform(Object min, Object max) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void gamma(int k, Object mean) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void geometric(Object p) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void triangular(Object min, Object max, Object mode) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void logarithmic(Object theta) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__EXPR:
				return getExpr();
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__SOURCE:
				return getSource();
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__STAT_Q:
				return getStatQ();
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__DIR:
				return getDir();
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__MODE:
				return getMode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__EXPR:
				setExpr(newValue);
				return;
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__SOURCE:
				setSource((SourceKind)newValue);
				return;
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__STAT_Q:
				setStatQ((StatisticalQualifierKind)newValue);
				return;
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__DIR:
				setDir((DirectionKind)newValue);
				return;
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__MODE:
				getMode().clear();
				getMode().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__EXPR:
				setExpr((Object)null);
				return;
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__STAT_Q:
				setStatQ(STAT_Q_EDEFAULT);
				return;
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__DIR:
				setDir(DIR_EDEFAULT);
				return;
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__MODE:
				getMode().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__EXPR:
				return expr != null;
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__SOURCE:
				return source != SOURCE_EDEFAULT;
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__STAT_Q:
				return statQ != STAT_Q_EDEFAULT;
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__DIR:
				return dir != DIR_EDEFAULT;
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE__MODE:
				return mode != null && !mode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (expr: ");
		result.append(expr);
		result.append(", source: ");
		result.append(source);
		result.append(", statQ: ");
		result.append(statQ);
		result.append(", dir: ");
		result.append(dir);
		result.append(", mode: ");
		result.append(mode);
		result.append(')');
		return result.toString();
	}

} //NFP_CommonTypeImpl
