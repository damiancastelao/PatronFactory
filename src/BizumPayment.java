public class BizumPayment extends Shop {
    @Override
    public Payment makePayment() {
        return new Bizum();
    }
}
