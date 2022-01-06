
import java.util.StringTokenizer;

public class Methods {

    //method to convert char to morse code
    public static String charToMorseCode(char c) {
       
       String morse;
       c = Character.toLowerCase(c);
       
        if (c == 'a') {
            morse = "._";
        } else if (c == 'b') {
            morse = "_...";
        } else if (c == 'c') {
            morse = "_._.";
        } else if (c == 'd') {
            morse = "_..";
        } else if (c == 'e') {
            morse = ".";
        } else if (c == 'f') {
            morse = ".._.";
        } else if (c == 'g') {
            morse = "__.";
        } else if (c == 'h') {
            morse = "....";
        } else if (c == 'i') {
            morse = "..";
        } else if (c == 'j') {
            morse = ".___";
        } else if (c == 'k') {
            morse = "_._";
        } else if (c == 'l') {
            morse = "._..";
        } else if (c == 'm') {
            morse = "__";
        } else if (c == 'n') {
            morse = "_.";
        } else if (c == 'o') {
            morse = "___";
        } else if (c == 'p') {
            morse = ".__.";
        } else if (c == 'q') {
            morse = "__._";
        } else if (c == 'r') {
            morse = "._.";
        } else if (c == 's') {
            morse = "...";
        } else if (c == 't') {
            morse = "_";
        } else if (c == 'u') {
            morse = ".._";
        } else if (c == 'v') {
            morse = "..._";
        } else if (c == 'w') {
            morse = ".__";
        } else if (c == 'x') {
            morse = "_.._";
        } else if (c == 'y') {
            morse = "_.__";
        } else if (c == 'z') {
            morse = "__..";
        } else if (c == ' ') {
            morse = "/";
        } else {
            morse = "#";
        }
        return morse;
   }

    
    //method to convert morse code to chars
    public static char charFromMorseCode(String m) {
        if(m.equals("._")) {
            return 'a';
        } else if (m.equals("_...")) {
            return 'b';
        } else if (m.equals("_._.")) {
            return 'c';
        } else if (m.equals("_..")) {
            return 'd';
        } else if (m.equals(".")) {
            return 'e';
        } else if (m.equals(".._.")) {
            return 'f';
        } else if (m.equals("__.")) {
            return 'g';
        } else if (m.equals("....")) {
            return 'h';
        } else if (m.equals("..")) {
            return 'i';
        } else if (m.equals(".___")) {
            return 'j';
        } else if (m.equals("_._")) {
            return 'k';
        } else if (m.equals("._..")) {
            return 'l';
        } else if (m.equals("__")) {
            return 'm';
        } else if (m.equals("_.")) {
            return 'n';
        } else if (m.equals("___")) {
            return 'o';
        } else if (m.equals(".__.")) {
            return 'p';
        } else if (m.equals("__._")) {
            return 'q';
        } else if (m.equals("._.")) {
            return 'r';
        } else if (m.equals("...")) {
            return 's';
        } else if (m.equals("_")) {
            return 't';
        } else if (m.equals(".._")) {
            return 'u';
        } else if (m.equals("..._")) {
            return 'v';
        } else if (m.equals(".__")) {
            return 'w';
        } else if (m.equals("_.._")) {
            return 'x';
        } else if (m.equals("_.__")) {
            return 'y';
        } else if (m.equals("__..")) {
            return 'z';
        } else  if (m.equals("/")) {
            return ' ';
        } else {    
            return '#'; // unknown
        }
    }

    //Assert method to check if translation to morse code is correct
    public static void Assert(boolean b, String msg) {
        if (b != true) {
            System.out.println("Failed: " + msg);
        } else {
            System.out.println("Passed: " + msg);
        }
    }

