import java.util.Scanner;

public class scope {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    
    int s = 45 ;
    System.out.println(s);
    sc.close();
    }
}

// METHOD SCOPE VARIABLE 
//scope mtlb hota hai ki koi bhi variable function mai define karne k baad 
//usse hm kitne baar bhi use kar sakte hai 
//bas uske phele nhi use kar sakte uske baad use kar sakte hai 
// also agar kisi bhi variable ko jo hm ek fumction mai define kiye hai 
// usko dusre function mai nhi use kar sakte dusre function k liye vo define nhi hoga 

// BLOCK SCOPE 
// {} ess block k andar jo variable define hai usse uske bhaar use nhi kar sakte 
// example is for loop 

// CLASS SCOPE 