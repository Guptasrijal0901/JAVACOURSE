import java.util.Scanner;
public class bit_update {
public static int clearith(int num , int i ){
        int bitMask = 1<<i;
        return (~(bitMask) & num);
    }
public static int setith (int num , int i ){
        int bitMask = 1 << i;
            return num | bitMask;
    }
public static int updateIthBit(int num , int i , int newBit){
    if(newBit == 0 ){
        return clearith(num, i);
    }else{
        return setith(num, i);
    }
    }
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        sc.close();
        }
    
}
