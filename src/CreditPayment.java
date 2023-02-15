public class CreditPayment extends Shop {
    /**
     *
     * @return
     */
    @Override
    public Payment makePayment() {
        return new CreditCard();
    }
}