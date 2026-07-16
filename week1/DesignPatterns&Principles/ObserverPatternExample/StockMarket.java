import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{
    private List<Observer> observers = new ArrayList<>();
    private double stockPrice;

    public void register(Observer obs){
        observers.add(obs);
    }

    public void remove(Observer obs) {
        observers.remove(obs);
    }

    public void notifyObserver() {
        for(Observer obs : observers) {
            obs.update(stockPrice);
        }
    }
    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyObserver();
    }

}