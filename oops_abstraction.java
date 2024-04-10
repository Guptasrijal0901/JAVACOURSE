public class oops_abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        }
}
abstract class Animal{
    void eat (){
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse extends Animal{
void walk(){
    System.out.println("walks on 4 legs");
}
}

class Chicken extends Animal{
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