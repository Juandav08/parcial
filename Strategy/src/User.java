public class User  {
    TransactionNotification transactionBehavior;
    BalanceAlert balanceBehavior;
    PromotionNotification promotionBehavior;

    public User(){
    }

    public void notifyTransaction() {
        transactionBehavior.notifyTransaction();
    }

    public void notifyBalanceAlert() {
        balanceBehavior.notifyBalanceAlert();
    }

    public void notifyPromotion() {
        promotionBehavior.notifyPromotion();
    }

    public void setTransactionBehavior(TransactionNotification transactionBehavior) {
        this.transactionBehavior = transactionBehavior;
    }

    public void setBalanceBehavior(BalanceAlert balanceBehavior) {
        this.balanceBehavior = balanceBehavior;
    }

    public void setPromotionBehavior(PromotionNotification promotionBehavior) {
        this.promotionBehavior = promotionBehavior;
    }
}