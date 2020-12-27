public class ComplexNo {

//Fields Initializing
double real;
double imaginary;

// Constructor
    public ComplexNo (double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
//Addition Sub Methods

    public void add(double real,double imaginary){

        System.out.println("Initial Complex No : "+this.real+" + "+this.imaginary+"i");
        this.real += real;
        this.imaginary += imaginary;
        System.out.println("After Addition final Complex No is "+this.real+" + "+this.imaginary+"i");
    }

    public void sub(double real,double imaginary){

        System.out.println("Initial Complex No : "+this.real+" + "+this.imaginary+"i");
        this.real -= real;
        this.imaginary -= imaginary;
        System.out.println("After Subtraction final Complex No is "+this.real+" + "+this.imaginary+"i");
    }
// Main Method
    public static void main(String[] args){
    ComplexNo num1 = new ComplexNo(2,3);
    ComplexNo num2 = new ComplexNo(5,6);

    num1.add(7,8);
    num1.sub(2,5);

    num2.add(4,2);
    }

}
