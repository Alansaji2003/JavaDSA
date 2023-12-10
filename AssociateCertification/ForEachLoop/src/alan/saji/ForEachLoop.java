package alan.saji;

//syntax
//for (datatype VariableName : collection){
    //body
//}



public class ForEachLoop {
    public static void main(String[] args) {
        String[] names = {"Jimmy", "John", "Tom", "Anthony"};

        for(int i = 0; i < names.length; i++) {
            System.out.println("name= " + names[i]);  // normal for loop
        }

        for(String name : names) {
            System.out.println("name= " + name);      //better and easier
        }

        for(String name : names) {
            name = name + " " + name;
            //even if we modify local variable here, it will not affect the original array
        }

        for(String name : names) {
            System.out.println("name= " + name);
        }

        StringBuilder[] builders = {
                new StringBuilder("For"),
                new StringBuilder("Loop")       //anonymous array for two string builders
        };

        for(StringBuilder builder : builders) {
            System.out.println(builder);
        }

        for(StringBuilder builder : builders) {
            builder.append("123");      // here the original array changes because it is not immutable
        }

        for(StringBuilder builder : builders) {
            System.out.println(builder);
        }

        String pets = "Parrot";

//        for(String pet : pets) {} // does not compile , foreach does not work on Strings

//        for(int name : names) {} // does not compile , incompatible types

        for(char c : pets.toCharArray()) {    //here we are converting the string to charecter array
            System.out.println(c);
        }
    }
}
