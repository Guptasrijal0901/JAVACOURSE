import java.util.Scanner;

public class string {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    // char array[] = {'a', 'b', 'c', 'd' };
    // String str = "abcd";
    // String str2 = new String("vxyz");
    String name;
    System.out.print("Enter your name: ");
    name = sc.nextLine();
    // next na sirf first word leta hai eske liye hm nextLine use karte hai jisse puri line hme mill jati hai 
    System.out.println("My name is: "+name);
    System.out.println("Length of name is: "+name.length());
    sc.close();
    }
}
// Strings are IMUTABLE: never change in purani  string 
// hmesha new array banana padhta hai changes karne k liye
// array k andar length ek property hoti hai 
// jabki string k andar ek function hota hai esliye hme () lagana hota hai 
// 