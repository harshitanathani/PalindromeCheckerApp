import java.util.LinkedList;

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "madam";

        // Create predefined LinkedList
        LinkedList<Character> list = new LinkedList<>();

        // Convert string to LinkedList
        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare first and last elements
        while (list.size() > 1) {

            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}