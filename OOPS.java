public class OOPS {
    public static void main ( String args[]){
        Pen p1 = new Pen(); // we have created a Pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("Yellow");
        System.out.println(p1.color);
    }
}
// 1.
class Pen{
    String color;
    int tip;

    void setColor(String newcolor){
        color = newcolor;
    }

    void setTip (int newtip){
        tip = newtip;
    }
}
// 2. 
class Student {
    String name;
    int age;
    float percentage;


    void setage ( int setage){
        age = setage;
    }

    void setpercentage ( float setpercentage){
        percentage = setpercentage;
    }

    void calpercentage (int math, int phy, int chem){
        percentage = (math + phy + chem)/3;
    }
}
