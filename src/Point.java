public class Point {
private int x;
private int y;

public Point(){

}
public Point(int x,int y){
    this.x=x;
    this.y=y;
}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
public double distance(){
    return (Math.sqrt((getX()*getX())+(getY()^2)));
    }
public double distance(int a,int b){

    double dis = Math.sqrt((getX()-(a))*(getX()-(a))+(getY()-(b))*(getY()-(b)));
    return dis;
    }
public double distance(){
    Point kri = new Point();
    Point vis = new Point();

    double dis = Math.sqrt( ((kri.getX()- vis.getX())*(kri.getX()- vis.getX()))+((kri.getY()- vis.getY())*(kri.getY()- vis.getY())) );
    return dis;
}
}
