public class Main {
    private static Shop miTienda;
    public static void main(String[] args) {


    /**
        Cash obxCash = new Cash();
        obxCash.paymentMethod();


        CreditCard obxCreditCard = new CreditCard();
        obxCreditCard.paymentMethod();
     **/
        // instancio la clase que extiende de shop
        miTienda = new BizumPayment();
        // redundante
        // miTienda.makePayment();

        // tengo los metodos de shop y de CreditCard
        miTienda.buySomething();


    }
}