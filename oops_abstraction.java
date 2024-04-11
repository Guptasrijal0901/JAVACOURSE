
public class oops_abstraction {
    public static void main(String[] args) {

        Mustang myHorse = new Mustang();
// just to see the hierarcy we do this 
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.skin_color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(c.skin_color);
        }
}
abstract class Animal{
    String skin_color;
    Animal(){
    skin_color = "Brown";
    System.out.println("Animal constructor called");
    }
    void eat (){
        System.out.println("Animal eats");
    }
    abstract void walk();
// yaha se hme sirf idea mill gya ki walk karna hai
// idea diya  
}

class Horse extends Animal{
Horse (){
    System.out.println("Horse constructor called");
}
void change_skin_color(){
    skin_color = "dark brown";
} 
void walk(){
    System.out.println("walks on 4 legs");
}

// yaha pe hmne animals k according walk function kar rahe 
// vaha pe idea tha yah ape implementation ho raha 
// implementation kiya 
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}
class Chicken extends Animal{
    void change_skin_color(){
        skin_color = "light brown";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}
// hiding all the unnecessary details and showing only the important parts to the user 
// abstraction can be implement in 2 ways 
// 1. abstract classes
// 2. interfaces
// give idea of implementation but actually implement this 
// how to create abstrat classes:
// 1. cannot create create an instance(we cannot create object) of abstract class 
// 2. can have abstract/non-absttract methods
// 3. can have constructors
// abstract class A {}
// abstract void fun(){}