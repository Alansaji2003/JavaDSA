package alan;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder br = new StringBuilder("Alan Saji");
        System.out.println(br);

        System.out.println(br.charAt(0));
        // set char at index
        br.setCharAt(0,'M');
        System.out.println(br);

        //insert: doesn't replace but shift the characters to the side
        br.insert(0,'G');
        System.out.println(br);

        //delete
        br.delete(1,3); //last index is exclusive(non inclusive)
        System.out.println(br);

        //to append
        br.append("hah");
        br.append("llala");
        System.out.println(br);

        //.length() can be used with string builder too

        //reversing a string
        StringBuilder sb = new StringBuilder("Reverse it");

        for (int i = 0; i < sb.length()/2; i++) {
            int front_index  = i;
            int back_index = sb.length() - 1 - i;

            char frontChar = sb.charAt(front_index);
            char backChar = sb.charAt(back_index);

            sb.setCharAt(front_index, backChar);
            sb.setCharAt(back_index,frontChar);

        }
        System.out.println(sb);
    }
}
