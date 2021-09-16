package com.dsaStandard;

import java.util.Scanner;

public class Polynomial {

    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
     *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
     *  is already present in the polynomial then previous coefficient is replaced by
     *  new coefficient value passed as function argument
     */

    DynamicArray da = new DynamicArray();

    public void setCoefficient(int degree, int coeff){
        if ((this.da.size() -1) < degree) {
            for (int i = (this.da.size()); i <= (degree+1); i++) {
                this.da.add(0);
            }
        }
        this.da.set(coeff,degree);

    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){
        for (int i = 0;i < da.size();i++){
            if (da.get(i)!= 0) {
                System.out.print(da.get(i) + "x" + i + " ");
            }
        }
        System.out.println();
    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p){
        Polynomial res = new Polynomial();

        if (p.da.size() > da.size()) {
            for (int i = 0; i < da.size(); i++) {
                res.setCoefficient(i, (this.da.get(i) + p.da.get(i)));
            }
            for (int i = da.size();i < p.da.size();i++){
                res.setCoefficient(i,(p.da.get(i)));
            }
        }else {
            for (int i = 0; i < p.da.size(); i++) {
                res.setCoefficient(i, (this.da.get(i) + p.da.get(i)));
            }
            for (int i = p.da.size();i < da.size();i++){
                res.setCoefficient(i,(da.get(i)));
            }
        }
        return res;
    }


    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){
        Polynomial res2 = new Polynomial();
        if (p.da.size() > da.size()) {
            for (int i = 0; i < da.size(); i++) {
                res2.setCoefficient(i, (this.da.get(i) - p.da.get(i)));
            }
            for (int i = da.size();i < p.da.size();i++){
                res2.setCoefficient(i,(p.da.get(i)*(-1)));
            }
        }else {
            for (int i = 0; i < p.da.size(); i++) {
                res2.setCoefficient(i, (this.da.get(i) - p.da.get(i)));
            }
            for (int i = p.da.size();i < da.size();i++){
                res2.setCoefficient(i,(da.get(i)));
            }
        }
        return res2;
    }


    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p){
        Polynomial res3 = new Polynomial();
        for (int i = 0;i<p.da.size();i++){
            for (int j=0;j<this.da.size();j++){
                int multcoeff = this.da.get(j)*p.da.get(i);
                int multdegree = i+j;
                int finacoeff;

                if (res3.da.size() >= multdegree+1) {
                    finacoeff = multcoeff + res3.da.get(multdegree);
                }else {
                    finacoeff = multcoeff;
                }
                res3.setCoefficient(multdegree,finacoeff);
           }
        }
        return res3;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int degree1[] = new int[n];
        for(int i = 0; i < n; i++){
            degree1[i] = s.nextInt();
        }
        int coeff1[] = new int[n];
        for(int i = 0; i < n; i++){
            coeff1[i] = s.nextInt();
        }
        Polynomial first = new Polynomial();
        for(int i = 0; i < n; i++){
            first.setCoefficient(degree1[i],coeff1[i]);
        }
        first.print();
        n = s.nextInt();
        int degree2[] = new int[n];
        for(int i = 0; i < n; i++){
            degree2[i] = s.nextInt();
        }
        int coeff2[] = new int[n];
        for(int i = 0; i < n; i++){
            coeff2[i] = s.nextInt();
        }
        Polynomial second = new Polynomial();
        for(int i = 0; i < n; i++){
            second.setCoefficient(degree2[i],coeff2[i]);
        }
        second.print();
        int choice = s.nextInt();
        System.out.println(choice);
        Polynomial result;
        switch(choice){
            // Add
            case 1:

                result = first.add(second);
                result.print();
                break;
            // Subtract
            case 2 :
                result = first.subtract(second);
                result.print();
                break;
            // Multiply
            case 3 :
                result = first.multiply(second);
                result.print();
                break;
        }

    }
}
