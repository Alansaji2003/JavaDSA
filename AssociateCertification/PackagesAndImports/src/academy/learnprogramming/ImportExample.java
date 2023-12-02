package academy.learnprogramming;

import a.b.c.d.MyClass;

import java.util.Random;  // util is child package inside java package, Random IS Class
// we can import all classes in a package with java.util.*; it's called wild card
public class ImportExample {
    /**
     * Random example
     * @param args
     */
    public static void main(String[] args) {
        MyClass myclass = new MyClass();  // importing a class I created inside d package (a.b.c.d)
        Random random = new Random();
        System.out.println(random.nextInt(5)); //some number between zero and 5
    }
}
// System class is in java.land package and it is imported automatically


// import statements should be below package declaration