    //mehtod to test assert method
    public static void testCharToMorse() {
        Assert(charToMorseCode('a').equals( "._"),   "charToMorseCode('a')");
        Assert(charToMorseCode('b').equals( "_..."), "charToMorseCode('b')");
        Assert(charToMorseCode('c').equals( "_._."), "charToMorseCode('c')");
        Assert(charToMorseCode('d').equals( "_.."),  "charToMorseCode('d')");
        Assert(charToMorseCode('e').equals( "."),    "charToMorseCode('e')");
        Assert(charToMorseCode('f').equals( ".._."), "charToMorseCode('f')");
        Assert(charToMorseCode('g').equals( "__."),  "charToMorseCode('g')");
        Assert(charToMorseCode('h').equals( "...."), "charToMorseCode('h')");
        Assert(charToMorseCode('i').equals( ".."),   "charToMorseCode('i')");
        Assert(charToMorseCode('j').equals( ".___"), "charToMorseCode('j')");
        Assert(charToMorseCode('k').equals( "_._"),  "charToMorseCode('k')");
        Assert(charToMorseCode('l').equals( "._.."), "charToMorseCode('l')");
        Assert(charToMorseCode('m').equals( "__"),   "charToMorseCode('m')");
        Assert(charToMorseCode('n').equals( "_."),   "charToMorseCode('n')");
        Assert(charToMorseCode('o').equals( "___"),  "charToMorseCode('o')");
        Assert(charToMorseCode('p').equals( ".__."), "charToMorseCode('p')");
        Assert(charToMorseCode('q').equals( "__._"), "charToMorseCode('q')");
        Assert(charToMorseCode('r').equals( "._."),  "charToMorseCode('r')");
        Assert(charToMorseCode('s').equals( "..."),  "charToMorseCode('s')");
        Assert(charToMorseCode('t').equals( "_"),    "charToMorseCode('t')");
        Assert(charToMorseCode('u').equals( ".._"),  "charToMorseCode('u')");
        Assert(charToMorseCode('v').equals( "..._"), "charToMorseCode('v')");
        Assert(charToMorseCode('w').equals( ".__"),  "charToMorseCode('w')");
        Assert(charToMorseCode('x').equals( "_.._"), "charToMorseCode('x')");
        Assert(charToMorseCode('y').equals( "_.__"), "charToMorseCode('y')");
        Assert(charToMorseCode('z').equals( "__.."), "charToMorseCode('z')");
        Assert(charToMorseCode(' ').equals( "/"),    "charToMorseCode(' ')");

        Assert(charToMorseCode('A').equals( "._"),   "charToMorseCode('A')");
        Assert(charToMorseCode('B').equals( "_..."), "charToMCodeorse('B')");
        Assert(charToMorseCode('C').equals( "_._."), "charToMorseCode('C')");
        Assert(charToMorseCode('D').equals( "_.."),  "charToMorseCode('D')");
        Assert(charToMorseCode('E').equals( "."),    "charToMorseCode('E')");
        Assert(charToMorseCode('F').equals( ".._."), "charToMorseCode('F')");
        Assert(charToMorseCode('G').equals( "__."),  "charToMorseCode('G')");
        Assert(charToMorseCode('H').equals( "...."), "charToMorseCode('H')");
        Assert(charToMorseCode('I').equals( ".."),   "charToMorseCode('I')");
        Assert(charToMorseCode('J').equals( ".___"), "charToMorseCode('J')");
        Assert(charToMorseCode('K').equals( "_._"),  "charToMorseCode('K')");
        Assert(charToMorseCode('L').equals( "._.."), "charToMorseCode('L')");
        Assert(charToMorseCode('M').equals( "__"),   "charToMorseCode('M')");
        Assert(charToMorseCode('N').equals( "_."),   "charToMorseCode('N')");
        Assert(charToMorseCode('O').equals( "___"),  "charToMorseCode('O')");
        Assert(charToMorseCode('P').equals( ".__."), "charToMorseCode('P')");
        Assert(charToMorseCode('Q').equals( "__._"), "charToMorseCode('Q')");
        Assert(charToMorseCode('R').equals( "._."),  "charToMorseCode('R')");
        Assert(charToMorseCode('S').equals( "..."),  "charToMorseCode('S')");
        Assert(charToMorseCode('T').equals( "_"),    "charToMorseCode('T')");
        Assert(charToMorseCode('U').equals( ".._"),  "charToMorseCode('U')");
        Assert(charToMorseCode('V').equals( "..._"), "charToMorseCode('V')");
        Assert(charToMorseCode('W').equals( ".__"),  "charToMorseCode('W')");
        Assert(charToMorseCode('X').equals( "_.._"), "charToMorseCode('X')");
        Assert(charToMorseCode('Y').equals( "_.__"), "charToMorseCode('Y')");
        Assert(charToMorseCode('Z').equals( "__.."), "charToMorseCode('Z')");
    }

    //method to convert text to morse code
    public static String messageToMorse(String msg) {
        if (msg == null) {
            return null;
        }

        String morse = "";

        for(int i = 0; i < msg.length(); i = i + 1) {
            char c = msg.charAt(i);
            morse = morse + charToMorseCode(c);

            //add space between each code
            if (i < msg.length()-1) {
                morse = morse + " ";
            }
        }

        return morse;
    }

    //method to call to convert morse code back to string
    public static String messageFromMorse(String morse) {

        StringTokenizer token = new StringTokenizer(morse, " ");
        
        String msg = "";
        while(token.hasMoreTokens()) {
            String test = token.nextToken();
            msg = msg + Methods.charFromMorseCode(test);            
        }
        return msg;
    }


}