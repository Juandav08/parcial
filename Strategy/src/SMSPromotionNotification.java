

public class SMSPromotionNotification implements PromotionNotification {
    @Override
    public void notifyPromotion() {
        System.out.println("Enviando promocion por SMS");
    }
}
