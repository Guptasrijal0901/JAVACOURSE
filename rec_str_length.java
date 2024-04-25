public class rec_str_length {
    public static int strCount(String str, int n){
        if (str.length() == n) {
            return 0;
        }
        int count = strCount(str, n+1);
        int totalCount = 1 + count;
        return totalCount;
    }
    public static void main(String[] args) {
        String str = "srijal";
        System.out.println(strCount(str, 0));
    }
}
