import java.util.Scanner;

public class matrix_sorting {
    public static boolean stairCaseSorting(int matrix[][], int key){
    int n = matrix.length;
    int row = 0 ;
    int col = n-1;
    while (row < n && col >= 0 ) {
        if (matrix[row][col] == key) {
            System.out.println(key + " Found at (" + row + "," + col + ")");
            return true;
        }
        else if (key < matrix[row][col]) {
            col--;
        }else{
            row++;
        }
    }
    System.out.println(key + " Not Found!");
    return false;
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int matrix[][]= {{10, 20, 30, 40,},
                    {15, 25, 35, 45},
                    {27, 29, 37, 48},
                    {32, 33, 39, 50}};
    int key = 33 ;
    stairCaseSorting(matrix, key);
    sc.close();
    }
}
// 1st approach
// this matrix is sorted row wise and col wise both 
// brute force method approach mai hm sare elements pe jayenge 
// or check karenge ki key is same or not 
// agar same hai return kar denge 
// but hamhare pass sorted matrix tha row wise or col wise dono 
// toh hmne usse use hi nhi kiya 
// jisse TC hmhara O(n2) mila jo ki bhut bura hai 
// 2nd approach 
// row wise sort karenge jisse hme TC O(nlogn) milega 
// but row wise searh mai hme col sorted ka toh use nhi kiya 
// toh hm karenge staircase searching 
// 40 and 32 are special key 
// agar hm 40 se start karte hai toh hme ek traf baada oe ek traf choota element mill raha hai 
// vaise hi 32 se bhi hme ek traf baada or ek traf choota element mill raha hai 
// jabki 10 yaa fir 50 se hme 
// 10 k dono traf baade element hai 
// 50 k dono traf choote element hia toh kidhar move karenge 
// (0, n-1) element mai agar 
// key ki value choti ho toh left move karenge 
// agar key bada ho (cell value se) toh bottom move karenge 
// (0, n-1) element mai agar 
// key value is less than cell value move to top
// else key value is greater than cell value move to right 
// (0, n-1) or (0, n-1) dono mai se koi bhi value ko le k hm start kar sakte hai or answer nikal sakte hai 
// TC of this is O(n + m)  n: row m: col