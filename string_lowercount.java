import java.util.Scanner;

public class string_lowercount {
    public static int lowercount(String str){
        int count = 0 ;
        for(int i = 0 ; i < str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
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
        }
        
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter you words: ");
    String str = sc.next();
    System.out.println(lowercount(str));
    sc.close();
    }
}
