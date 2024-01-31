import java.util.Scanner;

public class binary_search {
    public static int BinarySearch(int number[], int key ){
    boolean found = false ;
    int start = 0 ;
    int end = number.length-1;
    while (start <= end) {
        
        int mid = (start + end )/2;
        if(number[mid] == key){
            return mid;
        }
        if(number[mid] < key ){
        start = mid + 1;
    }else {
        end = mid - 1 ;
    }
    }
    if (!found){
        System.err.println("NOT FOUND ANY KEY");
    }
    return -1 ;
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int number [ ]= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    System.out.print("Enter key: ");
    int key = sc.nextInt() ;
    System.out.println("Your key is on index number: "+BinarySearch(number, key));
    sc.close();
    }
    }
// its is for sorted arrays only
// array must be in  acending or decending order 
// it is like dictonary 
// pseudo code 
// start = 0 end n = 1 
// while(start <= end )
// find mid 
// compare mid and key 
// mid == key (found)
// mid > key (left)
// mid < key (right)
// binary search code performs better than liner search because 
// its time complexity is less than linear search 
//TC of linear is O(n)
//TC of binary is O(logn)
// and we know logn is smaller than n 