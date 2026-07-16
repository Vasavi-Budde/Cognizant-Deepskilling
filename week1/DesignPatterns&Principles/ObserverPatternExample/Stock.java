public interface Stock{
    void register(Observer obs);
    void deRegister(Observer obs);
    void notifyObserver();
}