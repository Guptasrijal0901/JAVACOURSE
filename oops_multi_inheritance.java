public class oops_multi_inheritance {
        public static void main(String[] args) {
            Dog dobby = new Dog();
            dobby.legs = 4 ;
            dobby.eat();
            System.out.println(dobby.legs);
            dobby.breathe();
// All propertoes can be use because they all are inheritance property.
        }
    }
    class Animals {
        String color;
    
        void eat(){
            System.out.println("Eats function");
        }
    
        void breathe(){
            System.out.println( "Breathe function");
        }
    }
class Mammal extends Animals{
    int legs;
}
class Dog extends Mammal{
    String breed;
}