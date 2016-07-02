package jp.ac.jaist.kslab.sb.marte.spec.serializer;

import com.google.inject.Inject;
import java.util.List;
import jp.ac.jaist.kslab.sb.marte.spec.services.SpecDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractSpecDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SpecDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DslRegister_CommaKeyword_3_2_0_a;
	protected AbstractElementAlias match_DslRegister_CommaKeyword_3_2_0_p;
	protected AbstractElementAlias match_DslRegister___LeftCurlyBracketKeyword_3_0_CommaKeyword_3_2_0_a_RightCurlyBracketKeyword_3_3__q;
	protected AbstractElementAlias match_DslValue_BINARYTerminalRuleCall_1_or_HEXTerminalRuleCall_0_or_INTTerminalRuleCall_2;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SpecDslGrammarAccess) access;
		match_DslRegister_CommaKeyword_3_2_0_a = new TokenAlias(true, true, grammarAccess.getDslRegisterAccess().getCommaKeyword_3_2_0());
		match_DslRegister_CommaKeyword_3_2_0_p = new TokenAlias(true, false, grammarAccess.getDslRegisterAccess().getCommaKeyword_3_2_0());
		match_DslRegister___LeftCurlyBracketKeyword_3_0_CommaKeyword_3_2_0_a_RightCurlyBracketKeyword_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDslRegisterAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(true, true, grammarAccess.getDslRegisterAccess().getCommaKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getDslRegisterAccess().getRightCurlyBracketKeyword_3_3()));
		match_DslValue_BINARYTerminalRuleCall_1_or_HEXTerminalRuleCall_0_or_INTTerminalRuleCall_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDslValueAccess().getBINARYTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getDslValueAccess().getHEXTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getDslValueAccess().getINTTerminalRuleCall_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getBINARYRule())
			return getBINARYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getHEXRule())
			return getHEXToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getXLiteralRule())
			return getXLiteralToken(semanticObject, ruleCall, node);
		return "";
	}
	
	protected String getBINARYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "0b";
	}
	protected String getHEXToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "0x";
	}
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	protected String getXLiteralToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "0b";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_DslRegister_CommaKeyword_3_2_0_a.equals(syntax))
				emit_DslRegister_CommaKeyword_3_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DslRegister_CommaKeyword_3_2_0_p.equals(syntax))
				emit_DslRegister_CommaKeyword_3_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DslRegister___LeftCurlyBracketKeyword_3_0_CommaKeyword_3_2_0_a_RightCurlyBracketKeyword_3_3__q.equals(syntax))
				emit_DslRegister___LeftCurlyBracketKeyword_3_0_CommaKeyword_3_2_0_a_RightCurlyBracketKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DslValue_BINARYTerminalRuleCall_1_or_HEXTerminalRuleCall_0_or_INTTerminalRuleCall_2.equals(syntax))
				emit_DslValue_BINARYTerminalRuleCall_1_or_HEXTerminalRuleCall_0_or_INTTerminalRuleCall_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','*
	 */
	protected void emit_DslRegister_CommaKeyword_3_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','+
	 */
	protected void emit_DslRegister_CommaKeyword_3_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' ','* '}')?
	 */
	protected void emit_DslRegister___LeftCurlyBracketKeyword_3_0_CommaKeyword_3_2_0_a_RightCurlyBracketKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     INT | HEX | BINARY
	 */
	protected void emit_DslValue_BINARYTerminalRuleCall_1_or_HEXTerminalRuleCall_0_or_INTTerminalRuleCall_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
