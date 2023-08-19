public class Main {
    public static void main(String[] args) {
        int acct = 300;
        int refill = 1100;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Количество средств на счете:" + (acct + refill + bonus));
        System.out.println("Количество начисленных бонусов:" + bonus);
    }
}