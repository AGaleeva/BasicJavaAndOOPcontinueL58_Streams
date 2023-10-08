package homework58;

import demo.Address;
import demo.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class BankAppl {
    /*
    Задача 1.
    Дан список  BankAccount { Person person, String IBAN, double balance }. Используя
    знания о stream необходимо сформировать лист:
    - из  BankAccount, баланс которых составляет менее 100;
    - из Person  баланс которых составляет больше заданного N.
    */

    public static void main(String[] args) {
        List<BankAccount> accounts = List.of(new BankAccount(new Person("fName1", "lName1", "fl1@mail.com",
                "+01123456", new Address("12345", "City1", "Street4", "1a")), "DE09120007456098", 10000),
                new BankAccount(new Person("fName2", "lName2", "fl2@mail.com", "+01093432", new Address("22344",
                        "City2", "Street24", "21b")), "DE09560005476076", 150000), new BankAccount(new Person("fName3"
                        , "lName3", "fl3@mail.com", "+03427841", new Address("52090", "City15", "Street146", "130")),
                        "DE08721000056325", 4000), new BankAccount(new Person("fName4", "lName4", "fl4@mail.com",
                        "+03227891", new Address("76543", "City71", "Street64", "12c")), "DE09120007456098", 45),
                new BankAccount(new Person("fName5", "lName5", "fl5@mail.com", "+06724212", new Address("13765",
                        "City1", "Street73", "10")), "DE09140003556570", 95));

        System.out.println(getAccountsList(accounts, 10));
        System.out.println(getClientsList(accounts, 5000));

    }

    public static List<BankAccount> getAccountsList(List<BankAccount> list, int n) {
        List<BankAccount> resList = new ArrayList<>(list.stream()
                .filter(a -> a.getBalance() < n)
                .toList());
        return resList;
    }

    public static List<Person> getClientsList(List<BankAccount> list, int n) {
        List<Person> resList = list.stream()
                .<Person>mapMulti((ba, consumer) -> {
            if (ba.getBalance() > n) {
                consumer.accept(ba.getPerson());
            }
        })
                .toList();
        return resList;
    }
}
