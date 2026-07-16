public class payPalAdapter implements PaymentProcessor{
    private payPalGateway payPalGateway;
    public payPalAdapter(payPalGateway payPalGateway){
        this.payPalGateway = payPalGateway;
    }
    public void processPayment(double amount){
        payPalGateway.sendPayment(amount);
    }
    
}
