public class Calculator {
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
