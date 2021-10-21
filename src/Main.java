import java.util.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        //Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        // Посчитать, сколько раз встречается каждое слово.


        String[] ourFamily = {"Мария", "Анна", "Елена", "Анна", "Лариса", "Ольга", "Анна", "Елена", "Ольга", "Анна", "Юлия", "Ольга", "Анна", "Александра", "Елена", "Александра", "Елена"};
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(ourFamily));
        System.out.println(hashSet);

        HashMap<String, Integer> name = new HashMap<>();
        for (String word : ourFamily) {
            if (!name.containsKey(word)) {
                name.put(word, 1);
            } else {
                name.put(word, name.get(word) + 1);
            }
        }
        for (Map.Entry<String, Integer> element : name.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
        }

        System.out.println();
        // Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
        // В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
        // Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        // тогда при запросе такой фамилии должны выводиться все телефоны.

        Phonebook phonebook = new Phonebook();
        phonebook.addToPhonebook("Ivanov", "+7777777");
        phonebook.addToPhonebook("Petrov", "+7238231");
        phonebook.addToPhonebook("Sidorov", "+7771231");
        phonebook.addToPhonebook("Novikov", "+7991231");
        phonebook.addToPhonebook("Bykov", "+7298731");
        phonebook.addToPhonebook("Sidorov", "+7666231");
        phonebook.addToPhonebook("Ivanov", "+7233331");
        phonebook.addToPhonebook("Ivanov", "+7111111");


        System.out.println(phonebook.get("Fgfd"));
        System.out.println(phonebook.get("Ivanov"));

    }
}
