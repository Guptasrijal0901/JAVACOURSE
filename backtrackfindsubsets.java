public class backtrackfindsubsets {
    public static void findSubsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);

            }
            return;
        }
        // This checks if the current index i is equal to the length of the string str,
        // meaning we have considered all characters.
        // If the subset ans is empty, it prints "null" (indicating an empty subset).
        // Otherwise, it prints the current subset ans.
        // Finally, it returns from the method.
        // recursion
        // backtrack
        // yes choice
        findSubsets(str, ans + str.charAt(i), i + 1);
        // no choice
        findSubsets(str, ans, i + 1);
        // Yes choice: It includes the current character (str.charAt(i))
        // in the subset and recursively calls findSubsets with the next index (i + 1).
        // No choice: It excludes the current character and recursively calls
        // findSubsets with the next index (i + 1).
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
// backtracking steps
// TC = O(n*2^n)
// SC = O(n)