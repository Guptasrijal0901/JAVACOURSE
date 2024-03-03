import java.util.Scanner;

public class string_compression {
    public static String compre(String str){
    String newstr = "";
    for (int i = 0 ; i < str.length() ; i++){
        Integer count = 1 ;
        while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
// In the given code, `str.length() - 1` is used to prevent the loop from going out of bounds.
// It ensures that when checking for consecutive characters,
// we stop at the second-to-last character to avoid comparing the last character with a nonexistent next character (which would cause an error).
            count++;
            i++;
        }
        newstr = newstr + str.charAt(i);
        if (count > 1) {
        newstr = newstr + count.toString();
//  count.toString(), you're telling the computer to take the number stored in the count variable and convert it into a string.
// For example, if count is 5, count.toString() would give you the string "5".
        }
    }
    return newstr;
    }
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        String str = "aaabbbcccddd";
        System.out.println(str + " after compressing " + compre(str));
        sc.close();
        }
}
// TC is linear O(n) hai kyu ki yeh n baar hi run kar raha hai 