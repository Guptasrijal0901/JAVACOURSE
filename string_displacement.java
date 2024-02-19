import java.util.Scanner;

public class string_displacement {
    public static double displacementOf(String path){
    int x = 0 ;
    int y = 0 ;
    int n = path.length();
    for (int i = 0; i < n; i++) {
        char direction = path.charAt(i);
        // south 
        if (direction == 'S') {
            y--;
        }
        else if (direction == 'N'){
            y++;
        }
        else if (direction == 'W') {
            x--;
        }
        else if(direction == 'E') {
            x++;
        }
    }
    int x2 = x*x;
    int y2 = y*y;
    double displacement = Math.sqrt( x2 + y2);
    return displacement;
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    String path = "WNEENESENNN";
    System.out.println("Displacement of path is: "+displacementOf(path));
    // displacementOf(path);
    sc.close();
    }
}
