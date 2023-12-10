package alann.saji;

//index problems
//looping problems
//Initialization problems
//Length problems

public class ProblemsArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // 5 elements, index range 0-4

        for (int i = 1; i < numbers.length; i++) {
            System.out.println(i + " - " + numbers[i]);   // first element not printed
        }

        for (int i = 1; i <= numbers.length - 1; i++) {
            System.out.println(i + " - " + numbers[i]); // if no -1 then out of bounds exception
        }

//        int[20] nums;  // wrong code
        int[] nums = new int[20]; // size only at initialization


//        int size = numbers.length(); // does not compile length is not a method
        int size = numbers.length;   //no ()

//        numbers.length = 10; // does not compile you cant set length of array, only on initialization
    }
}
