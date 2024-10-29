package Task3;

public class PayPalProcessor implements PaymentProcessor{

    public  void  process (double amount){
        System.out.println("Processing payment by PayPal: $" + amount );
    }
}
