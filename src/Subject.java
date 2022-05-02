import java.util.ArrayList;

interface Subject
{
     void registerObserver(Observer o);
     void unregisterObserver(Observer o);
     void notifyObservers();
}

