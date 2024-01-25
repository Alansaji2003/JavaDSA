package alan;

public class PalindromePattern {
    public static void main(String[] args) {
        int n = 5;
        int space;
        for (int i = 1; i <= n; i++) {
            space = n -i;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
