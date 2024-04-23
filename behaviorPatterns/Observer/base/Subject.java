package base;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> _observers = new ArrayList<Observer>();


    public void AttachObserver(Observer observer)
    {
        _observers.add(observer);
    }

    public void DetachObserver(Observer observer)
    {
        _observers.remove(observer);
    }

    public void NotifyObservers(Object arg)
    {
        for(Observer observer : _observers){
            observer.Notify(arg);
        }
//        _observers.forEach((notify) -> notify.Notify(arg));
    }
}



