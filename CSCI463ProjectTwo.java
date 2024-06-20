/**
 * CSCI463ProjectTwo contains the main method to test for palindromes.
 * The class does so through the use of console prompts and user input.
 * It includes a function to check if a given sentence is a palindrome.
 *
 * @author Austin Howard
 * @version Jun 20, 2024
 */
import java.util.Scanner;

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
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        String continueTesting = "YES";

        while (continueTesting.equalsIgnoreCase("YES")) {
            // Prompt the user to enter a sentence
            System.out.print("Enter a sentence, I will tell you if it is a palindrome: ");
            String input = scanner.nextLine();

            // Check if the input sentence is a palindrome and display the result
            if (isPalindrome(input)) {
                System.out.println("\"" + input + "\" is a palindrome!");
            } else {
                System.out.println("\"" + input + "\" is not a palindrome!");
            }

            // Ask the user if they want to perform another test
            System.out.print("Do you want another test (\"YES\" or \"NO\"): ");
            continueTesting = scanner.nextLine();
        }

        // Close the scanner
        scanner.close();
    }
}