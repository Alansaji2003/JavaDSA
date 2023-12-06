package alan.saji;

public class StringBuilder {
    public class StringBuilderExample {

        public static void main(String[] args) {
            String myString = "";

            for (char c = 'a'; c <= 'z'; c++) {
                myString += c; // every iteration this will create new String object
            }

            System.out.println(myString);

            // with string builder
            java.lang.StringBuilder sb = new java.lang.StringBuilder(); // create new instance of StringBuilder object

            for (char c = 'a'; c <= 'z'; c++) {
                sb.append(c); // add char to string builder, reuses string builder without creating string each time
            }

            System.out.println(sb);

            //
            java.lang.StringBuilder builder = new java.lang.StringBuilder("start");
            builder.append("-middle"); // "start-middle"
            java.lang.StringBuilder anotherBuilder = builder.append("-end");

            System.out.println(builder);
            System.out.println(anotherBuilder);

            System.out.println(builder == anotherBuilder);
            System.out.println(System.identityHashCode(builder));
            System.out.println(System.identityHashCode(anotherBuilder));

            java.lang.StringBuilder myBuilder = new java.lang.StringBuilder();
            System.out.println("size= " + myBuilder.length());
            System.out.println("capacity= " + myBuilder.capacity());

            myBuilder = new java.lang.StringBuilder(100);
            System.out.println("size= " + myBuilder.length());
            System.out.println("capacity= " + myBuilder.capacity());

            myBuilder.append("MyNewTest");
            System.out.println("size= " + myBuilder.length());
            System.out.println("capacity= " + myBuilder.capacity());

            java.lang.StringBuilder a = new java.lang.StringBuilder("This ");
            java.lang.StringBuilder b = a.append("Java ");
            b = b.append("is").append(" so ").append("Cool");
            System.out.println(a);
            System.out.println(b);

        }
    }
}