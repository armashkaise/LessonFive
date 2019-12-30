import java.util.UUID;

public class Main {
    public static void main(String[] args) {
//Задания №3. Решить проблему telescoping constructor класса User
        User ivanov_petr = new User.Builder(UUID.randomUUID().toString(), "Petr")
                .setSurname("Ivanov")
                .setMiInitial("111")
                .setDob("1111")
                .setDriverLicense("11111")
                .build();

        User petrov_sidr = new User.Builder(UUID.randomUUID().toString(), "Sidr")
                .setSurname("Petrov")
                .setMiInitial("222")
                .setDob("2222")
                .setDriverLicense("22222")
                .build();

//Задание №4. Изменить реализацию аккаунтов с использования абстрактного класса на использование интерфейса
        RegullarAccount account = new RegullarAccount(UUID.randomUUID().toString(), ivanov_petr, 1_000);
        RegullarAccount account2 = new RegullarAccount(UUID.randomUUID().toString(), petrov_sidr, 0);
        System.out.println(account);

//Задания №2. Реализовать статический метод перевода денег
        AccountUtils.transferMoney(account, account2, 100);




    }
}
