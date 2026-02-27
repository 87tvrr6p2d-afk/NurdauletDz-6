public class MobileAppObserver implements Observer {

    @Override
    public void update(String currency, double rate) {
        System.out.println("📱 Mobile App: Новый курс " + currency + " = " + rate);
    }
}
