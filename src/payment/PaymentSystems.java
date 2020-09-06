package payment;

public class PaymentSystems {
    PayByCreditCard payByCreditCard = new PayByCreditCard();
    PayByCreditCardLambda payByCreditCardLambda = new PayByCreditCardLambda();

    public void processPayment(){
        System.out.println("Process customer payment");
        payByCreditCard.processPaymentByCreditCard();
        payByCreditCardLambda.processPaymentByCreditCard();
    }
    public class PayByPayPal{
        public void processPaymentByPayPal() {
            System.out.println("process customer payment by Paypal");
        }
    }
    //Anonymous class(PayByCreditCard) example
    public static class PayByCreditCard{
        public void processPaymentByCreditCard() {
            System.out.println("process customer payment by Credit Card");
            Pay pay=new Pay() {
                @Override
                public void paymentMethod() {
                    System.out.println("System will take Credit Card");
                }
            };
            pay.paymentMethod();
        }
    }
    //Anonymous function(PayByCreditCardLambda) example
    public static class PayByCreditCardLambda{
        public void processPaymentByCreditCard() {
            System.out.println("process customer payment by Credit Card with lambda style.!");
            Pay pay = ()-> System.out.println("System will take Credit Card with lambda");
            pay.paymentMethod();
        }
    }
    public class PayByCrypto{
        public void processPaymentByCrypto() {
            System.out.println("process customer payment by Crypto");
        }
    }
    public interface Pay{
        public void paymentMethod();
    }
}
