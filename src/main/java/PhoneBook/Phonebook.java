package PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    List<String> contacts;
    List<String> blackList;


    public static List<String> filterContacts(List<String> allContacts, List<String> blackList){
        List<String> result = new ArrayList<>();
        for(String contact: allContacts){
            if(!blackList.contains(contact)){
                result.add(contact);
            }
        }
        return result;
    }
}
