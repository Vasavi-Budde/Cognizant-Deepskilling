public class AdapterTest {
    public static void main(String args[]){
        PaymentProcessor paypal = new payPalAdapter(new payPalGateway());
        paypal.processPayment(1000);
        PaymentProcessor stripe = new StripeAdapter(new StripeGateway());
        stripe.processPayment(2000);
    }
}
