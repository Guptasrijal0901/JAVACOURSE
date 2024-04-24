public class rec_friends_pairing {

    public static int pairCount(int n){
        if (n == 1 || n == 0) {
            return 1;
        }
        int count1 = pairCount(n-1);
        int count2 = pairCount(n-2);
        int totalCount = count1 + (n-1) * count2;
        return totalCount;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(pairCount(n));
    }
}
// given n friends, each one remain single or can be paired up 
// with some other friends. each friends can be paired only once. 
// find out the total number of ways in which friends
// can remain single or can be paired

// This Java program calculates the total number of ways in which friends can 
// be paired up or remain single. The pairCount method is a recursive function 
// that calculates the number of ways to pair up n friends. \
// The base cases are when n is either 0 or 1, in which case there is only one possibility.

// For n > 1, the method recursively calculates two counts:

// count1: Represents the number of ways to pair up n-1 friends.
// count2: Represents the number of ways to pair up n-2 friends.
// Then, it calculates the totalCount by adding count1 and (n-1) * count2. 
// This is because each person can either pair with someone else or remain single. 
// So, for (n-1) remaining people, there are count2 possibilities of pairing them up, 
// resulting in (n-1) * count2 possibilities.

// Finally, the main method initializes n to 4 
// (you can change it to any desired value), calls the pairCount method with n, 
// and prints the result.