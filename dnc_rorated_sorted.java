public class dnc_rorated_sorted {
    public static void main(String[] args) {
        
    }
}
// search in rotated sorted array 
// input: sorted,rotated array with distinct numbers(in ascending order)
// it is rotaed at a pivot point. fing the index of given element
// arr = {4, 5, 6, 7, 0, 1, 2}
// target: 0
// output: 4
// we can do this with linear(O(n)) search too but to get nlogn we can use divide and conqure 
// approach: modified search