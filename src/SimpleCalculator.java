
//////////// CODING EXERCISE 29  ////////////////

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }



    public void setFirstNumber(double fir){
        firstNumber = fir;
    }
    public void setSecondNumber(double sec){
        secondNumber = sec;
    }



    public double getAdditionResult(){
        return (firstNumber + secondNumber);
    }

    public double getSubtractionResult(){
        return (firstNumber - secondNumber);
    }

    public double getMultiplicationResult(){
        return (firstNumber * secondNumber);
    }

    public double getDivisionResult(){
        if (secondNumber!= 0){
            return (firstNumber / secondNumber);
        }else{
            return 0;
        }
    }
}
