import java.util.Scanner;

public class Circle {
double radius;
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int r= scan.nextInt();

    Scanner sca = new Scanner(System.in);
    String name = sca.nextLine();
    System.out.println("Area is "+(Math.PI*r*r)+"And NAme is "+name);
    sca.close();
    scan.close();
}

public Circle(double radius){
    if (radius<0){
        radius =0;
        this.radius = radius;
    }else {
        this.radius = radius;
    }
}

public double getRadius(){
    return this.radius;
}
public double getArea(){
    return (getRadius()*getRadius()*Math.PI);
}

}
