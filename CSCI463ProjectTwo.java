/**
 * CSCI463ProjectTwo contains the main method to test for palindromes.
 * The class does so through the use of console prompts and user input.
 * It includes a function to check if a given sentence is a palindrome.
 *
 * @author Austin Howard
 * @version Jun 20, 2024
 */


public class CSCI463ProjectTwo {

    /**
     * Checks if the string provided is a palindrome.
     *
     * @param sentence the sentence to check
     * @return true if the sentence is a palindrome, false otherwise
     */
    public static Boolean isPalindrome(String sentence) {
        // Remove non-alphanumeric characters and convert to lower case
        String cleaned = sentence.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        // Check characters from both ends of the string
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
        // Test cases for isPalindrome function
        System.out.println(isPalindrome("A man, a plan, a canal, Panama")); // true
        System.out.println(isPalindrome("Hello, World!")); // false
    }
}