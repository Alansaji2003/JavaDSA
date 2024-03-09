package alan;


import java.util.Scanner;

public class palindromeOrNot {
    public static Boolean check(int i, String str) {

        if(i > str.length()/2){
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length() - i - 1)){ // start and end
            return false;
        }

        return check(i+1, str);
    }

    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(check(0,str));

    }
}
