import java.util.ArrayList;
import java.util.List;

class GamingPC implements Subject {
    List<Observer> observerList;
    int price;

    public GamingPC(int price) {
        observerList = new ArrayList<>();
        this.price = price;
    }

    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    public void unregisterObserver(Observer o) {
        observerList.remove(observerList.indexOf(o));
    }

    public void notifyObservers() {

        for(Observer obs :observerList)
        {
            obs.update(price);
        }
    }

    public void priceChanged(int price) {
        //get latest data
        this.price = price;
        notifyObservers();
    }
}