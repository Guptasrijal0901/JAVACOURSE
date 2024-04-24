public class rec_duplicates_string {
    public static void removeDup(String str, int idx, StringBuilder newStr, boolean map[]){
        // base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // kaam
        char cureChar = str.charAt(idx);
        if (map[cureChar-'a'] == true) {
            // duplicate
// If map[cureChar-'a'] is true, 
// it means that the current character has been encountered before and 
// is a duplicate. In this case, you recursively call removeDup with 
// the next index (idx+1) without appending the duplicate character to newStr. 
// This effectively skips the duplicate character.
        removeDup(str, idx+1, newStr, map);
        }
        else{
            map[cureChar-'a'] = true;
// Setting map[cureChar-'a'] to true means marking the current character as encountered. 
// This ensures that if the same character appears later in the string, 
// it will be recognized as a duplicate and skipped.
            removeDup(str, idx+1, newStr.append(cureChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "apnnacollege";
        removeDup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
