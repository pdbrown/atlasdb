// Generated from /Volumes/git/atlasdb-2/atlasdb-sql/src/main/antlr4/com/palantir/atlasdb/sql/grammar/AtlasSQLParser.g4 by ANTLR 4.5
package com.palantir.atlasdb.sql.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AtlasSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, STAR=3, WHERE=4, AND=5, OR=6, XOR=7, IS=8, NULL=9, LIKE=10, 
		IN=11, EXISTS=12, ALL=13, ANY=14, TRUE=15, FALSE=16, DIVIDE=17, MOD=18, 
		BETWEEN=19, REGEXP=20, PLUS=21, MINUS=22, NEGATION=23, VERTBAR=24, BITAND=25, 
		POWER_OP=26, BINARY=27, SHIFT_LEFT=28, SHIFT_RIGHT=29, ESCAPE=30, RPAREN=31, 
		LPAREN=32, RBRACK=33, LBRACK=34, COLON=35, ALL_FIELDS=36, EQ=37, LTH=38, 
		GTH=39, NOT_EQ=40, NOT=41, LET=42, GET=43, SEMI=44, COMMA=45, DOT=46, 
		COLLATE=47, INNER=48, OUTER=49, JOIN=50, CROSS=51, USING=52, INDEX=53, 
		KEY=54, ORDER=55, GROUP=56, BY=57, FOR=58, USE=59, IGNORE=60, PARTITION=61, 
		STRAIGHT_JOIN=62, NATURAL=63, LEFT=64, RIGHT=65, OJ=66, ON=67, ID=68, 
		INT=69, NEWLINE=70, WS=71, USER_VAR=72;
	public static final int
		RULE_select_clause = 0, RULE_table_name = 1, RULE_column_clause = 2, RULE_all_columns = 3, 
		RULE_column_list = 4, RULE_column_name = 5, RULE_where_clause = 6, RULE_expression = 7, 
		RULE_simple_expression = 8, RULE_element = 9, RULE_right_element = 10, 
		RULE_left_element = 11, RULE_target_element = 12, RULE_relational_op = 13, 
		RULE_expr_op = 14, RULE_between_op = 15, RULE_is_or_is_not = 16;
	public static final String[] ruleNames = {
		"select_clause", "table_name", "column_clause", "all_columns", "column_list", 
		"column_name", "where_clause", "expression", "simple_expression", "element", 
		"right_element", "left_element", "target_element", "relational_op", "expr_op", 
		"between_op", "is_or_is_not"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'select'", "'from'", "'*'", "'where'", null, null, "'xor'", "'is'", 
		"'null'", "'like'", "'in'", "'exists'", "'all'", "'any'", "'true'", "'false'", 
		null, null, "'between'", "'regexp'", "'+'", "'-'", "'~'", "'|'", "'&'", 
		"'^'", "'binary'", "'<<'", "'>>'", "'escape'", "')'", "'('", "']'", "'['", 
		"':'", "'.*'", "'='", "'<'", "'>'", "'!='", "'not'", "'<='", "'>='", "';'", 
		"','", "'.'", "'collate'", "'inner'", "'outer'", "'join'", "'cross'", 
		"'using'", "'index'", "'key'", "'order'", "'group'", "'by'", "'for'", 
		"'use'", "'ignore'", "'partition'", "'straight_join'", "'natural'", "'left'", 
		"'right'", "'oj'", "'on'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "STAR", "WHERE", "AND", "OR", "XOR", "IS", "NULL", 
		"LIKE", "IN", "EXISTS", "ALL", "ANY", "TRUE", "FALSE", "DIVIDE", "MOD", 
		"BETWEEN", "REGEXP", "PLUS", "MINUS", "NEGATION", "VERTBAR", "BITAND", 
		"POWER_OP", "BINARY", "SHIFT_LEFT", "SHIFT_RIGHT", "ESCAPE", "RPAREN", 
		"LPAREN", "RBRACK", "LBRACK", "COLON", "ALL_FIELDS", "EQ", "LTH", "GTH", 
		"NOT_EQ", "NOT", "LET", "GET", "SEMI", "COMMA", "DOT", "COLLATE", "INNER", 
		"OUTER", "JOIN", "CROSS", "USING", "INDEX", "KEY", "ORDER", "GROUP", "BY", 
		"FOR", "USE", "IGNORE", "PARTITION", "STRAIGHT_JOIN", "NATURAL", "LEFT", 
		"RIGHT", "OJ", "ON", "ID", "INT", "NEWLINE", "WS", "USER_VAR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AtlasSQLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AtlasSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Select_clauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(AtlasSQLParser.SELECT, 0); }
		public Column_clauseContext column_clause() {
			return getRuleContext(Column_clauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AtlasSQLParser.FROM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_clause; }
	}

	public final Select_clauseContext select_clause() throws RecognitionException {
		Select_clauseContext _localctx = new Select_clauseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_select_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(SELECT);
			setState(35);
			column_clause();
			setState(36);
			match(FROM);
			setState(37);
			table_name();
			setState(39);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(38);
				where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AtlasSQLParser.ID, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_clauseContext extends ParserRuleContext {
		public All_columnsContext all_columns() {
			return getRuleContext(All_columnsContext.class,0);
		}
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Column_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_clause; }
	}

	public final Column_clauseContext column_clause() throws RecognitionException {
		Column_clauseContext _localctx = new Column_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_column_clause);
		try {
			setState(45);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				all_columns();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				column_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_columnsContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(AtlasSQLParser.STAR, 0); }
		public All_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_columns; }
	}

	public final All_columnsContext all_columns() throws RecognitionException {
		All_columnsContext _localctx = new All_columnsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_all_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(STAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_listContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AtlasSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AtlasSQLParser.COMMA, i);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			column_name();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(50);
				match(COMMA);
				setState(51);
				column_name();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AtlasSQLParser.ID, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(AtlasSQLParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(WHERE);
			setState(60);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public List<Expr_opContext> expr_op() {
			return getRuleContexts(Expr_opContext.class);
		}
		public Expr_opContext expr_op(int i) {
			return getRuleContext(Expr_opContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			simple_expression();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR) | (1L << NOT))) != 0)) {
				{
				{
				setState(63);
				expr_op();
				setState(64);
				simple_expression();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_expressionContext extends ParserRuleContext {
		public Left_elementContext left_element() {
			return getRuleContext(Left_elementContext.class,0);
		}
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public Right_elementContext right_element() {
			return getRuleContext(Right_elementContext.class,0);
		}
		public Target_elementContext target_element() {
			return getRuleContext(Target_elementContext.class,0);
		}
		public Between_opContext between_op() {
			return getRuleContext(Between_opContext.class,0);
		}
		public TerminalNode AND() { return getToken(AtlasSQLParser.AND, 0); }
		public Is_or_is_notContext is_or_is_not() {
			return getRuleContext(Is_or_is_notContext.class,0);
		}
		public TerminalNode NULL() { return getToken(AtlasSQLParser.NULL, 0); }
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simple_expression);
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				left_element();
				setState(72);
				relational_op();
				setState(73);
				right_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				target_element();
				setState(76);
				between_op();
				setState(77);
				left_element();
				setState(78);
				match(AND);
				setState(79);
				right_element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				target_element();
				setState(82);
				is_or_is_not();
				setState(83);
				match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode USER_VAR() { return getToken(AtlasSQLParser.USER_VAR, 0); }
		public TerminalNode ID() { return getToken(AtlasSQLParser.ID, 0); }
		public TerminalNode INT() { return getToken(AtlasSQLParser.INT, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_element);
		try {
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(USER_VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(89);
				match(VERTBAR);
				setState(90);
				match(ID);
				setState(91);
				match(VERTBAR);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				column_name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Right_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_element; }
	}

	public final Right_elementContext right_element() throws RecognitionException {
		Right_elementContext _localctx = new Right_elementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_right_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Left_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Left_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_element; }
	}

	public final Left_elementContext left_element() throws RecognitionException {
		Left_elementContext _localctx = new Left_elementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_left_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Target_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Target_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_element; }
	}

	public final Target_elementContext target_element() throws RecognitionException {
		Target_elementContext _localctx = new Target_elementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_target_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(AtlasSQLParser.EQ, 0); }
		public TerminalNode LTH() { return getToken(AtlasSQLParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(AtlasSQLParser.GTH, 0); }
		public TerminalNode NOT_EQ() { return getToken(AtlasSQLParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(AtlasSQLParser.LET, 0); }
		public TerminalNode GET() { return getToken(AtlasSQLParser.GET, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LTH) | (1L << GTH) | (1L << NOT_EQ) | (1L << LET) | (1L << GET))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(AtlasSQLParser.AND, 0); }
		public TerminalNode XOR() { return getToken(AtlasSQLParser.XOR, 0); }
		public TerminalNode OR() { return getToken(AtlasSQLParser.OR, 0); }
		public TerminalNode NOT() { return getToken(AtlasSQLParser.NOT, 0); }
		public Expr_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_op; }
	}

	public final Expr_opContext expr_op() throws RecognitionException {
		Expr_opContext _localctx = new Expr_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Between_opContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(AtlasSQLParser.BETWEEN, 0); }
		public Between_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_op; }
	}

	public final Between_opContext between_op() throws RecognitionException {
		Between_opContext _localctx = new Between_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_between_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(BETWEEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Is_or_is_notContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(AtlasSQLParser.IS, 0); }
		public TerminalNode NOT() { return getToken(AtlasSQLParser.NOT, 0); }
		public Is_or_is_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_or_is_not; }
	}

	public final Is_or_is_notContext is_or_is_not() throws RecognitionException {
		Is_or_is_notContext _localctx = new Is_or_is_notContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_is_or_is_not);
		try {
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(IS);
				setState(110);
				match(NOT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Jt\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\3\2\3\2"+
		"\3\2\3\2\3\2\5\2*\n\2\3\3\3\3\3\4\3\4\5\4\60\n\4\3\5\3\5\3\6\3\6\3\6\7"+
		"\6\67\n\6\f\6\16\6:\13\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tE\n\t"+
		"\f\t\16\tH\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\nX\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13a\n\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\5\22r\n\22"+
		"\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\4\4\2\'*,-\4"+
		"\2\7\t++m\2$\3\2\2\2\4+\3\2\2\2\6/\3\2\2\2\b\61\3\2\2\2\n\63\3\2\2\2\f"+
		";\3\2\2\2\16=\3\2\2\2\20@\3\2\2\2\22W\3\2\2\2\24`\3\2\2\2\26b\3\2\2\2"+
		"\30d\3\2\2\2\32f\3\2\2\2\34h\3\2\2\2\36j\3\2\2\2 l\3\2\2\2\"q\3\2\2\2"+
		"$%\7\3\2\2%&\5\6\4\2&\'\7\4\2\2\')\5\4\3\2(*\5\16\b\2)(\3\2\2\2)*\3\2"+
		"\2\2*\3\3\2\2\2+,\7F\2\2,\5\3\2\2\2-\60\5\b\5\2.\60\5\n\6\2/-\3\2\2\2"+
		"/.\3\2\2\2\60\7\3\2\2\2\61\62\7\5\2\2\62\t\3\2\2\2\638\5\f\7\2\64\65\7"+
		"/\2\2\65\67\5\f\7\2\66\64\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\13"+
		"\3\2\2\2:8\3\2\2\2;<\7F\2\2<\r\3\2\2\2=>\7\6\2\2>?\5\20\t\2?\17\3\2\2"+
		"\2@F\5\22\n\2AB\5\36\20\2BC\5\22\n\2CE\3\2\2\2DA\3\2\2\2EH\3\2\2\2FD\3"+
		"\2\2\2FG\3\2\2\2G\21\3\2\2\2HF\3\2\2\2IJ\5\30\r\2JK\5\34\17\2KL\5\26\f"+
		"\2LX\3\2\2\2MN\5\32\16\2NO\5 \21\2OP\5\30\r\2PQ\7\7\2\2QR\5\26\f\2RX\3"+
		"\2\2\2ST\5\32\16\2TU\5\"\22\2UV\7\13\2\2VX\3\2\2\2WI\3\2\2\2WM\3\2\2\2"+
		"WS\3\2\2\2X\23\3\2\2\2Ya\7J\2\2Za\7F\2\2[\\\7\32\2\2\\]\7F\2\2]a\7\32"+
		"\2\2^a\7G\2\2_a\5\f\7\2`Y\3\2\2\2`Z\3\2\2\2`[\3\2\2\2`^\3\2\2\2`_\3\2"+
		"\2\2a\25\3\2\2\2bc\5\24\13\2c\27\3\2\2\2de\5\24\13\2e\31\3\2\2\2fg\5\24"+
		"\13\2g\33\3\2\2\2hi\t\2\2\2i\35\3\2\2\2jk\t\3\2\2k\37\3\2\2\2lm\7\25\2"+
		"\2m!\3\2\2\2nr\7\n\2\2op\7\n\2\2pr\7+\2\2qn\3\2\2\2qo\3\2\2\2r#\3\2\2"+
		"\2\t)/8FW`q";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}