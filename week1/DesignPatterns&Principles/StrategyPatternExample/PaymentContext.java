public class PaymentContext {
    private PaymentStrategy strategy;
    public PaymentContext(PaymentStrategy strategy){
        this.strategy=strategy;
    }
    public void excecutePayment(double amount){
        strategy.pay(amount);
    }
}
