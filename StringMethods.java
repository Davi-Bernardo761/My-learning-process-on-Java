//This program shows a simple usage of String Methods in  java.
public class StringMethods {
    public static void main (String[] args){
        String name = "Thomas";
        int length = name.length();
        System.out.println(length);
        char letter = name.charAt(0);
        System.out.println(letter);
        int index = name.indexOf(" ");
        System.out.println(index);
        int Lastindex = name.lastIndexOf("o");

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("o","a");
    }
}
