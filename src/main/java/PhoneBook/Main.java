package PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> allContacts = new ArrayList<>();
        allContacts.add("352");
        allContacts.add("342");
        allContacts.add("332");
        List<String> blackList = new ArrayList<>();
        blackList.add("352");
        blackList.add("342");
        blackList.add("362");

        System.out.println(Phonebook.filterContacts(allContacts,blackList));
    }
}
