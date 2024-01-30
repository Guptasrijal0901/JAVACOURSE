import java.util.Scanner;

public class linearSearchARRAY {
    public static void birthday(int day[], int key ){
        boolean found = true;
        for (int i = 0 ; i < day.length ; i++){
        if (day[i] == key) {
            System.out.println(i);
            found = true;
            break;
        }if (!found) {
            System.out.println("NOT FOUND ");
        }
        }
        }
    public static void main (String arg[]){
      
    Scanner sc = new Scanner(System.in);
    int day [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int key = 9 ;
    birthday(day, key);
    sc.close();
    }
}
// like in menu we search for somthing particular in sequence wise this is linear search 
// in lenear search we find the index number of the given value to find 