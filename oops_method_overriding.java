public class oops_method_overriding {
    public static void main(String[] args) {
    Deer D = new Deer();
    D.eat();
    }
}
// parent and child classes both contain the same function with a different definition.
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}