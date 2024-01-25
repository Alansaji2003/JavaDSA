package Alan.saji;

public class Butter {
    public static void main(String[] args) {
        int n = 10;
        int space;
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            space = 2 * (n-i);
            for (int k = 1; k <= space ; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();


            }
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            space = 2 * (n-i);
            for (int k = 1; k <= space ; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }

