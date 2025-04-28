
import java.util.Observable;
import observer.AndreaObserver;
import observer.LuzDaryObserver;
import observer.LauraObserver;
import observer.Observer;
import subject.Edco;
import subject.Subject;

public class App {
    public static void main(String[] args) throws Exception {

        Subject edco = new Edco();


        Observer andrea = new AndreaObserver(edco);
        Observer luzDary = new LuzDaryObserver(edco);
        Observer laura = new LauraObserver(edco);
    
        edco.measurementsChanged("Nuevos cursos de Java", "Actualizar curso de Python");
        System.out.println("\n");
        edco.measurementsChanged("Nuevos cursos de JavaScript", "Actualizar curso de C++");
    }
}
