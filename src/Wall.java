public class Wall {
    private double width;
    private double height;

    public Wall(){
    }

    public Wall(double wid, double hei){

        if (wid<0 && hei >=0){
            width = 0;
            height = hei;
        }else if (hei<0 && wid >=0){
            height = 0;
            width = wid;
        }else if (hei<0 && wid<0){
            height = 0;
            width = 0;
        }
        else {
            width = wid;
            height = hei;
        }
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width1){
        if (width1>=0) {
            width = width1;
        }else if(width1<0) {
            width = 0;
        }
    }
    public void setHeight(double height1){
        if (height1>=0) {
            height = height1;
        }else {
            height = 0;
        }
    }
    public double getArea(){
        double  area = getHeight()*getWidth();
        return area;
    }

}

