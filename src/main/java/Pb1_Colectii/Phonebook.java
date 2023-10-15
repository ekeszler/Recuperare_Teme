package Pb1_Colectii;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    private List<String> contacts;
    private List<String> blackList;


    public Phonebook() {
        this.contacts = new ArrayList<>();
        this.blackList = new ArrayList<>();
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    public List<String> getBlackList() {
        return blackList;
    }

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }

    public static List<String> filterContacts(List<String> contacts, List<String> blackList){
        List<String> result = new ArrayList<>();
        for(String contact: contacts){
            if(!blackList.contains(contact)){
                result.add(contact);
            }
        }
        return result;
    }

    public List<String> addToBlackList(String phoneNumber){
            blackList.add(phoneNumber);
            contacts.remove(phoneNumber);
            return contacts;
    }

    public List<String> removeFromBlacklist(String goodPhoneNumber){
        blackList.remove(goodPhoneNumber);
        contacts.add(goodPhoneNumber);
        return contacts;
    }

}
