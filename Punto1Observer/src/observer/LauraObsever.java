package observer;

import subject.Subject;

public class LauraObsever implements Observer, Display {
    private Subject Edco;
    public LauraObsever (Subject subject) {
        this.Edco = subject;
        Edco.registerObserver(this);
    }
    
    @Override
    public void update(String message) {
        System.out.println("Laura recivio una notificacion: " + message);
        display();
    }

    @Override
    public void display() {
        System.out.println("crear posts en las redes sociales más populares  con la oferta de cursos");
    }

}
