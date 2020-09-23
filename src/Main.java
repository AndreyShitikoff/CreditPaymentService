public class Main {
    public static void main(String[] arg) {

        double percent = 9.99;
        double term = 12;
        double sum = 1_000_000;

        CreditPaymentService service = new CreditPaymentService();

        double monthlyPaymentOneYear = service.calculate(12,1_000_000,9.99);
        System.out.println(monthlyPaymentOneYear);

        double monthlyPaymentTwoYear = service.calculate(24,1_000_000, 9.99);
        System.out.println(monthlyPaymentTwoYear);

        double monthlyPaymentThreeYear = service.calculate(36, 1_000_000, 9.99);
        System.out.println(monthlyPaymentThreeYear);

    }
}
