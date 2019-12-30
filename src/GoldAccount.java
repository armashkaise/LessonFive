import java.util.Objects;

public class GoldAccount implements IAccountInterface {
    public final String id;
    public final User user;
    protected int balans;
    private int cashBackPercent;

    public GoldAccount(String id, User user, int balans, int cashBackPercent) {
        this.id = id;
        this.user = user;
        this.balans = balans;
        this.cashBackPercent = cashBackPercent;
    }

    public int getCashBackPercent() {
        return cashBackPercent;
    }

    public void setCashBackPercent(int cashBackPercent) {
        this.cashBackPercent = cashBackPercent;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public User getUser() {
        return null;
    }

    @Override
    public int getBalans() {
        return 0;
    }

    @Override
    public void changeBalans(int amount) {
        boolean isBalansAllowIncreasing = balans > 0 && amount < 0 && balans <= amount;
        if (isBalansAllowIncreasing) return;
        if (amount < 0){
            this.balans *= 1+cashBackPercent;
        }
        this.balans += amount;
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
