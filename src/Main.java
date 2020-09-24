public class Main {
    public static void main(String[] arg) {

        double percent = 9.99;
        double termOneYear = 12;
        double termTwoYear = 24;
        double termThreeYear = 36;
        double sum = 1_000_000;

        CreditPaymentService service = new CreditPaymentService();

        double monthlyPaymentOneYear = service.calculate(termOneYear, sum, percent);
        System.out.println(monthlyPaymentOneYear);

        double monthlyPaymentTwoYear = service.calculate(termTwoYear, sum, percent);
        System.out.println(monthlyPaymentTwoYear);

        double monthlyPaymentThreeYear = service.calculate(termThreeYear, sum, percent);
        System.out.println(monthlyPaymentThreeYear);

    }
}
