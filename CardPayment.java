public class CardPayment implements PaymentStrategy {

    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " ₸ банковской картой: " + cardNumber);
    }
}
