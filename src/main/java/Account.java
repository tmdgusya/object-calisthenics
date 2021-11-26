public class Account {

    private Money money;

    public Account() {
        this.money = new Money(0);
    }

    public Account(Money money) {
        this.money = money;
    }

    public void deposit(Money money) {
        this.money.plus(money);
    }

    public void withdraw(Money money) {
        if (money.isBiggerThan(this.money)) {
            throw new IllegalArgumentException("요청하신 출금 금액이 현재 잔액보다 많습니다.");
        }
        this.money.minus(money);
    }

}
