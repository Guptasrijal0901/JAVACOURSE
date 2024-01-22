import java.util.Scanner;

public class areaofcircle {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    float r = sc.nextFloat();
    float area = 3.14f * r * r;
    // 3.14 double value hai toh esko float banane k liye 3.14f likhte hai toh vo float baan jayega 
    System.err.println(area);
    sc.close();
}
}
