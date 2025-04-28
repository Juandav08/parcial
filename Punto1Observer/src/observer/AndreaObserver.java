package observer;

import subject.Subject;

public class AndreaObserver implements Observer, Display {
    private Subject Edco;
    public AndreaObserver(Subject subject) {
        this.Edco = subject;
        Edco.registerObserver(this);
    }
    @Override
    public void update(String message) {
        System.out.println("Andrea received una notificaion " + message);
        display();
    }

    @Override
    public void display() {
        System.out.println("actualizar permanentemente el sitio web del área de EDCO");
    }

}
