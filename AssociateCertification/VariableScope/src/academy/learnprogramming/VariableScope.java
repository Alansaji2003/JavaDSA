package academy.learnprogramming;

public class VariableScope {

    //when variable is declared outside our method it is usually called field of our class
    //it is a global variable

    static int myNewInt = 10;



    // scope means the range within which the data is available or where the data exist
    public static void main(String[] args) {
        //local variables are only available inside the methods
        //each block of code has its own scope
        int local = 5;
        {
            //this local variable is available inside this code block only
            int myOtherInt = 20;
            System.out.println(myOtherInt);
            System.out.println(local); // this works because local variable can be used anywhere inside the method
            {
                //here we cant redeclare myOtherInt
                myOtherInt = 8;    //because its available inside internal blocks
            }

        }
        int myOtherInt = 30;
        System.out.println(myOtherInt); //will print 30




    }

    public static void myMeth(String[] args) {
//        System.out.println(myNewInt); // global is accessible
//        System.out.println(local);    //not accessible



    }

}
