import java.util.ArrayList;

public class arraylistmultiD {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        mainList.add(list2);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currlist = mainList.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j) + " ");
            }

            System.out.println();
        }
        System.out.println(mainList);
    }


    

}
