package main.bankt48.accounts;

import main.bankt48.users.User;

import java.util.Objects;

public class GoldAccount extends Accounts {
    private int cashBackPercent;

    public GoldAccount(String id, User user, int balans, int cashBackPercent) {
        super(id, user, balans);
        this.cashBackPercent = cashBackPercent;
    }

    public int getCashBackPercent() {
        return cashBackPercent;
    }

    public void setCashBackPercent(int cashBackPercent) {
        this.cashBackPercent = cashBackPercent;
    }

    @Override
    public void changeBalans(int amount) {
        if (isBalansAllowIncreasing(amount)) return;
        if (amount > 0){
//            this.balans *= 1+cashBackPercent;
            this.balans += amount + (amount * cashBackPercent /100);
        } else {
            this.balans += amount;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GoldAccount that = (GoldAccount) o;
        return cashBackPercent == that.cashBackPercent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cashBackPercent);
    }
}
