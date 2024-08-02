import java.util.ArrayList;

public class arraylistmaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(0);

        int n = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > n) {
                n = list.get(i);
            }
        }
        System.out.println("Max element is: " + n);
    }

}
