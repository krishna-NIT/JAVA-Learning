package com.dsaStandard;
class Employee
{
    String Emp_name, Address, Mail_id;
    double Emp_id;
    long Mobile_no;
    long BP;

    void Salary()
    {
        float DA, HRA, PF, CF, gross, net_salary;
        DA = BP * 97/100;
        HRA = BP * 10/100;
        PF = BP * 12/100;
        CF = BP * 0.1f/100;

        gross = BP + DA + HRA - CF - PF;
        net_salary = BP + HRA + DA + CF + PF;

        System.out.println("Employee name: " + Emp_name);
        System.out.println("Employee address: " + Address);
        System.out.println("Employee Mail id: " + Mail_id);
        System.out.println("Employee id: " + Emp_id);
        System.out.println("Employee mobile no.: " + Mobile_no);
        System.out.println("Employee's basic salary: " + BP);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net_salary);
    }
}

class Programmer extends Employee
{
    Programmer(String Emp_name, String Address, String Mail_id, double Emp_id, long Mobile_no, long BP)
    {
        this.Emp_name = Emp_name;
        this.Address = Address;
        this.Mail_id = Mail_id;
        this.Emp_id = Emp_id;
        this.Mobile_no = Mobile_no;
        this.BP = BP;
    }
}

public class Assignment3 {
    public static void main(String [] args)
    {
        System.out.println("**********EMPLOYEE PAY SLIP**********");
        Programmer pr = new Programmer("Rajshri", "Bhusawal", "gmail.com", 12345,8208656844L, 25000);
        pr.Salary();
    }
}
