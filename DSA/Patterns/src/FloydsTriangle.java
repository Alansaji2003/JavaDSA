public class FloydsTriangle {
    public static void main(String[] args) {
        int m = 5;
        int num = 1;
        for (int i =1; i <=m; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println( );
        }
    }
}
