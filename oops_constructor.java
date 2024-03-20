public class oops_constructor {
    public static void main(String[] args) {
        student s1 = new student("Srijal Gupta"); 
// yah ape hm naya student object bana rahe hai constructor ki help se 
        System.out.println(s1.name);
    }
}
class student {
    String name ;
    int age ;
    int roll ;

    // this is constructor
    student( String S_name ){  
        this.name = S_name;
        System.out.println("Constructor is called....");
    }
}
// constructor khud se baan jata hai jab hm new word use karte hai lekin 
// esme koi initilization nhi hota hai 