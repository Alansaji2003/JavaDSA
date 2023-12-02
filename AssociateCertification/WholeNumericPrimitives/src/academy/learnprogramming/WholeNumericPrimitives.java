package academy.learnprogramming;

import javax.management.InstanceNotFoundException;

public class WholeNumericPrimitives {
    public static void main(String[] args) {
         numbers are called literals
        long max = 31123123123;  // here an error comes because java thinks all whole numbers are intigers
        long new_max = 23423525345L; // now the error is gone after adding an L (small letter also works)
        // we can use underscore to separate big numbers
        int a = 2_300;


        int x = 08; //error integer number too large

        //octal (0 to 7)
        int y = 07;  // it works
        int m = 010;  // 8 in decimal
        int anotheroct = 022; // 18 in decimal

        int sum = m + anotheroct;
        System.out.println(sum);  // 26

        System.out.println(Integer.toOctalString(sum)); // to print octal sum

        // hexadecimal numbers are prefixed with 0x    (0-9 and A - F)
        int  firstHex = 0xF; // 15 in decimal
        int second = 0x1E;  //30 decimal
        int new_sum = firstHex + second;
        System.out.println(Integer.toHexString(new_sum));

        // binary : prefix 0b
        int fistBin = 0b1001; // 9 decimal
        int secondBin = 0b0111; // 7 decimal
        int sumBin = fistBin  + secondBin;

        //int thirdBin = 0b2;
        System.out.println(Integer.toBinaryString(sumBin));






    }
}
