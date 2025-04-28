public class InstantTransactionNotification implements TransactionNotification {
    @Override
    public void notifyTransaction() {
        System.out.println("Transaccion instantnea");
    }
}