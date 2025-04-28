

public class NoBalanceAlert implements BalanceAlert {
    @Override
    public void notifyBalanceAlert() {
        System.out.println("El usuario no desea recibir");
    }
}