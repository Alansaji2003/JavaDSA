package alan;

import java.util.Arrays;

public class bubble_sort {
    static void sort(int[] arr){
        //from n -1 to 0
        for (int i = arr.length; i >= 0; i--) {
            int didSwap = 0; //optimizing
            // from 0 to i    (-1 because swapping should only go till 2nd last element)
            for (int j = 0; j < i - 1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;     //optimizing
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
