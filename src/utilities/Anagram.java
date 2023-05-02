package utilities;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "Race";
        String str2 = "Care";

        str1 = str1.toLowerCase();
        str2 = str2.toUpperCase();

        // check if length is same
        if(str1.length() == str2.length()){
            System.out.println("Anagram");
        }

        // convert string
    }
}
