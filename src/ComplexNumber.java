public class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber(double real, double imaginary){
        this.imaginary=imaginary;
        this.real=real;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(ComplexNumber num){
        this.real += num.getReal();
        this.imaginary += num.getImaginary();
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }
    public void subtract(ComplexNumber num){
        this.real -= num.getReal();
        this.imaginary -= num.getImaginary();

    }
    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }


}
