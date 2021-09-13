package com.dsaStandard;

public class hashTableArray {

    public static void main(String[] args){
        DynamicArray d = new DynamicArray();
        d.add(5);
        d.add(10);
        d.add(12);
        d.add(22);
        d.add(85);
        d.add(32);
        d.add(14);
        d.add(10);
        d.add(3);
        d.print();
        d.set(999,1);
        d.print();
        System.out.println(d.removelast());
        d.print();
        d.add(10);
        d.add(850);
        d.print();
        d.set(8742,3);
        d.print();

    }

    private String[] hashtable;
    public hashTableArray(){
        hashtable = new String[10];
    }
//    public void put(String key,String a){
//        int hashedkey = hashkey(key);
//        if (has)
//    }
    private int hashkey(String key){
        return key.length()%hashtable.length;
    }

}
