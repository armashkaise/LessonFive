import Animals.Cat;
import Animals.Lion;

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

//Задание №2. Реализовать статический метод перевода денег
        AccountUtils.transferMoney(account, account2, 100);

//Задание №5. Написать структуру: животное, млекопитающее, земноводные, кошка (собака), птицы, чайка (голубь, курица)
        Cat cat = new Cat(4, false, "Barsik", 2);
        Lion lion = new Lion(4, false);
//Задание №6. Добавить предыдущую структуру признаками поведения: умеет издавать голос, умеет бегать, умеет плавать.
        cat.eat();
        cat.shout();

        lion.hunting();


    }
}
