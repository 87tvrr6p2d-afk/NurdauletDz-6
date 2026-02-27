public class MainObserver {

    public static void main(String[] args) {

        CurrencyExchange exchange = new CurrencyExchange();

        Observer mobile = new MobileAppObserver();
        Observer web = new WebAppObserver();
        Observer email = new EmailObserver();

        exchange.addObserver(mobile);
        exchange.addObserver(web);
        exchange.addObserver(email);

        exchange.setRate("USD", 475.5);
        System.out.println("-----");

        exchange.removeObserver(web);

        exchange.setRate("EUR", 510.3);
    }
}
