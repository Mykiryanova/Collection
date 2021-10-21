import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    HashMap<String, List<String>> pho = new HashMap<>();
    List<String> phoneNumber;

    public void addToPhonebook(String lastname, String phone_number) {
        if (pho.containsKey(lastname)) {
            phoneNumber = pho.get(lastname);
            phoneNumber.add(phone_number);
            pho.put(lastname, phoneNumber);
        } else {
            phoneNumber = new ArrayList<>();
            phoneNumber.add(phone_number);
            pho.put(lastname, phoneNumber);
        }
    }

    public List<String> get(String lastname) {
        return pho.get(lastname);
    }

    public  void printInfo(){
        for (Map.Entry<String, List<String>> element : pho.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
    }
        System.out.println();

    }
}