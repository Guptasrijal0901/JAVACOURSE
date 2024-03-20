public class OOPS_copy_constructor {
    public static void main(String[] args) {
      Student_data s1 = new Student_data();
      s1.name = "Srijal Gupta" ;
      s1.roll = 180 ;
      s1.marks = new int[3];
      s1.password = "xyz";
      s1.marks[0]= 98;
      s1.marks[1]= 99;
      s1.marks[2]= 89;
// Create a new Student_data object using copy constructor    
    Student_data s2 = new Student_data(s1);
    // Set new password for s2
    s2.password = "change_xyz";
    s1.marks[1] = 97; 
    // after coping it is changed now the new marks will shown not old one
    // Print details of s2
    System.out.println("Name: " + s2.name);
    System.out.println("Roll: " + s2.roll);
    System.out.println("Password: " + s2.password);
    for(int i = 0 ; i < 3 ; i++){
    System.out.println("Marks "+  i +" = "+ s2.marks[i]);
    }
    }
}
class Student_data{
    String name ;
    int roll ;
    String password ;
    int[] marks ;
// copy constructors 
Student_data(Student_data s1){
   this.name = s1.name ;
   this.roll = s1.roll ;
   marks = new int[3];
   this.marks = s1.marks;
   this.password = s1.password;
   }
// yaha pe aab constructors design karte hai 
// Default constructor
    Student_data(){
    System.out.println("Student constructor is called..");
   }
// Parameterized constructors
   Student_data(String name){
    this.name = name;
    marks = new int[3];
   }
   Student_data(int roll){
    this.roll = roll;
    marks = new int[3];
   }
// yeh hai copy constructor jisme student ka name roll mill raha or naya password hm bana de rahe 
   
}
// in C++ we get copy constructor but in java we have to make the copy constructor 
// ek object(1) ki properties ko object(2) mai save kar dena 