public class Calculator {
    public double no1;
    public double no2;
    public double no3;

    public double getNo1() {
        return no1;
    }

    public double getNo2() {
        return no2;
    }

    public double getNo3() {
        return no3;
    }

    public void setNo1(double no1) {
        this.no1 = no1;
    }

    public void setNo2(double no2) {
        this.no2 = no2;
    }

    public void setNo3(double no3) {
        this.no3 = no3;
    }

    public double getSum(double a, double b, double c){
        setNo1(a);
        setNo2(b);
        setNo3(c);
        double total = getNo1()+getNo2()+getNo3();
        return total;
    }
Floor floor;
Carpet carpet;
public Calculator(Floor floor, Carpet carpet){
    this.floor=floor;
    this.carpet=carpet;
}
public double getTotalCost(){
    double cos = (floor.getArea()* carpet.getCost());
    return cos;
}
}
