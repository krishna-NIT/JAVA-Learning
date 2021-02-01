public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {45, 630, 280, 190, 5};
        System.out.println("UNSorted Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
//INSERTION SORT ALGORITHM


//printing of sorted
        System.out.println("\nSorted List");
        for (int i = 0; i < array.length; i++) {
                   }
    }
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
