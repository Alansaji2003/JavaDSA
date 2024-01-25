package alan;

public class SolidRhombus {
    public static void main(String[] args) {
        int n = 6;
        int space;
        for (int i = 1; i <= n; i++) {
            space = n -i;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=n ; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
