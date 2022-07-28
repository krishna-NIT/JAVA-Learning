package com;

import java.util.LinkedList;

public class MiniStack {
    LinkedList<Integer> stack;
    public MiniStack(){
        stack = new LinkedList<Integer>();
    }
    public void push(int x) {
        stack.push(x);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i=0;i<stack.size();i++){
            if (min>stack.indexOf(i)){
                min = stack.indexOf(i);
            }
        }
        return min;
    }
}



//
//    DELIMITER $$
//    CREATE FUNCTION EMP_INFO(F_NAME VARCHAR(255), L_NAME VARCHAR(255)) RETURNS INTEGER
//        DECLARE SALARY INTEGER;
//        BEGIN
//        SELECT
//
//
//        RETURN SALARY;
//        END$$
//        DELIMITER;
//
//
//        set @v_emp_no = 0;
//        set @name1 = "Aruna";
//        set @name2 = "Journel";
//
//        call db_name.procedure_name(@name1, @name2, @v_emp_no);
//
//        select @v_emp_no;
//
//
//
//
//
//DELIMITER $$
//        CREATE PROCEDURE EMP_INFO(IN FIRST_NAME VARCHAR(255),
//        IN LAST_NAME VARCHAR(255),
//        OUT O_EMP_NO INTEGER)
//        BEGIN
//
//        SELECT
//        T1.EMP_NO INTO O_EMP_NO
//        FROM
//        TABLE T1
//        WHERE
//        T1.FIRSTNAME = FIRST_NAME AND T2.LASTNAME = LAST_NAME;
//
//        END$$
//        DELIMITER;
//



//    SELECT
//            COUNTRY_NAMER
//    FROM
//            TABLE
//    WHERE (GDP/POPULATION) > (SELECT GDP/POPULATION FROM TABLE WHERE NAME = "UNITED KINGDOM")
//        AND CONTINENT = "EUROPE";
//
//
//        SELECT
//        MAX(SALARY)
//        FROM
//        TABLE
//        WHERE SALARY NOT IN(SELECT MAX(SALARY) FROM TABLE);
//
//
//
//        SELECT * FROM EMPLOYEE
//        WHERE UPPER(NAME) LIKE ("%JOE%");
//
//        SELECT EMPLOYEE, SUM(BONUS) AS BN
//        FROM EMPLOYEE
//        GROUP BY EMPLOYEE
//        WHERE BN > 1000;
//
//
//        CREATE TABLE TB_NAME AS SELECT * FROM EMP





