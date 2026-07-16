public class WebApp implements Observer {
    public void update(double stockPrice) {
        System.out.println("Web App Updated: "+ stockPrice);
    }
}