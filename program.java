import java.lang.String;

public class program{
    public static void main(String[] args) {
        /*
        Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена
с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов.
         */
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Андрей", "4353");
        phoneBook.add("Иван", "123");
        phoneBook.add("Иван", "456");
        phoneBook.add("Иван", "789");
        phoneBook.add("Василий", "835573");
        phoneBook.add("Василий", "022273");
        phoneBook.print();
    }
    
}


