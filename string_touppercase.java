import java.util.Scanner;

public class string_touppercase {
    public static String toUppercase(String str){
      StringBuilder sb = new StringBuilder("");
      
      char ch = Character.toUpperCase(str.charAt(0));
      sb.append(ch);

      for (int i = 1 ; i < str.length() ; i++){
        if (str.charAt(i) == ' ' && i < str.length()-1) {
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }else{
            sb.append(str.charAt(i));
        }
      }
      return sb.toString();
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    
    String str = "hi, i am srijal";
    System.out.println(toUppercase(str));
    sc.close();
    }
    
}
// to make the letter of all words in a sentence start with uppercase 
// "append" means adding something to the end of an existing object
// TC is O(n) jitni string ki lenghth hai utna time laga 