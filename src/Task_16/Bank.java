package Task_16;

import java.util.HashSet;
import java.util.Set;

public class Bank {
    Set<Account> accounts = new HashSet<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    private Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getNumber().equals(accountNumber)) {
                return acc;
            }
        }
        throw new AccountNotFoundException("Счет не найден ", "not.found.account");
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {
        Account from = findAccount(accountNumberFrom);
        Account to = findAccount(accountNumberTo);
        if (from.getBalance() < amount) {
            throw new NotEnoughMoneyException("Недостаточно средств", "not.enough.money");
        }
        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);
    }

}
