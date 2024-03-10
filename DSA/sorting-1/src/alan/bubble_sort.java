package alan;

import java.util.Arrays;

public class bubble_sort {
    static void sort(int[] arr){
        for (int i = arr.length; i >= 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if(arr[j]>arr[j+1]){

                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,6,8,1,4,7,9,2,4,7,8,3,2,2,2,5,3,5,1,5,7,9,32,1,123,4,5,5,666,7774,3};
        //sorting
        sort(arr);
        //printing
        System.out.println(Arrays.toString(arr));
    }
}
