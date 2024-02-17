import java.util.Scanner;

public class concatenation {
    public static void allChar(String fulname ){
        for(int i = 0 ; i < fulname.length(); i++){
            System.out.println(fulname.charAt(i));
        }
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    String firstname = "Srijal";
    String lastname = "Gupta";
    String fulname = firstname + " " + lastname;
    System.out.println("My name is: " + fulname);
    allChar(fulname);
    // System.out.println("Character at 9 index is " + fulname.charAt(9));
    sc.close();
    }
}
// concatenation means 2 sring ko plus karna
// this is basically getting single string from multiple string 
// element ko khoj bhi sakte hai just like we do in array 
// for this we use charAt(i)