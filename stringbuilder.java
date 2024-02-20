import java.util.Scanner;

public class stringbuilder {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder("");
    for (char ch = 'a'; ch <= 'z'; ch++){
        sb.append(ch); // apni string k piche add karne k liye ess function ko use karte hai 
    // System.out.println(sb );
}
System.out.println(sb );
System.out.println(sb.length() );
    sc.close();
    }
}
// toString() is use to convert the any object into string 
// TC is O(n) i.e. O(26) 26b baar loop run karega 