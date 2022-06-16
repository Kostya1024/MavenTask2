public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;

        double bonus = service.calculate(amount, registered);
        System.out.println("Ваш бонус от покупки составляет: " + bonus);
    }
}

