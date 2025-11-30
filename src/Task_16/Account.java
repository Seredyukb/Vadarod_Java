package Task_16;

import java.util.Objects;

public class Account {

    private int id;
    private String number;
    private String currency;
    private Double balance;


    public Account(int id, String number, String currency, Double balance) {
        this.id = id;
        this.number = number;
        this.currency = currency;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getCurrency() {
        return currency;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && Objects.equals(number, account.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", currency='" + currency + '\'' +
                ", balance=" + balance +
                '}';
    }
}
