package Pb1_Colectii;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        //punctul 1 pentru metoda filterContacts
       // List<String> contacts = new ArrayList<>();
        phonebook.getContacts().add("352");
        phonebook.getContacts().add("342");
        phonebook.getContacts().add("332");
       // List<String> blackList = new ArrayList<>();
        phonebook.getBlackList().add("352");
        phonebook.getBlackList().add("342");
        phonebook.getBlackList().add("362");


        //System.out.println(Phonebook.filterContacts(contacts,blackList));

        //punctul 2 pentru metoda addToBlackList
        phonebook.addToBlackList("332");
        System.out.println(phonebook.getContacts());
        System.out.println(phonebook.getBlackList());

        //punctul 3 pentru metoda removeFromBlacklist
        phonebook.removeFromBlacklist("352");
        System.out.println(phonebook.getContacts());
        System.out.println(phonebook.getBlackList());
    }
}