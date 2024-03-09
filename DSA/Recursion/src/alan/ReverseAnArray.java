package alan;
import java.util.Scanner;

public class ReverseAnArray {

    public static void reverse(int i, int[] arr, int n) {
        if(i >= n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i -1];
        arr[n - i - 1] = temp;

        reverse(i+1, arr, n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        reverse(0, array, size);

        System.out.println("Reversed Array");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
