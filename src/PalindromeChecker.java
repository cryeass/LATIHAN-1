import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Masukkan kata atau kalimat: ");
        String input = inputScanner.nextLine();


        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();


        boolean isPalindrome = isPalindrome(cleanedInput);

        if (isPalindrome) {
            System.out.println("Input adalah palindrome.");
        } else {
            System.out.println("Input bukan palindrome.");
        }

        inputScanner.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
