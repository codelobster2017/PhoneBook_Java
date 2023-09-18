import java.util.*;

public class PhoneBook {
    private static Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    void add(String name, String number){
        if(phoneBook.isEmpty() || !phoneBook.containsKey(name)){
            ArrayList<String> listNumber = new ArrayList<>();
            listNumber.add(number);
            phoneBook.put(name, listNumber);
        }else {
            ArrayList<String> numbersOfName = phoneBook.get(name);
            numbersOfName.add(number);
            phoneBook.put(name, numbersOfName);

        }
    }

    public static void print() {
        ArrayList<Map.Entry<String, ArrayList>> list = new ArrayList(phoneBook.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, ArrayList>>() {
            @Override
            public int compare(Map.Entry<String, ArrayList> o1, Map.Entry<String, ArrayList> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }
        });
        for (Map.Entry<String, ArrayList> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
