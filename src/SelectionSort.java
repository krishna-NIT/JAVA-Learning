public class SelectionSort {
    public static void main(String[] args){
        int[] array = {112,82,95,85,99};
        System.out.println("Unsorted Array");
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\nSorted Array using selection sort");
    for (int last = array.length-1;last>0;last--){
        int max = 0;
        for (int i =0;i<=last;i++){
            if (array[i]>array[max]){
                max =i;
            }
        }
        swap(array,max,last);
    }

    for (int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
    }


    }
    public static void swap(int[] array, int i, int j){
        if (i==j){
            return;
        }
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
