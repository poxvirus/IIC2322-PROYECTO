/* The following code was generated by JFlex 1.4.3 on 05-04-13 10:34 PM */

/* Fuentes usadas:
	Manual de jflex
	www.escet.urjc.es/.../Tema2-AnalizadorLexico-JFlex.pdf
	Ayudantia Compiladores
	Ejemplo proyecto
*/
package coolc.parser;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 05-04-13 10:34 PM from the specification file
 * <tt>cool.l</tt>
 */
public class Lexer implements Parser.Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\1\101\10\0\1\3\1\2\2\0\1\1\22\0\1\3\1\0\1\75"+
    "\5\0\1\62\1\63\1\60\1\57\1\71\1\54\1\72\1\61\1\102"+
    "\11\4\1\67\1\70\1\53\1\55\1\56\1\0\1\74\1\11\1\100"+
    "\1\13\1\15\1\17\1\21\1\7\1\23\1\25\2\7\1\27\1\7"+
    "\1\31\1\33\1\35\1\7\1\37\1\41\1\43\1\52\1\45\1\47"+
    "\3\7\1\64\1\76\1\50\1\0\1\6\1\0\1\10\1\77\1\12"+
    "\1\14\1\16\1\20\1\5\1\22\1\24\2\5\1\26\1\5\1\30"+
    "\1\32\1\34\1\5\1\36\1\40\1\42\1\51\1\44\1\46\3\5"+
    "\1\65\1\0\1\66\1\73\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\2\2\1\3\1\4\1\5\1\4\1\5"+
    "\1\4\1\5\1\4\1\5\1\4\1\5\1\4\1\5"+
    "\1\4\1\5\1\4\1\5\1\4\1\5\1\4\1\5"+
    "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\2\32\1\33"+
    "\1\1\4\34\1\35\2\4\2\5\2\4\2\5\1\4"+
    "\1\36\1\5\1\36\1\37\1\40\1\4\1\37\1\40"+
    "\1\5\2\4\2\5\2\4\2\5\2\41\1\4\1\5"+
    "\2\4\2\5\1\4\1\5\1\42\1\43\1\0\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\1\60\2\4\2\5\2\4\2\5"+
    "\1\4\1\5\2\4\2\5\1\61\1\4\1\61\1\5"+
    "\1\62\1\63\1\62\1\63\1\4\1\5\2\4\2\5"+
    "\1\4\1\5\1\64\1\65\1\4\1\65\1\5\1\66"+
    "\1\67\1\66\1\67\1\4\1\5\2\4\2\5\2\70"+
    "\1\4\1\5\1\71\1\72\1\71\1\72\1\4\1\5"+
    "\2\73\2\74\2\4\2\5\1\75\2\76\1\4\1\77"+
    "\1\5\1\77\1\4\1\5\2\100";

  private static int [] zzUnpackAction() {
    int [] result = new int[184];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\103\0\206\0\311\0\u010c\0\311\0\u014f\0\u0192"+
    "\0\u01d5\0\u0218\0\u025b\0\u029e\0\u02e1\0\u0324\0\u0367\0\u03aa"+
    "\0\u03ed\0\u0430\0\u0473\0\u04b6\0\u04f9\0\u053c\0\u057f\0\u05c2"+
    "\0\u0605\0\u0648\0\u068b\0\u06ce\0\u0711\0\311\0\u0754\0\u0797"+
    "\0\u07da\0\311\0\311\0\311\0\u081d\0\311\0\311\0\311"+
    "\0\311\0\311\0\311\0\311\0\311\0\311\0\311\0\311"+
    "\0\311\0\u0860\0\311\0\311\0\u08a3\0\311\0\u08e6\0\u0929"+
    "\0\u096c\0\u09af\0\u09f2\0\u0a35\0\u0a78\0\u0abb\0\u0afe\0\u0b41"+
    "\0\u0b84\0\u0bc7\0\u0c0a\0\u0192\0\u0c4d\0\u01d5\0\u0192\0\u0c90"+
    "\0\u0cd3\0\u01d5\0\u0d16\0\u0d59\0\u0d9c\0\u0ddf\0\u0e22\0\u0e65"+
    "\0\u0ea8\0\u0eeb\0\u0f2e\0\u0f71\0\u0192\0\u01d5\0\u0fb4\0\u0ff7"+
    "\0\u103a\0\u107d\0\u10c0\0\u1103\0\u1146\0\u1189\0\311\0\311"+
    "\0\u11cc\0\311\0\311\0\311\0\311\0\311\0\311\0\311"+
    "\0\311\0\311\0\311\0\311\0\311\0\311\0\u120f\0\u1252"+
    "\0\u1295\0\u12d8\0\u131b\0\u135e\0\u13a1\0\u13e4\0\u1427\0\u146a"+
    "\0\u14ad\0\u14f0\0\u1533\0\u1576\0\u0192\0\u15b9\0\u01d5\0\u15fc"+
    "\0\u0192\0\u0192\0\u01d5\0\u01d5\0\u163f\0\u1682\0\u16c5\0\u1708"+
    "\0\u174b\0\u178e\0\u17d1\0\u1814\0\311\0\u0192\0\u1857\0\u01d5"+
    "\0\u189a\0\u0192\0\u0192\0\u01d5\0\u01d5\0\u18dd\0\u1920\0\u1963"+
    "\0\u19a6\0\u19e9\0\u1a2c\0\u0192\0\u01d5\0\u1a6f\0\u1ab2\0\u0192"+
    "\0\u0192\0\u01d5\0\u01d5\0\u1af5\0\u1b38\0\u0192\0\u01d5\0\u0192"+
    "\0\u01d5\0\u1b7b\0\u1bbe\0\u1c01\0\u1c44\0\311\0\u0192\0\u01d5"+
    "\0\u1c87\0\u0192\0\u1cca\0\u01d5\0\u1d0d\0\u1d50\0\u0192\0\u01d5";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[184];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\2\6\1\7\1\10\1\4\1\11\1\10"+
    "\1\11\1\12\1\13\1\10\1\11\1\14\1\15\1\16"+
    "\1\17\1\10\1\11\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\10\1\11\1\10"+
    "\1\11\1\32\1\33\1\10\1\11\1\34\1\35\1\36"+
    "\1\10\1\11\1\37\1\40\1\41\1\4\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\1\60\1\4\1\10\1\11"+
    "\1\4\1\7\1\61\1\62\1\63\72\61\1\64\1\65"+
    "\4\61\1\66\1\67\56\66\1\70\1\66\1\71\20\66"+
    "\105\0\1\6\104\0\1\7\43\72\1\0\2\72\24\0"+
    "\2\72\1\0\1\7\4\0\44\10\1\0\2\10\24\0"+
    "\2\10\1\0\1\10\4\0\44\11\1\0\2\11\24\0"+
    "\2\11\1\0\1\11\4\0\4\10\2\73\14\10\2\74"+
    "\20\10\1\0\2\10\24\0\2\10\1\0\1\10\4\0"+
    "\4\11\2\75\14\11\2\76\20\11\1\0\2\11\24\0"+
    "\2\11\1\0\1\11\4\0\22\10\2\77\10\10\2\100"+
    "\6\10\1\0\2\10\24\0\2\10\1\0\1\10\4\0"+
    "\22\11\2\101\10\11\2\102\6\11\1\0\2\11\24\0"+
    "\2\11\1\0\1\11\4\0\4\10\2\103\12\10\2\104"+
    "\22\10\1\0\2\10\24\0\2\10\1\0\1\10\4\0"+
    "\4\11\2\105\12\11\2\106\22\11\1\0\2\11\24\0"+
    "\2\11\1\0\1\11\4\0\14\10\2\107\6\10\2\110"+
    "\6\10\2\111\6\10\1\0\2\10\24\0\2\10\1\0"+
    "\1\10\4\0\14\11\2\112\6\11\2\113\6\11\2\114"+
    "\6\11\1\0\2\11\24\0\2\11\1\0\1\11\4\0"+
    "\12\10\2\115\12\10\2\116\14\10\1\0\2\10\24\0"+
    "\2\10\1\0\1\10\4\0\12\11\2\117\12\11\2\120"+
    "\14\11\1\0\2\11\24\0\2\11\1\0\1\11\4\0"+
    "\12\10\2\121\12\10\2\122\14\10\1\0\2\10\24\0"+
    "\2\10\1\0\1\10\4\0\12\11\2\123\12\11\2\124"+
    "\14\11\1\0\2\11\24\0\2\11\1\0\1\11\4\0"+
    "\14\10\2\125\26\10\1\0\2\10\24\0\2\10\1\0"+
    "\1\10\4\0\14\11\2\126\26\11\1\0\2\11\24\0"+
    "\2\11\1\0\1\11\4\0\26\10\2\127\14\10\1\0"+
    "\2\10\24\0\2\10\1\0\1\10\4\0\26\11\2\130"+
    "\14\11\1\0\2\11\24\0\2\11\1\0\1\11\4\0"+
    "\16\10\2\131\12\10\2\132\10\10\1\0\2\10\24\0"+
    "\2\10\1\0\1\10\4\0\16\11\2\133\12\11\2\134"+
    "\10\11\1\0\2\11\24\0\2\11\1\0\1\11\4\0"+
    "\16\10\2\135\24\10\1\0\2\10\24\0\2\10\1\0"+
    "\1\10\4\0\16\11\2\136\24\11\1\0\2\11\24\0"+
    "\2\11\1\0\1\11\54\0\1\137\1\140\101\0\1\141"+
    "\104\0\1\142\104\0\1\143\24\0\1\63\100\0\2\144"+
    "\1\145\15\144\2\146\6\144\2\147\4\144\1\0\3\144"+
    "\2\150\31\144\1\151\1\152\2\153\1\154\3\0\1\66"+
    "\163\0\1\155\77\0\1\156\26\0\44\72\1\0\2\72"+
    "\24\0\2\72\1\0\1\72\4\0\34\10\2\157\6\10"+
    "\1\0\2\10\24\0\2\10\1\0\1\10\4\0\4\10"+
    "\2\160\36\10\1\0\2\10\24\0\2\10\1\0\1\10"+
    "\4\0\34\11\2\161\6\11\1\0\2\11\24\0\2\11"+
    "\1\0\1\11\4\0\4\11\2\162\36\11\1\0\2\11"+
    "\24\0\2\11\1\0\1\11\4\0\34\10\2\163\6\10"+
    "\1\0\2\10\24\0\2\10\1\0\1\10\4\0\4\10"+
    "\2\164\36\10\1\0\2\10\24\0\2\10\1\0\1\10"+
    "\4\0\34\11\2\165\6\11\1\0\2\11\24\0\2\11"+
    "\1\0\1\11\4\0\4\11\2\166\36\11\1\0\2\11"+
    "\24\0\2\11\1\0\1\11\4\0\22\10\2\167\20\10"+
    "\1\0\2\10\24\0\2\10\1\0\1\10\4\0\22\11"+
    "\2\170\20\11\1\0\2\11\24\0\2\11\1\0\1\11"+
    "\4\0\16\10\2\171\24\10\1\0\2\10\24\0\2\10"+
    "\1\0\1\10\4\0\40\10\2\172\2\10\1\0\2\10"+
    "\24\0\2\10\1\0\1\10\4\0\16\11\2\173\24\11"+
    "\1\0\2\11\24\0\2\11\1\0\1\11\4\0\40\11"+
    "\2\174\2\11\1\0\2\11\24\0\2\11\1\0\1\11"+
    "\4\0\36\10\2\175\4\10\1\0\2\10\24\0\2\10"+
    "\1\0\1\10\4\0\26\10\2\176\14\10\1\0\2\10"+
    "\24\0\2\10\1\0\1\10\4\0\36\11\2\177\4\11"+
    "\1\0\2\11\24\0\2\11\1\0\1\11\4\0\26\11"+
    "\2\200\14\11\1\0\2\11\24\0\2\11\1\0\1\11"+
    "\4\0\42\10\2\201\1\0\2\10\24\0\2\10\1\0"+
    "\1\10\4\0\36\10\2\202\4\10\1\0\2\10\24\0"+
    "\2\10\1\0\1\10\4\0\42\11\2\203\1\0\2\11"+
    "\24\0\2\11\1\0\1\11\4\0\36\11\2\204\4\11"+
    "\1\0\2\11\24\0\2\11\1\0\1\11\4\0\26\10"+
    "\2\205\14\10\1\0\2\10\24\0\2\10\1\0\1\10"+
    "\4\0\26\11\2\206\14\11\1\0\2\11\24\0\2\11"+
    "\1\0\1\11\4\0\12\10\2\207\30\10\1\0\2\10"+
    "\24\0\2\10\1\0\1\10\4\0\44\10\1\0\2\210"+
    "\24\0\2\10\1\0\1\10\4\0\12\11\2\211\30\11"+
    "\1\0\2\11\24\0\2\11\1\0\1\11\4\0\44\11"+
    "\1\0\2\212\24\0\2\11\1\0\1\11\4\0\20\10"+
    "\2\213\22\10\1\0\2\10\24\0\2\10\1\0\1\10"+
    "\4\0\20\11\2\214\22\11\1\0\2\11\24\0\2\11"+
    "\1\0\1\11\2\141\1\215\100\141\4\0\12\10\2\216"+
    "\30\10\1\0\2\10\24\0\2\10\1\0\1\10\4\0"+
    "\34\10\2\217\6\10\1\0\2\10\24\0\2\10\1\0"+
    "\1\10\4\0\12\11\2\220\30\11\1\0\2\11\24\0"+
    "\2\11\1\0\1\11\4\0\34\11\2\221\6\11\1\0"+
    "\2\11\24\0\2\11\1\0\1\11\4\0\12\10\2\222"+
    "\30\10\1\0\2\10\24\0\2\10\1\0\1\10\4\0"+
    "\6\10\2\223\34\10\1\0\2\10\24\0\2\10\1\0"+
    "\1\10\4\0\12\11\2\224\30\11\1\0\2\11\24\0"+
    "\2\11\1\0\1\11\4\0\6\11\2\225\34\11\1\0"+
    "\2\11\24\0\2\11\1\0\1\11\4\0\34\10\2\226"+
    "\6\10\1\0\2\10\24\0\2\10\1\0\1\10\4\0"+
    "\34\11\2\227\6\11\1\0\2\11\24\0\2\11\1\0"+
    "\1\11\4\0\12\10\2\230\30\10\1\0\2\10\24\0"+
    "\2\10\1\0\1\10\4\0\26\10\2\231\14\10\1\0"+
    "\2\10\24\0\2\10\1\0\1\10\4\0\12\11\2\232"+
    "\30\11\1\0\2\11\24\0\2\11\1\0\1\11\4\0"+
    "\26\11\2\233\14\11\1\0\2\11\24\0\2\11\1\0"+
    "\1\11\4\0\30\10\2\234\12\10\1\0\2\10\24\0"+
    "\2\10\1\0\1\10\4\0\30\11\2\235\12\11\1\0"+
    "\2\11\24\0\2\11\1\0\1\11\4\0\22\10\2\236"+
    "\20\10\1\0\2\10\24\0\2\10\1\0\1\10\4\0"+
    "\22\11\2\237\20\11\1\0\2\11\24\0\2\11\1\0"+
    "\1\11\4\0\24\10\2\240\16\10\1\0\2\10\24\0"+
    "\2\10\1\0\1\10\4\0\12\10\2\241\30\10\1\0"+
    "\2\10\24\0\2\10\1\0\1\10\4\0\24\11\2\242"+
    "\16\11\1\0\2\11\24\0\2\11\1\0\1\11\4\0"+
    "\12\11\2\243\30\11\1\0\2\11\24\0\2\11\1\0"+
    "\1\11\4\0\22\10\2\244\20\10\1\0\2\10\24\0"+
    "\2\10\1\0\1\10\4\0\22\11\2\245\20\11\1\0"+
    "\2\11\24\0\2\11\1\0\1\11\4\0\34\10\2\246"+
    "\6\10\1\0\2\10\24\0\2\10\1\0\1\10\4\0"+
    "\34\11\2\247\6\11\1\0\2\11\24\0\2\11\1\0"+
    "\1\11\4\0\12\10\2\250\30\10\1\0\2\10\24\0"+
    "\2\10\1\0\1\10\4\0\12\11\2\251\30\11\1\0"+
    "\2\11\24\0\2\11\1\0\1\11\4\0\32\10\2\252"+
    "\10\10\1\0\2\10\24\0\2\10\1\0\1\10\4\0"+
    "\20\10\2\253\22\10\1\0\2\10\24\0\2\10\1\0"+
    "\1\10\4\0\32\11\2\254\10\11\1\0\2\11\24\0"+
    "\2\11\1\0\1\11\4\0\20\11\2\255\22\11\1\0"+
    "\2\11\24\0\2\11\1\0\1\11\4\0\44\10\1\256"+
    "\2\10\24\0\2\10\1\0\1\10\4\0\44\11\1\256"+
    "\2\11\24\0\2\11\1\0\1\11\4\0\12\10\2\257"+
    "\30\10\1\0\2\10\24\0\2\10\1\0\1\10\4\0"+
    "\12\11\2\260\30\11\1\0\2\11\24\0\2\11\1\0"+
    "\1\11\4\0\20\10\2\261\22\10\1\0\2\10\24\0"+
    "\2\10\1\0\1\10\4\0\10\10\2\262\32\10\1\0"+
    "\2\10\24\0\2\10\1\0\1\10\4\0\20\11\2\263"+
    "\22\11\1\0\2\11\24\0\2\11\1\0\1\11\4\0"+
    "\10\11\2\264\32\11\1\0\2\11\24\0\2\11\1\0"+
    "\1\11\4\0\36\10\2\265\4\10\1\0\2\10\24\0"+
    "\2\10\1\0\1\10\4\0\36\11\2\266\4\11\1\0"+
    "\2\11\24\0\2\11\1\0\1\11\4\0\34\10\2\267"+
    "\6\10\1\0\2\10\24\0\2\10\1\0\1\10\4\0"+
    "\34\11\2\270\6\11\1\0\2\11\24\0\2\11\1\0"+
    "\1\11";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7571];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\1\1\1\11\27\1\1\11\3\1\3\11"+
    "\1\1\14\11\1\1\2\11\1\1\1\11\50\1\2\11"+
    "\1\0\15\11\36\1\1\11\40\1\1\11\12\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[184];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

    private int commentLevel = 0;

    private int yylIntVal;
    
    private String yylStrVal;

    public Object getLVal(){
        return yylStrVal;
    }

    public int getLIntVal() {
        return yylIntVal;
    }
    
    public String getLStrVal(){
        return yylStrVal;
    }

    public Position getStartPos() {
        return new Position(yyline, yycolumn);
    }

    public Position getEndPos() {
        return new Position(yyline, yycolumn);
    }

    public void yyerror(String msg) {
        System.err.printf("%2d:%2d :: Error<%s>\n", yyline, yycolumn, msg);
    }



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 170) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 59: 
          { return Parser.CLASS;
          }
        case 65: break;
        case 43: 
          { yylStrVal += "\"";
          }
        case 66: break;
        case 26: 
          { yyerror("String ilegal, falta un \\ final para saltar de linea");
          }
        case 67: break;
        case 51: 
          { return Parser.NOT;
          }
        case 68: break;
        case 62: 
          { return Parser.WHILE;
          }
        case 69: break;
        case 56: 
          { return Parser.LOOP;
          }
        case 70: break;
        case 17: 
          { return Parser.T_RCURLY;
          }
        case 71: break;
        case 16: 
          { return Parser.T_LCURLY;
          }
        case 72: break;
        case 40: 
          { yylStrVal += "\f";
          }
        case 73: break;
        case 48: 
          { commentLevel++;
          }
        case 74: break;
        case 35: 
          { return Parser.T_MOREEQ;
          }
        case 75: break;
        case 39: 
          { /* no pone nada */
          }
        case 76: break;
        case 11: 
          { return Parser.T_MULTI;
          }
        case 77: break;
        case 25: 
          { yylStrVal += yytext();
          }
        case 78: break;
        case 41: 
          { yylStrVal += "\n";
          }
        case 79: break;
        case 50: 
          { return Parser.NEW;
          }
        case 80: break;
        case 64: 
          { return Parser.INHERITS;
          }
        case 81: break;
        case 36: 
          { return Parser.T_SET;
          }
        case 82: break;
        case 22: 
          { return Parser.T_TILDE;
          }
        case 83: break;
        case 61: 
          { return Parser.POOL;
          }
        case 84: break;
        case 9: 
          { return Parser.T_EQ;
          }
        case 85: break;
        case 44: 
          { yylStrVal += "\\";
          }
        case 86: break;
        case 34: 
          { return Parser.T_ASSIGN;
          }
        case 87: break;
        case 8: 
          { return Parser.T_LESS;
          }
        case 88: break;
        case 31: 
          { return Parser.IF;
          }
        case 89: break;
        case 49: 
          { return Parser.LET;
          }
        case 90: break;
        case 2: 
          { // ignoramos el espacio en blanco
          }
        case 91: break;
        case 4: 
          { yylStrVal = yytext();
                       return Parser.ID;
          }
        case 92: break;
        case 1: 
          { System.out.printf("Unknown character [%s]\n", yytext());
                       return Parser.T_UNKNOWN;
          }
        case 93: break;
        case 28: 
          { /* Comentario */
          }
        case 94: break;
        case 55: 
          { return Parser.ESAC;
          }
        case 95: break;
        case 20: 
          { return Parser.T_COMMA;
          }
        case 96: break;
        case 42: 
          { yylStrVal += "\t";
          }
        case 97: break;
        case 19: 
          { return Parser.T_SEMICOLON;
          }
        case 98: break;
        case 46: 
          { yyerror("String ilegal, no puede ir un backslah 0");
          }
        case 99: break;
        case 63: 
          { return Parser.ISVOID;
          }
        case 100: break;
        case 45: 
          { yylStrVal += "\b";
          }
        case 101: break;
        case 18: 
          { return Parser.T_COLON;
          }
        case 102: break;
        case 47: 
          { commentLevel--;
                       if(commentLevel == 0)
                       {
                           yybegin(YYINITIAL);
                       }
          }
        case 103: break;
        case 12: 
          { return Parser.T_DIVIDE;
          }
        case 104: break;
        case 13: 
          { return Parser.T_LPAREN;
          }
        case 105: break;
        case 33: 
          { return Parser.OF;
          }
        case 106: break;
        case 14: 
          { return Parser.T_RPAREN;
          }
        case 107: break;
        case 27: 
          { yybegin(YYINITIAL);
                        return Parser.STRING;
          }
        case 108: break;
        case 24: 
          { yylStrVal = ""; yybegin(STRING);
          }
        case 109: break;
        case 52: 
          { /* Es un comentario */
          }
        case 110: break;
        case 30: 
          { return Parser.FI;
          }
        case 111: break;
        case 32: 
          { return Parser.IN;
          }
        case 112: break;
        case 23: 
          { return Parser.T_AT;
          }
        case 113: break;
        case 58: 
          { yylStrVal = "True";
                       return Parser.BOOLEAN;
          }
        case 114: break;
        case 38: 
          { yylStrVal += yytext().replace("\\", "");
          }
        case 115: break;
        case 29: 
          { yyerror("Identificador ilegal, no puede empezar con un numero.");
          }
        case 116: break;
        case 57: 
          { return Parser.THEN;
          }
        case 117: break;
        case 37: 
          { commentLevel++;
                       yybegin(COMMENT);
          }
        case 118: break;
        case 3: 
          { yylIntVal = Integer.parseInt(yytext());
                       return Parser.INT;
          }
        case 119: break;
        case 54: 
          { return Parser.ELSE;
          }
        case 120: break;
        case 7: 
          { return Parser.T_MORE;
          }
        case 121: break;
        case 53: 
          { return Parser.CASE;
          }
        case 122: break;
        case 21: 
          { return Parser.T_DOT;
          }
        case 123: break;
        case 10: 
          { return Parser.T_PLUS;
          }
        case 124: break;
        case 60: 
          { yylStrVal = "False";
                       return Parser.BOOLEAN;
          }
        case 125: break;
        case 6: 
          { return Parser.T_RBRACE;
          }
        case 126: break;
        case 5: 
          { yylStrVal = yytext();
                       return Parser.TYPE;
          }
        case 127: break;
        case 15: 
          { return Parser.T_LBRACE;
          }
        case 128: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              {
                return Parser.EOF;
              }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
