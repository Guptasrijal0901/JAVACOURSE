import java.util.Scanner;

public class counting_sort {
    public static void countingSort(int array[] ){
    // yaha pe hm largest value find karenge till that index 
    int n = array.length;
    // int largest = Integer.MIN_VALUE;
    // for (int i = 0 ; i < n; i++){
    // largest = Math.max(largest, array[i]);
    // // System.out.println("largest till index "+ i +" is "+ largest);
    // }
    // yaha pe aab hm new array banayenge or usme frequency of number store karenge 
    // count array count karege ki hmhara frequency count karta ha kon sa number kitni baar hai 
    // essi wajha se range hmara esme choota hi hota hai 
    int count[] = new int [n]; // ek naya array bana liye 
    for (int i = 0 ; i < n; i++){
    count [array[i]]++;
    }
    // sorting 
    // wahi jab frequency jab 1 se zayfda hai toh ek baar store karte hai or uske baad decrease by 1 kar dete hai 
    int j = 0 ;
    for (int i = 0; i < count.length; i++ ){
        while(count[i] > 0 ){
        array[j] = i ;
        j++; // position hai aage jane k liye 
        count[i]--; // count array mai decrease karne k liye ki yeh value ek baar store ho gyi aab esko ek decrease kar do
        }
    }
    }
    public static void printarray(int array[]){
        int m = array.length;
        for ( int i = 0 ; i < m ; i++){
        System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        int array [] = {1, 4, 5, 2, 5, 7, 3, 2, 5, 7, 0};
        countingSort(array);
        printarray(array);
        sc.close();
        }
}
// vaha use karte hai jaahaa min se maximum se range jo hai vo chotti ho 
// phele hm number ki range decide karenge 
// fir ek new array banayenge 
// new array mai haar number ki frequency likhenge 
// uske baad purane array mai frequency k hisab se lumber dalenge 
// or ek ek kar k frequency ko reduce bhi karte rahenge 
// TC  O(n + range)
