package alan.saji;

import java.sql.SQLOutput;

public class StringMethods {
    public static void main(String[] args) {
        String str = "java is fun";

        System.out.println("length= " + str.length());

        //chatAt()

        System.out.println( str.charAt(6));
        System.out.println( str.charAt(4));
        System.out.println( str.charAt(3));
        System.out.println( str.charAt(1));

        // indexOf()

        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf('a',2));
        System.out.println(str.indexOf("fun")); //only the first index is returned
        System.out.println(str.indexOf("fun", 10)); //-1 means match not found

        //subsring
//        str.substring(0);
        System.out.println(str.substring(8));
        System.out.println(str.substring(0,5)); //excluding 5th index
        System.out.println(str.substring(4,4)); //returns empty string

    //    System.out.println(str.substring(4,2)); //out-of-bounds error
    //    System.out.println(str.substring(8,40)); //out of bounds error

        System.out.println("Abcd".toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str); //immutable

        String dog = "Lucky";
        dog.toUpperCase();
        System.out.println(dog); // no change, immutable

        String dog2 = "Bucky";
        dog2 = dog2.toUpperCase();
        System.out.println(dog); //success

        //equals, equalsIgnoreCase
        String str2 = "java";
        String str3 = "Java";
        String str4 = "ja";

        System.out.println(str2.equals(str3));
        System.out.println(str2.equalsIgnoreCase(str3));
        System.out.println("abc".equalsIgnoreCase("ABC"));

        //startsWith, endsWith
        System.out.println(str2.startsWith("j"));
        System.out.println(str2.startsWith(str4));
        System.out.println(str2.startsWith("J"));
        System.out.println(str2.endsWith("va"));

        //contains
        System.out.println(str2.contains(str4));
        System.out.println(str2.contains("av"));
        System.out.println("Jaca".contains("j".toUpperCase()));

        //replace
        String myString = "Jaba is cool";
        System.out.println(myString);
        System.out.println(myString.replace(" ",""));
        System.out.println(myString.replace('b','v'));
        System.out.println(myString);

        //trim - remove whitespaces from start and end
        System.out.println("jVA".trim());
        System.out.println(" jajaj ");
        System.out.println(" dfdsfsdf ".trim());














    }
}
