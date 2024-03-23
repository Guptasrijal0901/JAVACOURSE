public class oops_inheritance{
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
class Fish extends Animals{
    int fins;

    void swim(){
        System.out.println("Swim function ");
    }
}