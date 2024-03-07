public class oops_gettersNsetters {
    public static void main ( String args[]){
        Pen p1 = new Pen(); // we have created a Pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getcolor());
        p1.setTip(5);
        System.out.println(p1.gettip());
        p1.setColor("Yellow");
        System.out.println(p1.getcolor());
    }
}
class Pen{
    private String color;
    private int tip;
    
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    void setColor(String newcolor){
        color = newcolor;
    }

    void setTip (int newtip){
        tip = newtip;
    }
}
// this keyword is used to refer to the current object 