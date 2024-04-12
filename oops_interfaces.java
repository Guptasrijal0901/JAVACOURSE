public class oops_interfaces {
    public static void main(String[] args) {
        Queen Q = new Queen();
        Q.move();
    }
}
interface ChessPlayer{
    void move();
// blue print bana diye move ki
// by default public, abstract, yaha pe hm implementation nhi likh sakte kyu ki hme esse abstract karna hai 
}
class Queen implements ChessPlayer{
    public void move(){
        System.out.println("up, left, down, right, diagonal (in all four dircetion)");
    }
}
class Rook implements ChessPlayer{
    public void move(){
        System.out.println("up, left, down, right");
    }
}
class King implements ChessPlayer{
    public void move(){
        System.out.println("up, left, down, right, diagonal (by 1 step)");
    }
}
// class is blueprint of object 
// interface is blue is bhule print of class
// hierarcy in code can be done with the help of interfaces
// car kaisi hogi vo batayenge fir maruti 800 kaisi hogi vo batayenge 
// fir actuall maruti 800 banayenge 
// work of intterfaces
// 1. to implement multiple inheritance 
// 2. to achieve total abstraction 
// properties:
// 1. all methods are public, abstract and without implementation
// 2. used to achieve total abstraction
// 3. variables in the interface are final, public and static
// interface -> implements
// syntax for multiple inheritance 
interface herbivore{
 void eat();
}
interface carnivore {
 void eat();
}
class bear implements herbivore, carnivore{
 public void eat(){
    System.out.println("eat both");
}
}