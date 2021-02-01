public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {45, 630, 280, 190, 5};
        System.out.println("UNSorted Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
//BUBBLE SORT

        System.out.println("\nSorted Array using bubble Sort Algorithm");
        for (int n = array.length; n > 0; n--) {
            for (int i = 0; i < (n - 1); i++) {
                if (array[i] > array[i + 1]) {
                    swap2(array, i, (i + 1));
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void swap2(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}

