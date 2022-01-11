import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String lis[] = new String[n];
        for (int i = 0;i<n;i++){
            lis[i] = scan.nextLine();
        }
        System.out.println(mostWordsFound(lis));
    }

    

    public static int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (int i=0;i<sentences.length;i++){
            int count = 1;
            for (int j=0;j<sentences[i].length();j++){
                if (sentences[i].charAt(j)==' '){
                    count++;
                }
            }
            if (sentences[i].charAt(sentences[i].length()-1) == ' '){
                count--;
            }
            if (sentences[i].charAt(0) == ' '){
                count--;
            }
            if (count>ans){
                ans = count;
            }
        }
        return ans;
    }

//    int[] brr = new int[n];
//
//        for (int i = 0;i<n;i++){
//        int index = 0;
//        int a = arr[i];
//        int b = Integer.MAX_VALUE;
//        for (int j = 0;j<n;j++){
//            if (a < arr[j] && b>arr[j]){
//                b = arr[j];
//            }
//        }
//
//
//        brr[i] = b;
//        arr[index] = a;
//    }
//
//
//    int count = 0;
//        for (int i = 0;i<n;i++){
//        if (arr[i] < brr[i]){
//            count++;
//        }
//        System.out.print(brr[i]+" ");
//    }
//
//        System.out.println();
//        System.out.println(count);

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int N = scan.nextInt();
//        int M = scan.nextInt();
//        int K = scan.nextInt();
//
//        int[] a = new int[N];
//        int[] b = new int[M];
//
//        for (int i= 0;i<N;i++){
//            a[i] = scan.nextInt();
//        }
//        for (int i= 0;i<M;i++){
//            b[i] = scan.nextInt();
//        }
//        int maxbook = 0;
//        int ai = 0;
//        int bi = 0;
//
//        while (K>0 && ai < N && bi < M) {
//            int minus = a[ai];
//            if (a[ai] > b[bi]) {
//                minus = b[bi];
//                bi++;
//            }else {
//                ai++;
//            }
//
//            if (K-minus >= 0) {
//                K -= minus;
//                maxbook++;
//            }else {
//                System.out.println(maxbook);
//                return;
//            }
//        }
//        if (ai < N && bi >= M && K>0){
//            if (K-a[ai] >= 0) {
//                maxbook++;
//                K -= a[ai];
//            }else {
//                System.out.println(maxbook);
//                return;
//            }
//            ai++;
//        }
//        if (ai >= N && bi < M && K>0){
//            if (K-b[bi] >= 0) {
//                maxbook++;
//                K -= b[bi];
//            }else {
//                System.out.println(maxbook);
//                return;
//            }
//            bi++;
//        }
//        System.out.println(maxbook);
//    }

    public String addSpaces(String s, int[] spaces) {
        String ans = "";
        for (int i =0;i<spaces.length;i++){
            int loc = spaces[i];
            
        }
        return ans;
    }

    public static int ispossible(String s, String com){
        int ans = 0;
        for (int i = 0;i<s.length()-1 && i<com.length()-1;i++){
            int a1 = (int) s.charAt(i);
            int a2 = (int) s.charAt(i+1);
            int b = (int) com.charAt(i);
            int b2 = (int) com.charAt(i+1);
            if (a1 > b){
                return ans;
            }else if (a2 > b){
                return ans+1;
            }
            if (a1 > b2){
                return ans+1;
            }
            if (a1 > a2){
                //swap
                s = charinterchage(s,i,i+1);
                ans++;
            }
        }
        if (ans == 0){
            ans = -1;
        }
        return ans;
    }
    public static String charinterchage(String s, int i, int j){
        String fin = "";
        if (i != 0){
            fin += s.substring(0,i);
        }
        fin += s.charAt(j);
        fin += s.charAt(i);
        if (j != s.length()-1){
            fin += s.substring(j+1,s.length());
        }
        return fin;
    }












    //        double doublevar = 22.85;
