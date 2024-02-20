import java.util.Scanner;

public class string_storage {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    sc.close();
    }
}

// 1. **Stack Memory**: Think of the stack like a stack of plates. 
// When you call a method in Java, a plate (or a "stack frame") is added on top.
// When the method finishes, the plate is removed.
// This memory is used for method calls and local variables. 
// It's fast but limited in size.

// 2. **Heap Memory**: Imagine the heap like a big pile of toys. 
// When you create objects in Java, like strings or custom classes, 
// they're stored in the heap. This memory is larger and more flexible than the stack but a bit slower. 
// Objects in the heap persist until no more references point to them.

// 3. **String Interning**: When Java sees a string literal (like "hello"), 
// it checks if it's already in the pool of strings (the "string pool") in the heap. 
// If it is, it reuses that string instead of creating a new one.
// This helps save memory by avoiding duplicate strings.

// Imagine you have a piece of paper with a word written on it. 
// That word is like a string in programming. Now, let's say you want to change one of the letters in that word. 
// With a piece of paper, you'd erase the letter and write a new one in its place. 
// But in programming, with strings being immutable, you can't do that. 
// Instead, you'd have to create a whole new piece of paper with the new word written on it, 
// leaving the original unchanged.

// So, in simple words, when we say a string is immutable, 
// it means that once it's created, you can't change its contents. 
// If you want to modify it, you have to create a new string with the desired changes. 
// This is because strings are treated as fixed and unchangeable in memory.