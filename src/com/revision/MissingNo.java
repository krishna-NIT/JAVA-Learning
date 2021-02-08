package com.revision;

import java.util.LinkedList;

public class MissingNo {
   public static void main(String[] args){
    int ans = minimumNumber(3,"Ab1");
       System.out.println(ans);
   }

    static int minimumNumber(int n, String password) {
        System.out.println("Method Called");
       int min =0;
       int d=0,uc=0,lc=0,sc=0;

      for (int i= 0;i<password.length();i++){
          char temp = password.charAt(i);
            if (Character.isDigit(temp)){ d=1;
                System.out.println("contains no"); }
            if (Character.isLowerCase(temp)){ lc=1;
                System.out.println("contains Lower Case");}
            if (Character.isUpperCase(temp)){ uc=1;
                System.out.println("contains Upper Case");}
            if (Character.isAlphabetic(temp)== false && Character.isDigit(temp)==false){ sc=1;
                System.out.println("contains Special Char");}
      }
       if (lc!=1){ min++;}
       if (uc!=1){ min++;}
       if (d!=1){ min++;}
       if (sc!=1){ min++;}

       if (password.length()+min<6){
           min+=(6-(password.length()+min));
       }
       return min;
    }
   static void separateNumbers(String s){
       LinkedList linklist = new LinkedList();
       for (int i = 1;i<=(s.length()/2);i++){
           linklist.add(s.substring(0,i));
       }

   }


}
