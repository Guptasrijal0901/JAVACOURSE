public class oops_superkeyword {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Horse h1 = new Horse();
        System.out.println(h1.color);
    }
}
class Animal {
    String color ;
    Animal(){
        System.out.println("Animal constructor is called ");
    }
}
class Horse extends Animal {
    Horse(){
        // super();
        super.color = "brown";
        // System.out.println(super.color);
// from this animal class constructor call ho jayega 
// super means immediate parent class 
        System.out.println("Horse constructor is called");
    }
}
// this keyword is used to reffer current object
// super keyword is used to refer immediate parent class object 
// -> to access parent's properties
// -> to access parent's function 
// -> to access parent's constructor 