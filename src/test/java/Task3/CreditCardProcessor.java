package Task3;

public class CreditCardProcessor implements PaymentProcessor{

    public void process(double amount){
        System.out.println("Processing payment by Credit Card: $" + amount);
    }
}
