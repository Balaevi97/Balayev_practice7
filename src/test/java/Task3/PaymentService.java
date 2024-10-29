package Task3;

public class PaymentService {

    public static void executePayment (PaymentProcessor paymentProcessor, double amount) {
        paymentProcessor.process(amount);
    }

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PayPalProcessor();
        PaymentProcessor creditCardProcessor = new CreditCardProcessor();

        executePayment(paymentProcessor, 30);
        executePayment(creditCardProcessor, 60);
    }
}
