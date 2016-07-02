package jp.ac.jaist.kslab.sb.marte.spec.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import jp.ac.jaist.kslab.sb.marte.spec.services.SpecDslGrammarAccess;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.Datasheet;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslBit;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslCallFunction;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDefineVariable;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDevice;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslFunction;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslMcu;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackage;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheral;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPin;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPort;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslProtocol;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRefVariable;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegister;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterRead;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterWrite;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslReturn;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslType;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslTypedParameter;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslVariable;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.Import;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBitAccess;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBlockExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalBlockExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalUnaryExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XDoWhileExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XForExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XIfExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XParamVariableAccess;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XRegisterAccess;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XVariableAccess;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XWhileExpression;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractSpecDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected SpecDslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SpecDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SpecDslPackage.DATASHEET:
				if(context == grammarAccess.getDatasheetRule() ||
				   context == grammarAccess.getModelRule()) {
					sequence_Datasheet(context, (Datasheet) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_BIT:
				if(context == grammarAccess.getDslBitRule()) {
					sequence_DslBit(context, (DslBit) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_CALL_FUNCTION:
				if(context == grammarAccess.getDslCallFunctionRule() ||
				   context == grammarAccess.getDslExpressionRule() ||
				   context == grammarAccess.getDslPeripheralExpressionRule()) {
					sequence_DslCallFunction(context, (DslCallFunction) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_DEFINE_VARIABLE:
				if(context == grammarAccess.getDslDefineVariableRule() ||
				   context == grammarAccess.getDslExpressionRule() ||
				   context == grammarAccess.getDslPeripheralExpressionRule()) {
					sequence_DslDefineVariable(context, (DslDefineVariable) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_DEVICE:
				if(context == grammarAccess.getDslComponentRule() ||
				   context == grammarAccess.getDslDeviceRule()) {
					sequence_DslDevice(context, (DslDevice) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_FUNCTION:
				if(context == grammarAccess.getDslFunctionRule()) {
					sequence_DslFunction(context, (DslFunction) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_MCU:
				if(context == grammarAccess.getDslComponentRule() ||
				   context == grammarAccess.getDslMcuRule()) {
					sequence_DslMcu(context, (DslMcu) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_OPERATION:
				if(context == grammarAccess.getDslOperationRule()) {
					sequence_DslOperation(context, (DslOperation) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_OPERATION_IMPL:
				if(context == grammarAccess.getDslOperationImplRule()) {
					sequence_DslOperationImpl(context, (DslOperationImpl) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_PACKAGE:
				if(context == grammarAccess.getDslPackageRule()) {
					sequence_DslPackage(context, (DslPackage) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_PACKAGE_PIN:
				if(context == grammarAccess.getDslPackagePinRule()) {
					sequence_DslPackagePin(context, (DslPackagePin) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_PERIPHERAL:
				if(context == grammarAccess.getDslPeripheralRule()) {
					sequence_DslPeripheral(context, (DslPeripheral) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_PIN:
				if(context == grammarAccess.getDslPinRule()) {
					sequence_DslPin(context, (DslPin) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_PORT:
				if(context == grammarAccess.getDslPortRule()) {
					sequence_DslPort(context, (DslPort) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_PROTOCOL:
				if(context == grammarAccess.getDslProtocolRule() ||
				   context == grammarAccess.getModelRule()) {
					sequence_DslProtocol(context, (DslProtocol) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_REF_VARIABLE:
				if(context == grammarAccess.getDslRefVariableRule()) {
					sequence_DslRefVariable(context, (DslRefVariable) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_REGISTER:
				if(context == grammarAccess.getDslRegisterRule()) {
					sequence_DslRegister(context, (DslRegister) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_REGISTER_READ:
				if(context == grammarAccess.getDslExpressionRule() ||
				   context == grammarAccess.getDslPeripheralExpressionRule() ||
				   context == grammarAccess.getDslRegisterReadRule()) {
					sequence_DslRegisterRead(context, (DslRegisterRead) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_REGISTER_WRITE:
				if(context == grammarAccess.getDslExpressionRule() ||
				   context == grammarAccess.getDslPeripheralExpressionRule() ||
				   context == grammarAccess.getDslRegisterWriteRule()) {
					sequence_DslRegisterWrite(context, (DslRegisterWrite) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_RETURN:
				if(context == grammarAccess.getDslExpressionRule() ||
				   context == grammarAccess.getDslPeripheralExpressionRule() ||
				   context == grammarAccess.getDslReturnRule()) {
					sequence_DslReturn(context, (DslReturn) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_TYPE:
				if(context == grammarAccess.getDslTypeRule()) {
					sequence_DslType(context, (DslType) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_TYPED_PARAMETER:
				if(context == grammarAccess.getDslTypedParameterRule()) {
					sequence_DslTypedParameter(context, (DslTypedParameter) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.DSL_VARIABLE:
				if(context == grammarAccess.getDslVariableRule()) {
					sequence_DslVariable(context, (DslVariable) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.XBINARY_EXPRESSION:
				if(context == grammarAccess.getDslExpressionRule() ||
				   context == grammarAccess.getDslPeripheralExpressionRule() ||
				   context == grammarAccess.getXBinaryExpressionRule()) {
					sequence_XBinaryExpression(context, (XBinaryExpression) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.XBIT_ACCESS:
				if(context == grammarAccess.getDslValueRule() ||
				   context == grammarAccess.getXBitAccessRule() ||
				   context == grammarAccess.getXBoolTypeRule() ||
				   context == grammarAccess.getXConditionalExpressionRule()) {
					sequence_XBitAccess(context, (XBitAccess) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.XBLOCK_EXPRESSION:
				if(context == grammarAccess.getDslExpressionRule() ||
				   context == grammarAccess.getDslPeripheralExpressionRule() ||
				   context == grammarAccess.getXBlockExpressionRule()) {
					sequence_XBlockExpression(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.XBOOL_EXPRESSION:
				if(context == grammarAccess.getXBoolExpressionRule() ||
				   context == grammarAccess.getXConditionalExpressionRule()) {
					sequence_XBoolExpression(context, (XBoolExpression) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.XCONDITIONAL_BLOCK_EXPRESSION:
				if(context == grammarAccess.getXConditionalBlockExpressionRule() ||
				   context == grammarAccess.getXConditionalExpressionRule()) {
					sequence_XConditionalBlockExpression(context, (XConditionalBlockExpression) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.XCONDITIONAL_UNARY_EXPRESSION:
				if(context == grammarAccess.getXConditionalExpressionRule() ||
				   context == grammarAccess.getXConditionalUnaryExpressionRule()) {
					sequence_XConditionalUnaryExpression(context, (XConditionalUnaryExpression) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.XDO_WHILE_EXPRESSION:
				if(context == grammarAccess.getDslExpressionRule() ||
				   context == grammarAccess.getDslPeripheralExpressionRule() ||
				   context == grammarAccess.getXDoWhileExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule()) {
					sequence_XDoWhileExpression(context, (XDoWhileExpression) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.XFOR_EXPRESSION:
				if(context == grammarAccess.getDslExpressionRule() ||
				   context == grammarAccess.getDslPeripheralExpressionRule() ||
				   context == grammarAccess.getXForExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule()) {
					sequence_XForExpression(context, (XForExpression) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.XIF_EXPRESSION:
				if(context == grammarAccess.getDslExpressionRule() ||
				   context == grammarAccess.getDslPeripheralExpressionRule() ||
				   context == grammarAccess.getXIfExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule()) {
					sequence_XIfExpression(context, (XIfExpression) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.XPARAM_VARIABLE_ACCESS:
				if(context == grammarAccess.getDslValueRule() ||
				   context == grammarAccess.getXBoolTypeRule() ||
				   context == grammarAccess.getXConditionalExpressionRule() ||
				   context == grammarAccess.getXParamVariableAccessRule()) {
					sequence_XParamVariableAccess(context, (XParamVariableAccess) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.XREGISTER_ACCESS:
				if(context == grammarAccess.getDslValueRule() ||
				   context == grammarAccess.getXBoolTypeRule() ||
				   context == grammarAccess.getXConditionalExpressionRule() ||
				   context == grammarAccess.getXRegisterAccessRule()) {
					sequence_XRegisterAccess(context, (XRegisterAccess) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.XVARIABLE_ACCESS:
				if(context == grammarAccess.getDslValueRule() ||
				   context == grammarAccess.getXBoolTypeRule() ||
				   context == grammarAccess.getXConditionalExpressionRule() ||
				   context == grammarAccess.getXVariableAccessRule()) {
					sequence_XVariableAccess(context, (XVariableAccess) semanticObject); 
					return; 
				}
				else break;
			case SpecDslPackage.XWHILE_EXPRESSION:
				if(context == grammarAccess.getDslExpressionRule() ||
				   context == grammarAccess.getDslPeripheralExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXWhileExpressionRule()) {
					sequence_XWhileExpression(context, (XWhileExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (revision=PackageName? name=ID imports+=Import* components+=DslComponent*)
	 */
	protected void sequence_Datasheet(EObject context, Datasheet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DslBit(EObject context, DslBit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.DSL_BIT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.DSL_BIT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDslBitAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variables=XBoolType? function=[DslOperation|QualifiedName] (params+=XConditionalExpression params+=XConditionalExpression*)?)
	 */
	protected void sequence_DslCallFunction(EObject context, DslCallFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID val=XBoolType?)
	 */
	protected void sequence_DslDefineVariable(EObject context, DslDefineVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         pins+=DslPin 
	 *         pins+=DslPin* 
	 *         ports+=DslPort* 
	 *         functions+=DslFunction* 
	 *         packages+=DslPackage* 
	 *         (registers+=DslRegister registers+=DslRegister*)?
	 *     )
	 */
	protected void sequence_DslDevice(EObject context, DslDevice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=DslType? name=ID (params+=DslTypedParameter params+=DslTypedParameter*)? expressions+=DslExpression*)
	 */
	protected void sequence_DslFunction(EObject context, DslFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         pins+=DslPin 
	 *         pins+=DslPin* 
	 *         ports+=DslPort* 
	 *         peripherals+=DslPeripheral* 
	 *         (sfr+=DslRegister sfr+=DslRegister*)? 
	 *         packages+=DslPackage*
	 *     )
	 */
	protected void sequence_DslMcu(EObject context, DslMcu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (rettype=DslType? implOperation=[DslOperation|ID] (params+=DslTypedParameter params+=DslTypedParameter*)? expression+=DslPeripheralExpression*)
	 */
	protected void sequence_DslOperationImpl(EObject context, DslOperationImpl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=DslType? name=ID (paramType+=DslType paramname+=ID (paramType+=DslType paramname+=ID)*)?)
	 */
	protected void sequence_DslOperation(EObject context, DslOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=PinName pinNo=PinName (altNames+=PinName altNames+=PinName*)?)
	 */
	protected void sequence_DslPackagePin(EObject context, DslPackagePin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (names+=ID names+=ID* pins+=DslPackagePin pins+=DslPackagePin*)
	 */
	protected void sequence_DslPackage(EObject context, DslPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID compliant+=[DslProtocol|ID] operations+=DslOperationImpl*)
	 */
	protected void sequence_DslPeripheral(EObject context, DslPeripheral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=PinName
	 */
	protected void sequence_DslPin(EObject context, DslPin semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.DSL_PIN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.DSL_PIN__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDslPinAccess().getNamePinNameParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (pins+=[DslPin|ID] pins+=[DslPin|ID]*)?)
	 */
	protected void sequence_DslPort(EObject context, DslPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName operations+=DslOperation*)
	 */
	protected void sequence_DslProtocol(EObject context, DslProtocol semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[DslVariable|ID]
	 */
	protected void sequence_DslRefVariable(EObject context, DslRefVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.DSL_REF_VARIABLE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.DSL_REF_VARIABLE__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDslRefVariableAccess().getRefDslVariableIDTerminalRuleCall_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ref=XBoolType var=XBoolType)
	 */
	protected void sequence_DslRegisterRead(EObject context, DslRegisterRead semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.DSL_REGISTER_READ__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.DSL_REGISTER_READ__REF));
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.DSL_REGISTER_READ__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.DSL_REGISTER_READ__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDslRegisterReadAccess().getRefXBoolTypeParserRuleCall_0_0(), semanticObject.getRef());
		feeder.accept(grammarAccess.getDslRegisterReadAccess().getVarXBoolTypeParserRuleCall_2_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ref=XBoolType var=DslValue)
	 */
	protected void sequence_DslRegisterWrite(EObject context, DslRegisterWrite semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.DSL_REGISTER_WRITE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.DSL_REGISTER_WRITE__REF));
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.DSL_REGISTER_WRITE__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.DSL_REGISTER_WRITE__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDslRegisterWriteAccess().getRefXBoolTypeParserRuleCall_0_0(), semanticObject.getRef());
		feeder.accept(grammarAccess.getDslRegisterWriteAccess().getVarDslValueParserRuleCall_2_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (address=HEX name=ID (bits+=DslBit? bits+=DslBit*)?)
	 */
	protected void sequence_DslRegister(EObject context, DslRegister semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     val=XBoolType
	 */
	protected void sequence_DslReturn(EObject context, DslReturn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.DSL_RETURN__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.DSL_RETURN__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDslReturnAccess().getValXBoolTypeParserRuleCall_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=DslCType
	 */
	protected void sequence_DslType(EObject context, DslType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.DSL_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.DSL_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDslTypeAccess().getTypeDslCTypeParserRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (paramType=DslType name=ID)
	 */
	protected void sequence_DslTypedParameter(EObject context, DslTypedParameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.DSL_TYPED_PARAMETER__PARAM_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.DSL_TYPED_PARAMETER__PARAM_TYPE));
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.DSL_TYPED_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.DSL_TYPED_PARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDslTypedParameterAccess().getParamTypeDslTypeParserRuleCall_0_0(), semanticObject.getParamType());
		feeder.accept(grammarAccess.getDslTypedParameterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     var=[DslDefineVariable|ID]
	 */
	protected void sequence_DslVariable(EObject context, DslVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.DSL_VARIABLE__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.DSL_VARIABLE__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDslVariableAccess().getVarDslDefineVariableIDTerminalRuleCall_0_1(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DslVariable op=XBinaryOperator right=DslExpression)
	 */
	protected void sequence_XBinaryExpression(EObject context, XBinaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.XBINARY_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.XBINARY_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.XBINARY_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.XBINARY_EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.XBINARY_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.XBINARY_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXBinaryExpressionAccess().getLeftDslVariableParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getXBinaryExpressionAccess().getOpXBinaryOperatorParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getXBinaryExpressionAccess().getRightDslExpressionParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     bit=[DslBit|QualifiedName]
	 */
	protected void sequence_XBitAccess(EObject context, XBitAccess semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.XBIT_ACCESS__BIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.XBIT_ACCESS__BIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXBitAccessAccess().getBitDslBitQualifiedNameParserRuleCall_1_0_1(), semanticObject.getBit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=DslExpression
	 */
	protected void sequence_XBlockExpression(EObject context, XBlockExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.XBLOCK_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.XBLOCK_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXBlockExpressionAccess().getExpressionDslExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=XBoolType op=XBoolOperation right=XConditionalExpression)
	 */
	protected void sequence_XBoolExpression(EObject context, XBoolExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.XBOOL_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.XBOOL_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.XBOOL_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.XBOOL_EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.XBOOL_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.XBOOL_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXBoolExpressionAccess().getLeftXBoolTypeParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getXBoolExpressionAccess().getOpXBoolOperationParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getXBoolExpressionAccess().getRightXConditionalExpressionParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=XConditionalExpression
	 */
	protected void sequence_XConditionalBlockExpression(EObject context, XConditionalBlockExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.XCONDITIONAL_BLOCK_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.XCONDITIONAL_BLOCK_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXConditionalBlockExpressionAccess().getExpressionXConditionalExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=XConditionalExpression
	 */
	protected void sequence_XConditionalUnaryExpression(EObject context, XConditionalUnaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.XCONDITIONAL_UNARY_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.XCONDITIONAL_UNARY_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXConditionalUnaryExpressionAccess().getExpressionXConditionalExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (body=DslExpression predicate=XConditionalExpression)
	 */
	protected void sequence_XDoWhileExpression(EObject context, XDoWhileExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.XDO_WHILE_EXPRESSION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.XDO_WHILE_EXPRESSION__BODY));
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.XDO_WHILE_EXPRESSION__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.XDO_WHILE_EXPRESSION__PREDICATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXDoWhileExpressionAccess().getBodyDslExpressionParserRuleCall_2_0(), semanticObject.getBody());
		feeder.accept(grammarAccess.getXDoWhileExpressionAccess().getPredicateXConditionalExpressionParserRuleCall_6_0(), semanticObject.getPredicate());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (init=DslExpression predicate=XConditionalExpression loop=DslExpression body=DslExpression?)
	 */
	protected void sequence_XForExpression(EObject context, XForExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (if=XConditionalExpression then=DslExpression else=DslExpression?)
	 */
	protected void sequence_XIfExpression(EObject context, XIfExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     var=[DslTypedParameter|ID]
	 */
	protected void sequence_XParamVariableAccess(EObject context, XParamVariableAccess semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.XPARAM_VARIABLE_ACCESS__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.XPARAM_VARIABLE_ACCESS__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXParamVariableAccessAccess().getVarDslTypedParameterIDTerminalRuleCall_1_0_1(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     reg=[DslRegister|ID]
	 */
	protected void sequence_XRegisterAccess(EObject context, XRegisterAccess semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.XREGISTER_ACCESS__REG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.XREGISTER_ACCESS__REG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXRegisterAccessAccess().getRegDslRegisterIDTerminalRuleCall_1_0_1(), semanticObject.getReg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     var=[DslDefineVariable|ID]
	 */
	protected void sequence_XVariableAccess(EObject context, XVariableAccess semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecDslPackage.Literals.XVARIABLE_ACCESS__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecDslPackage.Literals.XVARIABLE_ACCESS__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXVariableAccessAccess().getVarDslDefineVariableIDTerminalRuleCall_0_1(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (predicate=XConditionalExpression body=DslExpression?)
	 */
	protected void sequence_XWhileExpression(EObject context, XWhileExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
