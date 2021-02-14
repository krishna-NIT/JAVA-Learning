// Write your code here. DO NOT use an access modifier in your class declaration.
class SampleDemo implements Runnable{
    private Thread t;
    private String threadName;
    SampleDemo(String threadName){
        this.threadName = threadName;
    }
    public void run(){
        while (true){
            System.out.println("threadName");
        }
    }
    public void start(){
        if (t==null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}
public class Main{
    public static void main(String[] args){
        SampleDemo A = new SampleDemo("A");
        SampleDemo B = new SampleDemo("B");
        B.start();
        A.start();
    }
}
//interface  BaseI { void method();}
//class BaseC{
//    public void method(){
//        System.out.println("Inside BaseC::method");
//    }
//}
//class ImpIC extends BaseC implements BaseI {
//    public static void main(String []s){
//        (new ImpIC()).method();
//    }
//}
////
////public class Main{
////
////    interface  BaseI { void method();}
//    class BaseC{
//        public void method(){
//            System.out.println("Inside BaseC::method");
//        }
//    }
//    class ImpIC extends BaseC implements BaseI{
//        public static void main(String []s){
//            (new ImpIC()).method();
//        }
//    }
//}
//
