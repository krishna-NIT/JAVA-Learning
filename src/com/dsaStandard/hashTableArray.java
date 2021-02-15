package com.dsaStandard;

public class hashTableArray {
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
