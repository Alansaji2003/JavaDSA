package alan.saji;
//what are numeric promotions?
//rules for numeric promotions
//converting primitives

public class NumericPromotions {
    public static void main(String[] args) {
        int a = 5;
        double b = 10.5;
        System.out.println("answer=" +a + b); //see the output, string concatenation happening
        System.out.println("answer=" +(a + b));//correct
        System.out.println(a + b); //correct

        byte ba = 10;
        int c = 5;
        double d = 4.5;

        double result = ba + c + d;

        System.out.println("result= " + result);

        // casting is converting "bigger" type to "smaller" type

        double myDouble = 5.55;
        int myInt = 4 + (int)myDouble;
        System.out.println("result= " + myInt);

        int anotherInt = 125;
        byte myByte = 15;

        int intResult = anotherInt + myByte;
        byte byteResult = (byte)(anotherInt + myByte);

        System.out.println("intResult= " + intResult);
        System.out.println("byteResult= " + byteResult); // overflow
    }
}
