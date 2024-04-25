public class rec_binary_string {
    public static void countBinaryString(int N, int lastPlace, String str){
        // base case
        if ( N == 0) {
            System.out.println(str);
            return;
        }
        // kaam 
        if (lastPlace == 0) {
            // sit 0 on chair n
            countBinaryString(N-1, 0, str+("0"));
            countBinaryString(N-1, 1, str+("1"));
        }else{
            countBinaryString(N-1, 1, str+("0"));
        }
        // choota code
        // countBinaryString(N-1, 0, str.append("0"));
        // 0 ko th haar baar bethana hi hai 
        // if (lastPlace == 0) {
        //     countBinaryString(N-1, 1, str.append("1"));
        // }
// agar last place 0 thi toh 1 beth sakta hai 
// agar 1 nhi thi toh 1 nhi beth sakta 0 beth jayega 
// 
    }
    public static void main(String[] args) {
        countBinaryString(3, 0, "");
    }
}
// print all binary strings of size N without consecutive ones.