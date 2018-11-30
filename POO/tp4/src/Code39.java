import java.util.*;
import java.io.*;


public class Code39 {
    static HashMap<Character, String> code = new HashMap<Character, String>(43);

    static {
        code.put('A', "100001001");
        code.put('B', "001001001");
        code.put('C', "101001000");
        code.put('D', "000011001");
        code.put('E', "100011000");
        code.put('F', "001011000");
        code.put('G', "000001101");
        code.put('H', "100001100");
        code.put('I', "001001100");
        code.put('J', "000011100");
        code.put('K', "100000011");
        code.put('L', "001000011");
        code.put('M', "101000010");
        code.put('N', "000010011");
        code.put('O', "100010010");
        code.put('P', "001010010");
        code.put('Q', "000000111");
        code.put('R', "100000110");
        code.put('S', "001000110");
        code.put('T', "000010110");
        code.put('U', "110000001");
        code.put('V', "011000001");
        code.put('W', "111000000");
        code.put('X', "010010001");
        code.put('Y', "110010000");
        code.put('Z', "011010000");
        code.put('0', "000110100");
        code.put('1', "100100001");
        code.put('2', "001100001");
        code.put('3', "101100000");
        code.put('4', "000110001");
        code.put('5', "100110000");
        code.put('6', "001110000");
        code.put('7', "000100101");
        code.put('8', "100100100");
        code.put('9', "001100100");
        code.put(' ', "011000100");
        code.put('-', "010000101");
        code.put('$', "010101000");
        code.put('%', "000101010");
        code.put('.', "110000100");
        code.put('/', "010100010");
        code.put('+', "010001010");
        code.put('*', "010010100");
    }

    public String getCodeChar(char c) {
        return code.get(c);
    }

    public String getCodestr(String s) {
        String str = getCodeChar('*');
        char[] tabChar = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            str += "0" + getCodeChar(tabChar[i]);
        }
        str += "0" + getCodeChar('*');
        return str;
    }
}

