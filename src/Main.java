import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App ===");
        System.out.print("Enter a word or number: ");
        String input = sc.nextLine();

        // Remove spaces and convert to lowercase
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";
        for (int i = cleanedInput.length() - 1; i >= 0; i--) {
            reversed += cleanedInput.charAt(i);
        }

        if (cleanedInput.equals(reversed)) {
            System.out.println("Result: It is a Palindrome ✅");
        } else {
            System.out.println("Result: It is NOT a Palindrome ❌");
        }

        sc.close();
    }
}