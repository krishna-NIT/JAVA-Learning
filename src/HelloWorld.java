public class HelloWorld {
    public static void main(String[] args) {
        byte byteNumber = 20;
        short ShortNumber = 30;
        int no = 10;
        long var = 50000 + (10 * (byteNumber + ShortNumber + no));
        short num = (short)(1000+10*(byteNumber + ShortNumber + no));
        System.out.println(var);
    }
}