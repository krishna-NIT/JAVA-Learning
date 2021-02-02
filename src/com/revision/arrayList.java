package com.revision;

import java.util.ArrayList;

public class arrayList {

        public static void main(String[] args){
            ArrayList myarray = new ArrayList();
            myarray.add("google");
            myarray.add("microsoft");
            myarray.add(25);
            myarray.add(3,"done");
            myarray.add(4,"wow");
            Object clson = myarray.clone();
            myarray.add("vishnu");
            myarray.remove(2);
            myarray.remove("microsoft");
            Object[] arraylistTOarray = myarray.toArray();

            for (int i=0;i<arraylistTOarray.length;i++){
                System.out.print(arraylistTOarray[i]+"  ");
            }
            Object[] arraayname = myarray.toArray();

            System.out.println();
            System.out.println(myarray);
            System.out.println(clson);
        }

}
