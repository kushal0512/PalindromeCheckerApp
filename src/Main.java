public class Main {

    // Recursive method
    public static boolean isPalindrome(String input, int start, int end) {

        // Base condition: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters don’t match
        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(input, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "madam";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}