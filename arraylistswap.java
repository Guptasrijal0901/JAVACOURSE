import java.util.ArrayList;

public class arraylistswap {
    public static void swap(int inx1, int inx2, ArrayList<Integer> list) {
        int temp = list.get(inx1);
        list.set(inx1, list.get(inx2));
        list.set(inx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(0);
        System.out.println("Array before swapping: " + list);
        int inx1 = 1;
        int inx2 = 4;
        swap(inx1, inx2, list);
        System.out.println("Array after swaping" + list);

    }

    

}
