public class InvertedHalfPyramidWithNumbers {


    public static void main(String[] args) {

        int m = 6;
        for (int i = m; i >0 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
