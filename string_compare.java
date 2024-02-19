import java.util.Scanner;

public class string_compare {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    String s1 = "Srijal";
    String s2 = "Srijal";
    String s3 = new String("Srijal");
    // if (s1 == s2) {
    //     System.out.println("Strings are equal");
    // }else{
    //     System.out.println("Strings are not equal");
    // }
    // if (s1 == s3) {
    //     System.out.println("Strings are equal");
    // }else{
    //     System.out.println("Strings are not equal");
    // }
    // SIRF VALUES CHECK KARNE K LIYE EK FUNCTION HOTA HAI EQUALS JO KI VALUES CHECK KARTA HAI 
    if (s1.equals(s2)) {
        System.out.println("Strings are equal");
    } else {
        System.out.println("Strings are not equal");
    }
    
    if (s1.equals(s3)) {
        System.out.println("Strings are equal");
    } else {
        System.out.println("Strings are not equal");
    }
    
    sc.close();
    }   
}
// though value teeno mai same hai lekin s1 or s2 equal hoga lekin s3 nhi kyu ki 
// usko hmne new string bana diya hai 
// jo ki s1 or s2 se different hai 
// s1 and s2 are both string literals, and in Java, 
// string literals are stored in a string pool. 
// When you create a string using a string literal, 
// Java checks if the string already exists in the pool; if it does, 
// it returns a reference to the existing string, which is why s1 == s2 evaluates to true.

// s3 is created using the new keyword, 
// which explicitly creates a new string object in the heap memory, 
// even if the content is the same as an existing string. 
// Therefore, s1 == s3 evaluates to false because they are referencing different objects in memory