public class CreditPaymentService {
    public double calculate(double term, double sum, double percent) {

        double monthlypercent = percent / 100 / 12;
        double monthlyPayment = sum * ((monthlypercent + monthlypercent / (Math.pow (1+monthlypercent, term) - 1)));

        return monthlyPayment;
    }
}
