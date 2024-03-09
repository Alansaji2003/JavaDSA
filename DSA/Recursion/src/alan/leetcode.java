package alan;

public class leetcode {
    public static boolean isPalindrome(String s) {
        String new_str = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        for(int i = 0; i < new_str.length()/2; i++){
            if(new_str.charAt(i) != new_str.charAt(new_str.length() - i - 1))
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("OP"));

    }
}
