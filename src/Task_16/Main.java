package Task_16;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Account a1 = new Account(1, "101", "BYN", 5000.00);
        Account a2 = new Account(2, "102", "BYN", 4500.00);
        Account a3 = new Account(3, "103", "BYN", 3400.00);
        Account a4 = new Account(1, "104", "BYN", 2300.00);
        Account a5 = new Account(1, "105", "BYN", 6770.00);

        bank.addAccount(a1);
        bank.addAccount(a2);
        bank.addAccount(a3);
        bank.addAccount(a4);
        bank.addAccount(a5);

        try {
            bank.transferMoney("101", "102", 1000.00);
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException е) {
            System.out.println("Недостаточно средств для перевода");
        } finally {
            System.out.println("Спасибо,что вопользовались услугами банка");
        }

        System.out.println("Итого по счетам: ");
        for (Account acc : bank.accounts) {
            System.out.println(acc);
        }

    }
}
