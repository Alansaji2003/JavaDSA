package academy.learnprogramming;

public class DecimalNumericPrimitives {
    public static void main(String[] args) {
        //by default , a floating point number is assumed as Double
        float mynum = 36.8;     //error

        float yurnum = 56.6F; // correct
        //underscore cant be just before or after decimal point
        //underscore cant be there at the beginning of a number
        double next = 3.5D; // D can be used but it is optional

        double scientific = 5.000023423E03;     // it is 5000.023423, the number after E specifies the number of times to be moved
        double scientific_new = 5.000023423E3; // works
        double hexpi = 0x1.91eb851eb851fp1; // p indicates hexadecimal floating point number


    }
}
