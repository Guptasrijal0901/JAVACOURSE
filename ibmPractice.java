public class ibmPractice {
    public static void maxSubarray(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max subarray sum is: " + ms);

    }

    public static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; i < array.length - 1 - i; j++) {
                if (array[i] > array[j + 1]) {
                    // swapping
                }
            }
        }
    }

    public static void main(String[] args) {

    }

}
