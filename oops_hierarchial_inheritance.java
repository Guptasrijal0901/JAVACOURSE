public class oops_hierarchial_inheritance {
    public static void main(String[] args) {
        Mammal Cow = new Mammal();
        Cow.legs = 4;
        System.out.println(Cow.legs);
    }
}
class Animals {
    String Eat;
    int age;
    void eat(){
        System.out.println("Can eat");
    }
    void breathe(){
        System.out.println("Can breathe");
    }
}
class Mammal extends Animals{
    int legs;
    void walk(){
        System.out.println(" Mammals  can walk");
    }
}
class Fish extends Animals{
    void swim(){
        System.out.println("Fish can swim");
    }
}
class Birds extends Animals {
    void Fly (){
        System.out.println("Birds can fly");
    }
}