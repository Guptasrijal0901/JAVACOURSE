public class oops_static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "AFS";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
// schoolname hmne static banaya hai esliye yeh s1 wala hi dega 
    }
}
class Student{
    String name ;
    int roll;

    static String schoolName;

    void setName(String name ){
        this.name = name;
    }

    String getName (){
        return this.name;
    }

    void setroll(int roll ){
        this.roll = roll;
    }

    int getroll (){
        return this.roll;
    }
}
// static keyword in java is used to share the same variable or method of a given class 
// properties
// function 
// blocks
// nested classes