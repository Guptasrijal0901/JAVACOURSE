public class typeconversion {
    public static void main (String arg[]){
    int a = 25;
    long b = a ;
    System.out.println(b);
    // long b = 25;
    // int a = b; nhi ho sakta kyui ki int ki bytes kam h as compare to long ESME LOSSY CONVERSION  HO JISSE DATA LOST HO SAKTA H 
    // CONDITION OF CONVERSION :
    //1. TYPE COMPATIBLE
    //2.DESTINATION TYPE >SOURCE TYPE 
    // BYTES < SHORT < INT < FLOAT < LONG < DOUBLE 
    // ALSO KNOWN AS WIDENING AND IMPLICIT TYPE CONVERSION
}
    
}
