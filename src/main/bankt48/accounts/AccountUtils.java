package main.bankt48.accounts;

final public class AccountUtils {
    private AccountUtils() {
    }

    public static void transferMoney(Accounts fromAccount, Accounts toAccount, int amount){
        final int MIN_BALANS = 10;
        boolean isNull = fromAccount == null || toAccount == null || fromAccount == toAccount;
        if (isNull) return;

        if ((fromAccount.balans - amount) < MIN_BALANS){
            System.out.println("Баланс после транзакции у " + fromAccount + " должен быть более " + MIN_BALANS + " тенге.");
            return;
        }

        toAccount.changeBalans(amount);
        fromAccount.changeBalans(-amount);
    }
}
