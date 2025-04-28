public class EmailPromotionNotification implements PromotionNotification {
    @Override
    public void notifyPromotion() {
        System.out.println("Enviando promoicion");
    }
}
