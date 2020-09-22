public class CreditPaymentService {
    public double calculate(int term) {

        double monthlyPayment = 1_000_000 * ((0.008325 * Math.pow(1.008325,term)) / (Math.pow(1.008325,term) - 1));

        return monthlyPayment;
    }
}
