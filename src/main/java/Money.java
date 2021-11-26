public class Money {

    private int money;

    public Money(int money) {
        this.money = Math.max(money, 0);
    }

    public void plus(Money money) {
        this.money += money.money;
    }

    public void minus(Money money) {
        this.money -= money.money;
    }

    public int getMoney() {
        return money;
    }

    public boolean isBiggerThan(Money money) {
        return this.money > money.money;
    }

    public boolean isEqualsOrBiggerThan(Money money) {
        return this.money >= money.money;
    }

}
