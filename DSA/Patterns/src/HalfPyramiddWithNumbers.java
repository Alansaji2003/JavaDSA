public class HalfPyramiddWithNumbers {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
