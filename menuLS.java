import java.util.Scanner;

public class menuLS {

    public static void menu(String menulist[], String key){
        boolean found = false ;
        for (int i = 0 ; i < menulist.length ; i++ ){
        if ( menulist[i].equalsIgnoreCase(key) ){
        System.out.println(i);
        found = true;
        break;
        }
        }
        if(!found){
        System.out.println("NOT FOUND");
        }
        }
     public static void main (String arg[]){
    
    Scanner sc = new Scanner(System.in);
    String menulist[] = {"dal_chawal" ,"paneer" , "momos" , "chola_bathura" , "rajma_chawal" , "chilly_panner", "Dhokla"};
    System.out.println("Find your dish: ");
    String key = sc.nextLine();
    menu(menulist, key);
    sc.close();
    } 
}
// time complexity : ek loop kitna time leti hai output dene mai 