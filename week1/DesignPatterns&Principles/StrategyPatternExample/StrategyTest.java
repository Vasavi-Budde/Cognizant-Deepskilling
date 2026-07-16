public class StrategyTest {
    public static void main(String args[]){
        PaymentContext context;
        context = new PaymentContext(new CreditCardPayment());
        context.excecutePayment(5000);
        context = new PaymentContext(new PayPalPayment());
        context.excecutePayment(5000);
        context= new PaymentContext(new PayPalPayment());
        context.excecutePayment(3000);
    }
}
