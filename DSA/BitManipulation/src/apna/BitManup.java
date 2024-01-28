package apna;

public class BitManup {


    //GET Operation
    static void get(int n, int pos){
        int bitMask = 1<<pos;

        if((bitMask& n) == 0){
            System.out.println("Bit was 0");
        }else {
            System.out.println("bit was 1");
        }
    }
    static int set(int n, int pos){
        int bitMask = 1<<pos;
        return bitMask | n;
    }
    static int clear(int n, int pos){
        int bitMask = 1<<pos;
        int not_of_bitmask = ~(bitMask);
        return not_of_bitmask & n;
    }
    public static void main(String[] args) {
        //GET OPERATION
        int n = 5; //INPUT VALUE
        int pos = 2; // POSITION TO FIND
        get(n, pos);


        // SET OPERATION
        int result = set(n,pos);
        System.out.println(result);

        //clear operation
        System.out.println(clear(n,pos));

        //UPDATE OPERATION
        //here we have two cases , if we want to change to 1 or 0

        int oper = 1;
        if(oper == 0){
            int bitmask = 1<<pos;
            int new_not = ~(bitmask);
            System.out.println(new_not&n);
        }else if(oper == 1){
            int bitmask = 1<<pos;
            System.out.println(bitmask|n);
        }


    }


}
