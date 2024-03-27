public class oops_multi_inheritance {
        public static void main(String[] args) {
            
        }
    }
    class Animals {
        String color;
    
        void eat(){
            System.out.println("Eats function");
        }
    
        void breathe(){
            System.out.println( " Breathe function");
        }
    }
class Mammal extends Animals{
    int legs;
}
class Dog extends Mammal{
    String breed;
}