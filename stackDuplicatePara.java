public class stackDuplicatePara {
    public static boolean isDuplicate(String str )

    public static void main(String[] args) {
        String str = "((a+b))";
        String str2 = " (a+b)";
        System.out.println(isValid(str));
        System.out.println(isValid(str2));
    }
}
// TC: O(n)