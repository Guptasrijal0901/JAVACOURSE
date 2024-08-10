import java.util.ArrayList;

public class arraylistmultiD {
    public static void main(String[] args) {
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(0);
        // list.add(1);
        // list.add(2);
        // mainList.add(list);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3);
        // list2.add(4);
        // list2.add(5);
        // mainList.add(list2);

        // for (int i = 0; i < mainList.size(); i++) {
        // ArrayList<Integer> currlist = mainList.get(i);
        // for (int j = 0; j < currlist.size(); j++) {
        // System.out.print(currlist.get(j) + " ");
        // }

        // System.out.println();
        // }
        // System.out.println(mainList);

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
            list4.add(i * 4);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        mainList.add(list4);

        System.out.println(mainList);
        System.out.println();

        // nested loop to print in the form of matrix
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
