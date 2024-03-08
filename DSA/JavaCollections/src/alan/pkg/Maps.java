package alan.pkg;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        //map numbers to string
        Map<String , Integer> number = new HashMap<>();

        //add key value pair to map
        number.put("ALAN",1);
        System.out.println(number);
        System.out.println(number.containsKey("ALAN"));
        //containsValue() also
        // get(<key>)
        //keySet() to get only keys from the output
        for(Map.Entry<String, Integer> entry : number.entrySet()){
            System.out.println("key"+entry.getKey() + "Value"+entry.getValue());
        }
    }
}
