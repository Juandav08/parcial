package subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Edco implements Subject {
    private String nuevosCursos;
    private String actualizarCurso;
    private List<Observer>observers;

    public Edco() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(null, this); // Llama al método update de cada observador
        }
    }

    public void setNuevosCursos(String nuevosCursos) {
        this.nuevosCursos = nuevosCursos;
        notifyObservers(); // Notifica a los observadores cuando hay un cambio
    }

    public String getNuevosCursos() {
        return nuevosCursos;
    }

    public void setActualizarCurso(String actualizarCurso) {
        this.actualizarCurso = actualizarCurso;
        notifyObservers(); // Notifica a los observadores cuando hay un cambio
    }

    public String getActualizarCurso() {
        return actualizarCurso;
    }

    @Override
    public void registerObserver(observer.Observer o) {
            if (o != null && !observers.contains(o)) {
                observers.add((Observer) o);
            }
        }
    @Override
    public void removeObserver(observer.Observer o) {
            observers.remove(o);
        }

        public void measurementsChanged(String nuevosCursos, String actualizarCurso) {
            this.nuevosCursos = nuevosCursos;
            this.actualizarCurso = actualizarCurso;
            notifyObservers();
        }
}