//        double doublevar2 = 80.00;
//        double p = (doublevar+doublevar2)*100.00;
//        double rem = p % (40.00);
//
//        boolean val = (rem == 0) ? true : false;
//
//        System.out.println(val);
//        if(!val){
//            System.out.println("Got some Reminder");
//        }
//
//        long pri = toMilesPerHour(-5.6);
//        System.out.println(pri);
//
//        printConversion(25.42);
//
//
//        boolean a = shouldWakeUp(false,2);
//        System.out.println(a);
//
//        printMegaBytesAndKiloBytes(5000);
//
//        boolean bhagwat = areEqualByThreeDecimalPlaces(-3.1756d,-3.175d);
//        System.out.println("3 Decical Output  :  " +bhagwat);
//
//        printYearsAndDays(561600);


    //Playing Cat
    public static boolean isCatPlaying(boolean summer, int temperature){
        if ( temperature<=45 && temperature>=25){
            if (summer == true){
                return true;
            }else if (temperature<=35){
                return true;
            }else{
                return false;
            }
        } else {
            return false;
        }
    }



    //Entity Printer
    public static void printEqual(int a, int b, int c){
    if (a<0 || b<0 || c<0){
        System.out.println("Invalid Value");
    } else if (a==b && b==c){
        System.out.println("AA numbers are equal");
    } else if (a!=b && b!=c && a!=c){
        System.out.println("All numbers are different.");
    } else{
        System.out.println("Neither all are equal or different.");
    }
    }



    //Min to Years and Days Calculator
    public static void printYearsAndDays(long minutes){
        if ( minutes >= 0){
            int YY = (int)(minutes/525600);
            int ZZ = (int)( (minutes%525600) / 1440);
            System.out.println(minutes+" min = "+YY+" y and "+ZZ+" d");
        }else{
            System.out.println("Invalid Value");
        }
    }


    //Area Cal of circle and Rectangle
    public static double area(double radius){
        if (radius >= 0){
            return (radius*radius*Math.PI);
        }else{
            return -1;
        }
    }

    public static double area(double x, double y){
        if (x >= 0 && y >=0){
            return (x*y);
        }else{
            return -1;
        }
    }



    // 3decimal with Decimal Error


    public static boolean areEqualByThreeDecimalPlaces(double a,double b){
        int tempa = (int)a;
        int tempb = (int)b;
        System.out.println(tempa+""+tempb);

        int a3dec = (int)((a-tempa)*1000);
        int b3dec = (int)((b-tempb)*1000);
        System.out.println(a3dec+""+b3dec);
        System.out.println(b-tempb);

        if (tempa == tempb && a3dec == b3dec){
            return true;
        }else{
            return false;
        }
    }

    // 3 Deciamls

    public static boolean areEqualByThreeDecimalPlacesexact(double firstValue, double secondValue) {
        int moveThreeDecimalPlacesToRight = (int) Math.pow(10, 3);
        return (int) (firstValue * moveThreeDecimalPlacesToRight) == (int) (secondValue * moveThreeDecimalPlacesToRight);
    }


    // km miles converter

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }else {
            int mph = (int) (kilometersPerHour * 2/3);
            long retval = mph;
            return retval;
        }
    }
    public static void printConversion(double kilometersPerHour){
        double milesHr = (kilometersPerHour * 2/3);
        long mile = Math.round(milesHr);
        if (kilometersPerHour >=0){
            System.out.println(""+kilometersPerHour +" Km/h = "+mile +" mi/h"   );
        }else{
            System.out.println("Invalid Value");}
    }



    // Mile Convertor Exact Ans
    public static long toMilesPerHourexact(double kilometersPerHourexact) {
        if (kilometersPerHourexact < 0d) {
            return -1L;
        }

        return Math.round(kilometersPerHourexact / 1.609d);
    }

    public static void printConversionexact (double kilometersPerHourexact) {
        if (kilometersPerHourexact < 0d) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHourexact(kilometersPerHourexact);
            System.out.println(kilometersPerHourexact + " km/h = " + milesPerHour + " mi/h");
        }
    }




    // megabytes converter
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes>=0) {
            int ZZ = kiloBytes % 1024;
            int YY = (int) (kiloBytes / 1024);
            System.out.println(kiloBytes + " KB = " + YY + " MB and " + ZZ + " KB");
        }else{
            System.out.println("Invalid Value");
        }
    }

    // Barking Dog
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (barking == true) {
            if (hourOfDay <= 23 && hourOfDay >= 0) {
                if (hourOfDay < 8 || hourOfDay > 22) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }else{
            return false;
        }
    }


    //Equal Sum Checker
    public static boolean hasEqualSum(int p, int q, int r){
        if (p+q == r){
            return true;
        }else{
            return false;
        }
    }



    //teen no checker
    public static boolean hasTeen(int q,int w, int r){
        if ((q <=19 && q>=13) || (w <=19 && w>=13) || (r <=19 && r>=13) ){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isTeen(int no){
//        if (no>=13 && no<=19){
//            return true;
//        }else{
//            return false;
//        }
        boolean bol =  (no>=13 && no<=19) ? true : false;
        return bol;
    }
}



