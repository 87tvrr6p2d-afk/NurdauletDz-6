import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PaymentContext context = new PaymentContext();

        System.out.println("Выберите способ оплаты:");
        System.out.println("1 - Банковская карта");
        System.out.println("2 - PayPal");
        System.out.println("3 - Криптовалюта");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                context.setStrategy(new CardPayment("1234-5678-9999"));
                break;
            case 2:
                context.setStrategy(new PayPalPayment("user@mail.com"));
                break;
            case 3:
                context.setStrategy(new CryptoPayment("0xABCDEF123456"));
                break;
            default:
                System.out.println("Неверный выбор");
                return;
        }

        context.executePayment(5000);
    }
}
