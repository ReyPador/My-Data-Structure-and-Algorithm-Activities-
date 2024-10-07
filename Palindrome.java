import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        String lowerCaseWord = word.toLowerCase();
        
        int start = 0;
        int end = lowerCaseWord.length() - 1;
        boolean isPalindrome = true;
        
        while (start < end) {
            if (lowerCaseWord.charAt(start) != lowerCaseWord.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
        
        scanner.close();
    }
}
