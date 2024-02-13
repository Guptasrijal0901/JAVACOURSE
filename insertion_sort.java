import java.util.Scanner;

public class insertion_sort {
    public static void insertionSort(int array[]){
    int n = array.length;
    for (int i = 1 ; i < n ; i++ ){
    int current = array[i] ;
    int previous = i-1;
    // finding out the tha correct position to insert
    while(previous >= 0 && array[previous] > current){
        array[previous+1] = array[previous]; // yah ape hm piche push kar rahe 
        previous--;
    }
    // insertion 
    array[previous+1] = current;
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
    int array [] = {5, 4, 1, 3, 2};
    insertionSort(array);
    printarray(array);
    sc.close();
    }
}
// pick an element (from unsorted part) & place in the right position in sorted part 
// compare karenge agar number(from un-sorted mai se) chota hai toh piche push kar denge bade wale number(from sorted part) ko 
// agar number(unsorted mai se) 
// bade wale number ko unsorted part se ek place piche shift karte hai 
// TC is O(n) bubble insertion and selection all 3 is not optimized solution 
// but important for exams 