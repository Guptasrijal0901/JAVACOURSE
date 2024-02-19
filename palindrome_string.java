import java.util.Scanner;

public class palindrome_string {
    public static boolean isPalindrome(String str){
    int n = str.length(); 
    for (int i = 0; i < n/2 ; i++) {
        if ( str.charAt(i) != str.charAt(n-1-i)) {
            return false;
        }
    }
    return true;
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    String str = "racecar";
    // isPalindrome(str);
    if (isPalindrome(str)) {
        System.out.println("It is palindrome");
    }else{
        System.out.println("It is not palindrome");
    }
    sc.close();
    }
    
}
// Tc of this code is O(n) 