import java.util.ArrayList;
import java.util.List;

public class CurrencyExchange implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String currency;
    private double rate;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currency, rate);
        }
    }

    public void setRate(String currency, double rate) {
        this.currency = currency;
        this.rate = rate;
        notifyObservers();
    }
}
