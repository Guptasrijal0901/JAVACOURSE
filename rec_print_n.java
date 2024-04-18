public class rec_print_n {

    public static void printDec(int n){
    // yaha pe base class define kar diye 
        if (n == 1) {
            System.out.println(n);
            return; // yaha pe 1 print hone k baad return kar jayenge -1 pe jayenge hi nhi 
        }
    // yaha par print karwa diye 
        System.out.print(n + " ");
    // fir yaha par function ko choota kar diye 
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n = 10 ;
        printDec(n);
    } 
}
// call stack: jaise jaise function call ho rahi vaise vaise stack banta hai usse call stack bolte hai 
// stack overflow: 1. too many parameter memory 2. too many function calls
// jab base case hata denge toh hmhare pass stack overflow ho jayega 