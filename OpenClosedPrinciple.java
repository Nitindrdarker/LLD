interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paying from credit = " + amount);
    }

}

class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paying from UPI = " + amount);
    }

}

class PayPal implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paying from PayPal = " + amount);
    }
}

class PaymentService {
    public void pay(Double amount, Payment paymentMethod) {
        paymentMethod.pay(amount);
    }
}

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        Payment upi = new UPI();
        service.pay(1000.0, upi);

        Payment card = new CreditCard();
        service.pay(2000.0, card);
    }
}
