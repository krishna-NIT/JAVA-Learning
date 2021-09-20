public class Cylinder extends Circle{
    double height;

public Cylinder(double radius, double height){
    //super(radius);
    if (height<0){
        height = 0;
    }
    this.height = height;
}

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return (super.getArea()*getHeight());
    }

//public static void main(String[] args){
//    Circle circle = new Circle(3.75);
//    System.out.println("circle.radius"+circle.getRadius());
//    System.out.println("circle.area"+circle.getArea());
//    Cylinder cylinder = new Cylinder(5.55,7.25);
//    System.out.println("cyli.radius"+cylinder.getRadius());
//    System.out.println("cylin.heigth"+cylinder.getHeight());
//    System.out.println("cyli.are"+cylinder.getArea());
//    System.out.println("cylindr.  volume "+cylinder.getVolume());
//}
}
