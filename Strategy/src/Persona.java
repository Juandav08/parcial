public class Persona extends User{
    public Persona(){
        super();
        this.balanceBehavior = new NoBalanceAlert();
        this.transactionBehavior = new DailyTransactionNotification();
        this.promotionBehavior = new SMSPromotionNotification();
    }
}
