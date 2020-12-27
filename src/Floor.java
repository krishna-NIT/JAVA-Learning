public class Floor {
    double width;
    double length;

    public Floor(double wid, double len){
        if (wid<0){
            wid =0;
        }
        if (len <0){
            len = 0;
        }
        this.length=len;
        this.width=wid;

    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        double ar = getLength() * getWidth();
        return ar;
    }
}
