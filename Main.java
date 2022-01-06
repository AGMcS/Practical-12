import uulib.Console;
import uulib.Methods;
//import java.util.StringTokenizer;

//AUTHOR: Alan McSeveney
//Date created: 06/12/2021

class Main {

    //Reversing array passed to method
    public static int[] reverse(int[] data) {
        int[] rep = new int[data.length];

        for (int i = 0, j = data.length - 1; i < j; i++, j--) {

            int temp = data[i];
            rep[i] = data[j];
            rep[j] = temp;
        }
        return rep;
    }

    public static void testReverse() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] reverseData = reverse(data);

        for (int i = 0; i < reverseData.length; i = i + 1) {
            System.out.println(data[i] + " " + reverseData[i]);
        }
    }

    //countdown method using if
    public static void countdown (int x) {

        char[] code = {'C','O','D','E'};     //char array

        //for to print x down to 1 && C, O, D, E
        for(int i = x, j = 0; i > 0; i = i - 1, j = j + 1) {
            if (j == code.length) {
                j = 0;
            }

            System.out.print(i);
            System.out.println (" " + code[j]);
        }

    }

    //example of countdown method using modulus operator
    public static void countdown2 (int x) {

        char[] code = {'C','O','D','E'};     //char array

        //for to print x down to 1
        for(int i = x, j = 0; i > 0 && j <= x; i = i - 1, j = j + 1) {
            if (j% 4 == 0) {
                j = 0;
            }

            System.out.print(i);
            System.out.println (" " + code[j]);
        }

    }


    public static void MorseCode() {
        String message = Console.getString("Enter message to encode: ");

        //encode message to morse
        String morse = Methods.messageToMorse(message);

        System.out.println(morse);

        //decode morse to message
        String decodedMessage = Methods.messageFromMorse(morse);

        //assert orginal and decoded message match
        //Methods.Assert(message.equals(decodedMessage) , "Encode/Decode Test");  NO LONGER IN USE AS TESTS HAVE BEEN USED

        System.out.println(decodedMessage);

    }
              

    public static void main(String[] args) {
       //uncomment to test code!!


        //executing Countdown/code program 
        //countdown(Console.getInt("Enter a number: "));
        

        //testing reversing array 
        // testReverse();
        
        //Takes input message and translates to morse code, then converted from morse code to plain text
        MorseCode();

    }
}