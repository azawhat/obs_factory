import java.util.ArrayList;
import java.util.List;

class TrafficManagementSystem {
    private List<TrafficObserver> observers = new ArrayList<>();

    public void addObserver(TrafficObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TrafficObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (TrafficObserver observer : observers) {
            observer.update(message);
        }
    }

    public void simulateTrafficUpdate(String location, String status) {
        String message = "Traffic at " + location + " is " + status;
        notifyObservers(message);
    }
}