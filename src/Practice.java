import java.util.LinkedList;
import java.util.Scanner;
public class Practice {
public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        float[] arr = new float[10];
        double sum = 0;
        for (int i = 0;i<10;i++){
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        System.out.println("Mean is "+(sum/N));

        //Sorting Array
    for (int n = arr.length; n > 0; n--) {
        for (int i = 0; i < (n - 1); i++) {
            if (arr[i] > arr[i + 1]) {
                swap2(arr, i, (i + 1));
            }
        }
    }
    System.out.println("Sorted Array");
    for (int i = 0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

        if (N%2 == 0){
            int a = N/2-1;
            int b = a+1;
            float median = (arr[a] + arr[b])/2;
            System.out.println(arr[a]+" "+arr[b]);
            System.out.println("Median is "+median);
        }else {
            System.out.println("Median is "+(arr[(N+1)/2]));
        }

        //For Mode
    LinkedList<Float> val= new LinkedList<Float>();
    LinkedList<Integer> freq = new LinkedList<Integer>();
    val.add(arr[0]);
    int fre = 1;
    for (int i = 1;i<N;i++){
        float prevnum = val.getLast();
        if (prevnum == arr[i]){
            fre++;
        }else {
            val.add(arr[i]);
            freq.add(fre);
            fre = 1;
        }
    }
    freq.add(fre);
    System.out.println("For Mode : ");
    System.out.println(val);
    System.out.println(freq);
    }
    public static void swap2(float[] array, int i, int j) {
        if (i == j) {
            return;
        }
        float temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


