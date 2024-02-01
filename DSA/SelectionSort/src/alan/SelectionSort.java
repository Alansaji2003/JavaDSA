package alan;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {1,2,4,6,2,5,7,9,3,2};

        //selection sort
        //first loop goes till end ,
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            //second loop starts from the next element and checks for smallest
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            //swapping (if smallest was not found, no change will happen)
            //here we are swapping smallest to the beginning
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));

    }
}

// time complexity is n^2
