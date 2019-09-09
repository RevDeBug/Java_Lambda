package Simplicity;

import java.util.HashMap;
import java.util.Map;

public class SimpleImplementation {
    public void handler(String s) {
        System.out.println(Cipher(s));
    }

    public String Cipher(String input) {
        String outString = "";
        String upperInput = input.toUpperCase();
        for (int i = 0; i < upperInput.length(); i++) {
            Character letter = upperInput.charAt(i);
            String out = null;
            out = Ceasar.getOrDefault(letter, out);
            String upperOut = out.toUpperCase();
            outString += upperOut + " ";
        }
        return outString;
    }

    HashMap<Character, String> Ceasar = new HashMap<Character, String>() {
        {
            put('A', "Alpha");
            put('B', "Bravo");
            put('C', "Charlie");
            put('D', "Delta");
            put('E', "Echo");
            put('F', "Foxtrot");
            put('G', "Golf");
            put('H', "Hotel");
            put('I', "India");
            put('J', "Juliett");
            put('K', "Kilo");
            put('L', "Lima");
            put('M', "Mike");
            put('N', "November");
            put('O', "Oscar");
            put('P', "Papa");
            put('Q', "Quebec");
            put('R', "Romeo");
            put('S', "Sierra");
            put('T', "Tango");
            put('U', "Uniform");
            put('V', "Victor");
            put('W', "Whyskey");
            put('X', "X-ray");
            put('Y', "Yankee");
            put('Z', "Zulu");
        }
    };
}
