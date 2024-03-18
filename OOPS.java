public class OOPS {
    public static void main ( String args[]){
        Pen p1 = new Pen(); // we have created a Pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("Yellow");
        System.out.println(p1.color);

        BankAccount myAccount = new BankAccount();
        myAccount.username = "srijal";
        //myAccount.password = ""; is not visible 
        
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
// enn sab function se hm properties ko update kar sakte hai when we required 
    void setpercentage ( float setpercentage){
        percentage = setpercentage;
    }
// fUnction to calculate pecentage
    void calpercentage (int math, int phy, int chem){
        percentage = (math + phy + chem)/3;
    }
}
// 3.
class BankAccount {
    public String username;
    @SuppressWarnings("unused")
    private String password;
    public void setpassword (String pswd){
    password = pswd;
    }
}