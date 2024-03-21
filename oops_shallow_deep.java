public class oops_shallow_deep {

    public static void main(String[] args) {
        Data d1 = new Data();
        d1.name = "Srijal Gupta";
        d1.age = 23 ;
        d1.course = "B.Tech";
        d1.marks = new double [3];
        d1.marks[0] = 9;
        d1.marks[1] = 8;
        d1.marks[2] = 9.5;
        d1.Password = "pass1";

        Data d2 = new Data(d1);
        d2.Password = "pass2";
        d1.marks[2] = 10;
    System.out.println("Name: " + d1.name);
    System.out.println("Age: " + d1.age);
    System.out.println("Course: " + d1.course);
    for (int i = 0 ; i < 3  ; i++){
        System.out.println("Marks "+ i +" : "+ d2.marks[i]);
    }
    }
}
class Data{
    String name ;
    int age ;
    String course ;
    double[] marks;
    String Password;
    // shallow copy constructor
    // Data (Data d1){
    //     this.name = d1.name;
    //     this.age = d1.age;
    //     this.course = d1.course;
    //     
    // }
    // deep copy constructor
    Data (Data d1){
      marks = new double[3];
      this.course = d1.course;
      this.age = d1.age;
      this.name = d1.name;  
      for (int i = 0 ; i < marks.length ; i++){
      this.marks[i] = d1.marks[i];
      }
    }
    Data (){
        System.out.println("Constructor is called...");
    }
    Data(String name){
        this.name = name;
    }
}
