package NumberPyr;

public class NumPyr {
    public static void main(String[] args) {
        int n = 6;
        int space;
        for (int i = 1; i <= n; i++) {
            space = n - i;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
