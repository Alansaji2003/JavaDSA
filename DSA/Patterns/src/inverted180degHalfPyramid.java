public class inverted180degHalfPyramid {
    public static void main(String[] args) {
        int m = 6;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - i; j++) {  // first loop to print space
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) { // 2nd loop to print stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
