package com.revision;

import javax.imageio.ImageTypeSpecifier;
import java.util.ArrayList;

public class arrayList {
        public static void main(String[] args){
            ArrayList myarray = new ArrayList();
            myarray.add("krishn");
            myarray.add(25);
            myarray.add(2,35);
            myarray.size();
            myarray.trimToSize();
            myarray.clear();
            myarray.add("Vishnu");

            Object[] newclo= myarray.toArray();
            Object krish = myarray.clone();
            myarray.remove(1);
            myarray.set(2,"krih");
            myarray.add(2,"rajsesh");
            myarray.get(1);
            myarray.get()
            myarray.indexOf("Bhagwat")  //returns -1;

            //Arrralist Practice done;

//            ArrayList myarray = new ArrayList();
//            myarray.add("google");
//            myarray.add("microsoft");
//            myarray.add(25);
//            myarray.add(3,"done");
//            myarray.add(4,"wow");
//            Object clson = myarray.clone();
//            myarray.add("vishnu");
//            myarray.remove(2);
//            myarray.remove("microsoft");
//            Object[] arraylistTOarray = myarray.toArray();
//
//            for (int i=0;i<arraylistTOarray.length;i++){
//                System.out.print(arraylistTOarray[i]+"  ");
//            }
//            Object[] arraayname = myarray.toArray();
//            ArrayList newarraylist = new ArrayList();
//            System.out.println("new array lis "+newarraylist);
//            newarraylist.addAll(myarray);
//            System.out.println("affter adding all addAll "+newarraylist);
//
//            System.out.println();
//            System.out.println(myarray);
//            System.out.println(clson);
//        }

}
