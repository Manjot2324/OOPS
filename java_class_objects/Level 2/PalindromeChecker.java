import java.util.Scanner;

class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String reversedText = new StringBuilder(text).reverse().toString();
        return text.equals(reversedText);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter text: ");
        checker.text = scanner.nextLine();

        checker.displayResult();

        scanner.close();
    }
}
