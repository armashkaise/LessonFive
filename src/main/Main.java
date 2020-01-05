package main;

import main.animals.*;
import main.bankt48.accounts.AccountUtils;
import main.bankt48.accounts.Accounts;
import main.bankt48.accounts.GoldAccount;
import main.bankt48.accounts.RegullarAccount;
import main.bankt48.users.User;

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
        User sidrov_ivan = new User.Builder(UUID.randomUUID().toString(), "Ivan")
                .setSurname("Sidorov")
                .setMiInitial("333")
                .setDob("3333")
                .setDriverLicense("33333")
                .build();

//Задание №4. Изменить реализацию аккаунтов с использования абстрактного класса на использование интерфейса
        RegullarAccount account = new RegullarAccount(UUID.randomUUID().toString(), ivanov_petr, 100);
        Accounts account2 = new RegullarAccount(UUID.randomUUID().toString(), petrov_sidr, 0);
        GoldAccount account3 = new GoldAccount(UUID.randomUUID().toString(), sidrov_ivan, 0, 3);
        //System.out.println(account);

//Задание №2. Реализовать статический метод перевода денег
        AccountUtils.transferMoney(account, account3, 90);
        System.out.println(account);
        System.out.println(account3);

//Задание №5. Написать структуру: животное, млекопитающее, земноводные, кошка (собака), птицы, чайка (голубь, курица)
        Cat cat = new Cat(true,4, false, "Barsik", 2);
        Lion lion = new Lion(true,4, false);

//        makeThemShout(cat);
        //Bird dove = new Dove(true, true);

//        makeThemShout(lion);
//Задание №6. Добавить предыдущую структуру признаками поведения: умеет издавать голос, умеет бегать, умеет плавать.

        checkIfCanDefence(cat);
        checkIfCanDefence(lion);

    }

    private static void checkIfCanDefence(Object object) {

            System.out.println("does can " + object + " defence me? " + (object instanceof Defensible));
            System.out.println("does can " + object + " hunt? " + (object instanceof CanHunt));
            System.out.println("does can " + object + " run? " + (object instanceof CanRun));

    }

    public static void makeThemShout(Shoutable[] shoutables){
        for (Shoutable shoutable : shoutables) {
            System.out.println(shoutable);
        }
    }


}
