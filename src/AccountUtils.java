final public class AccountUtils {
    private AccountUtils() {
    }

    public static void transferMoney(RegullarAccount fromAccount, RegullarAccount toAccount, int amount){
//Задание 7. Исправить проблему копипаста в методе изменения баланса.
        boolean isNull = fromAccount.balans < amount || fromAccount == null || toAccount == null;
        if (isNull) return;

        toAccount.balans += amount;
        fromAccount.balans -= amount;
    }
}
