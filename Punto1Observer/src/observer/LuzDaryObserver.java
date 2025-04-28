package observer;

import subject.Subject;

public class LuzDaryObserver implements Observer, Display {
    private Subject Edco;
    public LuzDaryObserver(Subject subject) {
        this.Edco = subject;
        Edco.registerObserver(this);
    }
    @Override
    public void update(String message) {
        System.out.println("Luz Dary recivio una notificacion" + message);
        display();
    }

    @Override
    public void display() {
      System.out.println("emitir spots publicitarios sobre los nuevos cursos.");
    }
}
