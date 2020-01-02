package main;

import java.util.Objects;

public class Accounts implements Change {
    protected String id;
    protected User user;
    protected int balans;

    public Accounts(String id, User user, int balans) {
        this.id = id;
        this.user = user;
        this.balans = balans;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getBalans() {
        return balans;
    }

    public void setBalans(int balans) {
        this.balans = balans;
    }

//Задание 7. Исправить проблему копипаста в методе изменения баланса.
    protected boolean isBalansAllowIncreasing(int amount){
        return balans > 0 && amount < 0 && balans <= amount;
    }

    public void changeBalans(int amount) {

    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", balans=" + balans +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accounts account = (Accounts) o;
        return Objects.equals(id, account.id) &&
                Objects.equals(user, account.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user);
    }
}
