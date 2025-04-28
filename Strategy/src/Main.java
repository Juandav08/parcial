public class Main {
    public static void main(String[] args) {
        User userOne = new Persona();


        System.out.println("Preferencias de notificaciones Usuario numero 1:");
        userOne.notifyTransaction();
        userOne.notifyBalanceAlert();
        userOne.notifyPromotion();

    }
}




