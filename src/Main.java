public class Main {
    public static void main(String[] arg) {

        CreditPaymentService service = new CreditPaymentService();

        double monthlyPaymentOneYear = service.calculate(12);
        System.out.println(monthlyPaymentOneYear);

        double monthlyPaymentTwoYear = service.calculate(24);
        System.out.println(monthlyPaymentTwoYear);

        double monthlyPaymentThreeYear = service.calculate(36);
        System.out.println(monthlyPaymentThreeYear);

    }
}
