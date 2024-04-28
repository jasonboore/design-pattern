package design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
    List<Observer> observers = new ArrayList<>();

    public NumberGenerator addObserver(Observer observer) {
        observers.add(observer);
        return this;
    }

    public NumberGenerator deleteObserver(Observer observer) {
        observers.remove(observer);
        return this;
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    protected abstract int getNumber();

    protected abstract void execute();





}
