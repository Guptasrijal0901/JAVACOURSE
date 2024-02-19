import java.util.Scanner;

public class string_substring {
    public static void subString(int si, int ei, String str ){
        // String substr = "";
        for(int i = si; i < ei ; i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    String str = "HelloWorld";
    // subString(0, 4, str);
    // alternative 
    System.out.println(str.substring(0, 5));
    sc.close();
    }
}
// substring mtlb ek choota sa part kisi string ka 
// jo consicutively hmhare string se bana hua hai 
// kisi bhi string ka continuos hissa 
// aage k words hone chahiye aisa nhi ki bech k letters miss ho 
// vo subsequence kheleta ahi 
// ending string no inclusive hota hai 