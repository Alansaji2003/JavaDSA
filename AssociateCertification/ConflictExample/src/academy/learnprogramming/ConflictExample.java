package academy.learnprogramming;
import java.util.Date;

public class ConflictExample {
    public static void main(String[] args) {
        java.util.Date date; // we can do like this too
        Date date_two; //this also

        // another package with same class name
        java.sql.Date sqldate;
        // if we use .* for both packages we get compiler error
        // using full class names for both can be helpful
    }
}
// i have a main class inside src (default package) we cant import from default class!