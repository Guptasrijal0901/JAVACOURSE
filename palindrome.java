import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

    // Function to check if a number is palindrome
    private static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num = num /10 ;
        }

        return originalNum == reversedNum;
    }
};
// boolean type esliye use hua hai ki niche k number ko check kar sake yaa fir compare kar sake 
