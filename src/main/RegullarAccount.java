package main;

public class RegullarAccount extends Accounts {

    public RegullarAccount(String id, User user, int balans) {
        super(id, user, balans);
    }

    @Override
    public void changeBalans(int amount) {

        if (isBalansAllowIncreasing(amount)) return;
        this.balans += amount;
    }

}
