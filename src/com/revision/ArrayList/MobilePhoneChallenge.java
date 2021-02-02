package com.revision.ArrayList;

import java.util.ArrayList;

public class MobilePhoneChallenge extends Contact {
     String  myNumber;
     ArrayList myContacts = new ArrayList();

    public void MobilePhoneChallenge(String myNumber){
        this.myNumber=myNumber;
        this.myContacts = new ArrayList<Contact>();

    }
    public  boolean addNewContact(Contact a){
       if (myContacts.contains(a)){
           return false;
       }else {
           myContacts.add(a);
           return true;
       }
    }
    public  boolean updateContact(Contact a, Contact b){
        if (myContacts.contains(a)){
            myContacts.add(myContacts.indexOf(a),b);
            return true;
        }else {
            return false;
        }
    }
    public  boolean removeContact(Contact a){
        if (myContacts.contains(a)){
            myContacts.remove(a);
            return true;
        }else {
            return false;
        }
    }
    public  int findContact(Contact a){
        return myContacts.indexOf(a);
    }
    public  int findContact(String name){
        return myContacts.indexOf(name);
    }
    public  Contact queryContact(String search){
        if (myContacts.contains(search)){
           ////what next???
            int position = findContact(search);
            return (this.myContacts.get(position));
        }
        return null;

    }
    public  void printContacts(){
        System.out.println("Contact List:");
        System.out.println("Contact List");
        for(int i=0; i<this.myContacts.size(); i++) {
            System.out.println((i+1) + "." +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }

    }
}
