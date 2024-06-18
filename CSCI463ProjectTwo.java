public class CSCI463ProjectTwo {

    public static Boolean isPalindrome(String sentence) {
        String cleaned = sentence.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal, Panama")); // true
        System.out.println(isPalindrome("Hello, World!")); // false
    }
}