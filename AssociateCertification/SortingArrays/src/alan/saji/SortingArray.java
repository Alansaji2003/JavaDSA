package alan.saji;
import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int [] num = {5, 10,2};
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }
        System.out.println(Arrays.toString(num));

        String[] str = {"50", "9", "500"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        
    }
}
