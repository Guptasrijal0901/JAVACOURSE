import java.util.Scanner;

public class string_lowercount {
    public static int lowercount(String str){
        int count = 0 ;
        for(int i = 0 ; i < str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
// Convert to lowercase for comparison
            if (
            ch == 'a' || 
            ch == 'e' || 
            ch == 'i' || 
            ch == 'o' ||
            ch == 'u' ) {
            count++;
            }   
        }
        return count;
// Return the count after checking all characters
        }
        
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter you words: ");
    String str = sc.next();
    System.out.println(lowercount(str));
    sc.close();
    }
}
// In Java, `str.equals(otherString)` is a method used to compare whether two strings `str` and `otherString` have the same sequence of characters. 

// Here's what it means in simpler terms:

// - `str.equals(otherString)` returns `true` if the content of `str` is exactly the same as the content of `otherString`.
// - It compares the characters in `str` with the characters in `otherString` to check if they are exactly the same.
// - It returns `false` if there is any difference in the sequence of characters or if the lengths of the strings are different.

// For example:

// ```java
// String str1 = "hello";
// String str2 = "hello";
// String str3 = "HELLO";

// System.out.println(str1.equals(str2)); // Output: true, because both strings have the same content.
// System.out.println(str1.equals(str3)); // Output: false, because the content is the same but the case is different.
// ```
// 
// In the example above, `str1.equals(str2)` returns `true` because both `str1` and `str2` contain the same sequence of characters. 
// However, `str1.equals(str3)` returns `false` because the content of `str1` and `str3` is the same, but the characters are of different cases.