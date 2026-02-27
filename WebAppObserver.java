public class WebAppObserver implements Observer {

    @Override
    public void update(String currency, double rate) {
        System.out.println("💻 Web App: Курс обновлен: " + currency + " = " + rate);
    }
}
