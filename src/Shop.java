public abstract class Shop {

    /**
     * metodo abstracto para realizar pagos
     * @return la Interface de tipo Payment
     */
    public abstract Payment makePayment();

    /**
     * Para comprar algo, llama al método makePayment()
     * Con el objeto Payment utiliza su metodo paymentMethod()
     */
    public void buySomething() {
        Payment payment = makePayment();
        payment.paymentMethod();
    }



}