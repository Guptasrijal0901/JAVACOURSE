import java.util.Scanner;

public class selection_sort {
public static void selectionSort(int array []){
    int n = array.length;
for(int i = 0 ; i < n ; i++){ // yaha pe turns count kiye hai 
    int minPOS = i ; // current position ko hi min position maan li hhai 
    for(int j = i + 1 ; j < n ; j++){ // aage k unsorted part mai min khoj k nikala hai 
        if(array[minPOS] > array[j]){
            minPOS = j ; // minimum value ko update kar diya hai 
        }
    }
    // swapping 
    // loop k bhar karenge tbhi vo selection sort hoga warna vo bubble sort ho jayega 
    // yaha pe hmne minimum value ko hmne apne current position ko swap kar diya hai 
    int temp = array[minPOS];
    array[minPOS] = array[i];
    array[i] = temp;
}
}
public static void printarray(int array[]){
    int m = array.length;
    for ( int i = 0 ; i < m ; i++){
        System.out.print(array[i] + " ");
    }
    System.out.println();
}
// yaha pe hm print karwa rahe hai array ko 
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int array [] = {5, 4, 1, 3, 2};
    selectionSort(array);
    printarray(array);
    sc.close();
    }
}
// IDEA : PICK THE SMALLEST (FROM UNSORTED), PUT IT AT THE BEGINNING
// ESME SARE ELEMENT MAI SE SMALLEST NIKAL LETE HAI OR USKO AAGE PLACE KAR DETE HAI 
// FIR REST ELEMENT KO COMPARE KARTE HAI OR USME SE SABSE CHOOTE KO AAGE PLACE KAR DETE HAI 
// ESME BUBBLE KI TRAH HAMESHA SWAP KAENE KI ZARURAT NHI HAI 