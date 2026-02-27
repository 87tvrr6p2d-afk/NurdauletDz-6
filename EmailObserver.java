public class EmailObserver implements Observer {

    @Override
    public void update(String currency, double rate) {
        System.out.println("📧 Email: Уведомление! " + currency + " теперь = " + rate);
    }
}
