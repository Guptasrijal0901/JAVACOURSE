public class rec_print_inc_n {
    public static void printInc(int n){
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printInc(n-1);  
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }
}
