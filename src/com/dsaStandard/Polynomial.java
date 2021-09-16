package com.dsaStandard;

public class Polynomial {
    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
     *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
     *  is already present in the polynomial then previous coefficient is replaced by
     *  new coefficient value passed as function argument
     */
    DynamicArray da;

    public void setCoefficient(int degree, int coeff){
        if ((da.size() -1) < degree) {
            for (int i = (da.size()); i <= (degree+1); i++) {
                da.add(0);
            }
        }
        da.set(coeff,degree);
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){
        for (int i = 0;i < da.size();i++){
            if (da.get(i)!= 0) {
                System.out.println(da.get(i) + "x" + i + " ");
            }
        }
    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p){
        Polynomial res = new Polynomial();
        for (int i = 0;i<p.da.size();i++){
            if (p.da.get(i) !=0){
                res.da.set((da.get(i)+p.da.get(i)),i);
            }
        }
        return res;
    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){
        Polynomial res2 = new Polynomial();
        for (int i = 0;i<p.da.size();i++){
            if (p.da.get(i) !=0){
                res2.da.set((da.get(i)-p.da.get(i)),i);
            }
        }
        return res2;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p){
        Polynomial res3 = new Polynomial();
        for (int i = 0;i<p.da.size();i++){
            for (int j=0;j<da.size();j++){
                int multcoeff = da.get(i)*p.da.get(i);
                int multdegree = i+j;

                if (res3.da.get(multdegree) == 0) {
                    res3.setCoefficient(multdegree, multcoeff);
                }else {
                    res3.da.set((res3.da.get(i)+multcoeff),multdegree);
                }
           }
        }
        return res3;
    }
}
