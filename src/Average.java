public class Average extends SumAverage {


    public static double getAvg(double p,double q,double r){

        double avg = (p+q+r)/3;
        return avg;
    }

    public static void main(String[] args){
        SumAverage type1 = new SumAverage();
        SumAverage type2 = new SumAverage();


        System.out.println("Sum is"+type1.getSum(2,5,8));
        System.out.println("Sum is"+type2.getSum(3,6,9));

        System.out.println("Average of type 1"+getAvg(type1.getNo1(),type1.getNo2(),type1.getNo3()));
        System.out.println("Average of type 2"+getAvg(type2.getNo1(),type2.getNo2(),type2.getNo3()));
    }

//    @Override
//    public double getSum(double a, double b, double c){
//        super.getSum();
//        return total/3;
//    }
}