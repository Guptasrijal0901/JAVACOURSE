public class oops_static {
    public static void main(String[] args) {
// yeh ek static function hai ek hi main function jo ki static keyword se define hota hai 
        Student s1 = new Student();
        s1.schoolName = "AFS";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
// schoolname hmne static banaya hai esliye yeh s1 wala hi dega 
        Student s3 = new Student();
        s3.schoolName = "mmmut";
        System.out.println(s3.schoolName);
    }
}
class Student{
    static int returnPercentage(int maths, int phy, int chem){
        return (maths + phy + chem)/3;
    }
// static k wajha se mulyiple creation nhi hoti memory mai 
// bhut sari memory use nhi hoti 
// same function ko yaa value ko baar baar use kar sakte hai 
// baar hme school ka naam nhi store karwana padega 
// baar hme percentage k liye function nhi likhna padege 
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