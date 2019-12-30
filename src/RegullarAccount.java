import java.util.Objects;

public class RegullarAccount implements IAccountInterface {

    public final String id;
    public final User user;
    protected int balans;

    public RegullarAccount(String id, User user, int balans) {
        this.id = id;
        this.user = user;
        this.balans = balans;
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
        this.balans += amount;
    }

    @Override
    public String toString() {
        return "RegullarAccount{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", balans=" + balans +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegullarAccount that = (RegullarAccount) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user);
    }
}
