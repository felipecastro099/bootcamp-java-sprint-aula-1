package br.com.meli.apirest;

public class Morse {
    public static String string2morse(String s){

        String ret = "";

        for (int i = 0; i < s.length(); i++){
            ret += encode(s.substring(i,i+1));
        }

        return ret;

    }

    public static String morse2string(String morse){

        String ret = "";

        String[] separated = morse.split("\\s{1}");

        for (int i = 0; i < separated.length; i++){
            ret += decode(separated[i]);
        }

        return ret;

    }


    private static String encode (String toEncode)
    {
        String morse = toEncode;

        if (toEncode.equalsIgnoreCase("a"))
            morse = ".-";
        if (toEncode.equalsIgnoreCase("b"))
            morse = "-...";
        if (toEncode.equalsIgnoreCase("c"))
            morse = "-.-.";
        if (toEncode.equalsIgnoreCase("d"))
            morse = "-..";
        if (toEncode.equalsIgnoreCase("e"))
            morse = ".";
        if (toEncode.equalsIgnoreCase("f"))
            morse = "..-.";
        if (toEncode.equalsIgnoreCase("g"))
            morse = "--.";
        if (toEncode.equalsIgnoreCase("h"))
            morse = "....";
        if (toEncode.equalsIgnoreCase("i"))
            morse = "..";
        if (toEncode.equalsIgnoreCase("j"))
            morse = ".---";
        if (toEncode.equalsIgnoreCase("k"))
            morse = "-.-";
        if (toEncode.equalsIgnoreCase("l"))
            morse = ".-..";
        if (toEncode.equalsIgnoreCase("m"))
            morse = "--";
        if (toEncode.equalsIgnoreCase("n"))
            morse = "-.";
        if (toEncode.equalsIgnoreCase("o"))
            morse = "---";
        if (toEncode.equalsIgnoreCase("p"))
            morse = ".--.";
        if (toEncode.equalsIgnoreCase("q"))
            morse = "--.-";
        if (toEncode.equalsIgnoreCase("r"))
            morse = ".-.";
        if (toEncode.equalsIgnoreCase("s"))
            morse = "...";
        if (toEncode.equalsIgnoreCase("t"))
            morse = "-";
        if (toEncode.equalsIgnoreCase("u"))
            morse = "..-";
        if (toEncode.equalsIgnoreCase("v"))
            morse = "...-";
        if (toEncode.equalsIgnoreCase("w"))
            morse = ".--";
        if (toEncode.equalsIgnoreCase("x"))
            morse = "-..-";
        if (toEncode.equalsIgnoreCase("y"))
            morse = "-.--";
        if (toEncode.equalsIgnoreCase("z"))
            morse = "--..";
        if (toEncode.equalsIgnoreCase("0"))
            morse = "-----";
        if (toEncode.equalsIgnoreCase("1"))
            morse = ".----";
        if (toEncode.equalsIgnoreCase("2"))
            morse = "..---";
        if (toEncode.equalsIgnoreCase("3"))
            morse = "...--";
        if (toEncode.equalsIgnoreCase("4"))
            morse = "....-";
        if (toEncode.equalsIgnoreCase("5"))
            morse = ".....";
        if (toEncode.equalsIgnoreCase("6"))
            morse = "-....";
        if (toEncode.equalsIgnoreCase("7"))
            morse = "--...";
        if (toEncode.equalsIgnoreCase("8"))
            morse = "---..";
        if (toEncode.equalsIgnoreCase("9"))
            morse = "----.";
        if (toEncode.equalsIgnoreCase("."))
            morse = ".-.-";
        if (toEncode.equalsIgnoreCase(","))
            morse = "--..--";
        if (toEncode.equalsIgnoreCase("?"))
            morse = "..--..";
        if (toEncode.equalsIgnoreCase(" "))
            morse = " ";

        return morse+" ";
    }

    private static String decode (String toDecode) {

        String morse = toDecode;

        if (toDecode.equalsIgnoreCase(".-"))
            morse = "a";
        if (toDecode.equalsIgnoreCase("-..."))
            morse = "b";
        if (toDecode.equalsIgnoreCase("-.-."))
            morse = "c";
        if (toDecode.equalsIgnoreCase("-.."))
            morse = "d";
        if (toDecode.equalsIgnoreCase("."))
            morse = "e";
        if (toDecode.equalsIgnoreCase("..-."))
            morse = "f";
        if (toDecode.equalsIgnoreCase("--."))
            morse = "g";
        if (toDecode.equalsIgnoreCase("...."))
            morse = "h";
        if (toDecode.equalsIgnoreCase(".."))
            morse = "i";
        if (toDecode.equalsIgnoreCase(".---"))
            morse = "j";
        if (toDecode.equalsIgnoreCase("-.-"))
            morse = "k";
        if (toDecode.equalsIgnoreCase(".-.."))
            morse = "l";
        if (toDecode.equalsIgnoreCase("--"))
            morse = "m";
        if (toDecode.equalsIgnoreCase("-."))
            morse = "n";
        if (toDecode.equalsIgnoreCase("---"))
            morse = "o";
        if (toDecode.equalsIgnoreCase(".--."))
            morse = "p";
        if (toDecode.equalsIgnoreCase("--.-"))
            morse = "q";
        if (toDecode.equalsIgnoreCase(".-."))
            morse = "r";
        if (toDecode.equalsIgnoreCase("..."))
            morse = "s";
        if (toDecode.equalsIgnoreCase("-"))
            morse = "t";
        if (toDecode.equalsIgnoreCase("..-"))
            morse = "u";
        if (toDecode.equalsIgnoreCase("...-"))
            morse = "v";
        if (toDecode.equalsIgnoreCase(".--"))
            morse = "w";
        if (toDecode.equalsIgnoreCase("-..-"))
            morse = "x";
        if (toDecode.equalsIgnoreCase("-.--"))
            morse = "y";
        if (toDecode.equalsIgnoreCase("--.."))
            morse = "z";
        if (toDecode.equalsIgnoreCase("-----"))
            morse = "0";
        if (toDecode.equalsIgnoreCase(".----"))
            morse = "1";
        if (toDecode.equalsIgnoreCase("..---"))
            morse = "2";
        if (toDecode.equalsIgnoreCase("...--"))
            morse = "3";
        if (toDecode.equalsIgnoreCase("....-"))
            morse = "4";
        if (toDecode.equalsIgnoreCase("....."))
            morse = "5";
        if (toDecode.equalsIgnoreCase("-...."))
            morse = "6";
        if (toDecode.equalsIgnoreCase("--..."))
            morse = "7";
        if (toDecode.equalsIgnoreCase("---.."))
            morse = "8";
        if (toDecode.equalsIgnoreCase("----."))
            morse = "9";
        if (toDecode.equalsIgnoreCase("  "))
            morse = " ";

        return morse;
    }
}
