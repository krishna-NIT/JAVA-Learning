public class Main {
    public static void main(String[] args){
        System.out.println("Ok Testing");
        Addition set1 = new Addition();

        int p = set1.getA();
        int q = set1.getB();
        int r = set1.getC();

        System.out.println(set1.addm(p,q,r)+" "+set1.mulm(p,q,r));
    }

}
