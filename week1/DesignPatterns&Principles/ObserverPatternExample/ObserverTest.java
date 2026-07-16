public class ObserverTest {
    public static void main(String args[]) {
        StockMarket sm = new StockMarket();
        Observer mobile = new MobileApp();
        Observer web = new WebApp();
        sm.register(mobile);
        sm.register(web);
        sm.setStockPrice(1000);
        sm.setStockPrice(1200);
    }
}