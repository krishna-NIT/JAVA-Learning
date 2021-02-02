package com.revision.ArrayList;
public class Contact {
    private String name;
    private String phoneNumber;

    public String getName(){
        return this.name;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public static Contact createContact(String a, String b){
        return new Contact(a,b);
    }
}
