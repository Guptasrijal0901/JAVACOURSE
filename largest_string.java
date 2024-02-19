import java.util.Scanner;

public class largest_string {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    String fruits[] = { "apple", "mango", "banana"};

    String largest = fruits[0];
    for(int i = 0 ; i < fruits.length ; i++){
      if (largest.compareTo(fruits[i]) < 0) {
          largest = fruits[i];
      }
    }
    sc.close();
    System.out.println(largest);
    }
}
// lexicographic order 
// Sure! Le​xicographic order is a way of arranging things, 
// like words or numbers, based on their order in the alphabet or in a sequence.
// Imagine you have a list of words. To put them in lexicographic order, 
// you would look at the first letter of each word. 
// The word that comes first in the alphabet would go first in the list. 
// If two words have the same first letter, you'd move on to the next letter to decide which comes first. 
// You keep doing this until all the words are in order. 

//For example, let's say you have these words:
// "apple", "banana", "cat", and "zebra". 
// - "apple" comes before "banana" because "a" comes before "b".
// - "banana" comes before "cat" because "b" comes before "c".
// - "cat" comes before "zebra" because "c" comes before "z".

// So, the lexicographic order of these words would be: 
// "apple", "banana", "cat", "zebra". 

// It's like organizing a dictionary—you start with the first letter, 
// and if they match, you move to the second letter, and so on until you find the order.
// compareTo() function se hm find kar sakte hai 
// = 0: equal
// < 0: -ve str1 < str2
// > 0: +ve str1 > str2
// comparetoIgnorecase jo ki case sensitive nhi hota hai 
// compareTo case sensitive ho hai 