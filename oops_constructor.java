public class oops_constructor {
    public static void main(String[] args) {
        student s1 = new student("Srijal Gupta");
        System.out.println(s1.name);
    }
}
class student {
    String name ;
    int age ;
    int roll ;

    // this is constructor
    student( String name ){  
        this.name = name;
        System.out.println("Constructor is called");
    }
}