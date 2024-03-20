public class oops_typesofconstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student("Srijal");
        // Student s3 = new Student(123);
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        s1.name = "Srijal Gupta";
        s1.roll = 180;
        s1.password = "arnav";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 95;

        Student s2 =  new Student(s1); 
// yaha pe hmne copy kari hai s1 ki values s2 k andar 
        s2.password = "xyz";
        s2.marks[2] = 99;
// esme hmne copy kar liya lekin value change kar di toh vo change ho gya 
        for(int i = 0 ; i < 3 ; i++){
        System.out.println(s2.marks[i]);
        }
    }
}
class Student {
    String name ;
    int roll ;
    String password;
    int[] marks;
// yaha pe hmne s2 naya banaya esme 
// s2 mai sari s1 ki properties copy kar diya 
// but naya password bana diya s2 k liye 
// copy constructor 
    Student (Student s1){
        marks = new int [3];
        this.name = s1.name;
        this.roll = s1.roll;
        // Copying marks from s1 to s2
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student(){
        marks = new int [3];
        System.out.println("Constructor is called...");
    }
    Student(String name){
        marks = new int [3];
        this.name = name ;
    }
    Student (int roll){
        marks = new int [3];
        this.roll = roll;
    }
}