package homework58;

import demo.Person;

public class BankAccount {
    /*
    { Person person, String IBAN, double balance }
    */
    private Person person;
    private String IBAN;
    double balance;

    public BankAccount(Person person, String IBAN, double balance) {
        this.person = person;
        this.IBAN = IBAN;
        this.balance = balance;
    }

    public Person getPerson() {
        return person;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankAccount: ");
        sb.append("IBAN ").append(IBAN).append("\n");
        sb.append(person).append("\n");
        sb.append("balance: ").append(balance);
        sb.append("euro.");
        return sb.toString();
    }
}
