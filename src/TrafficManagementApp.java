public class TrafficManagementApp {
    public static void main(String[] args) {
        TrafficManagementSystem trafficSystem = new TrafficManagementSystem();
        TrafficDeviceFactory factory = new TrafficDisplayFactory();

        TrafficObserver display1 = factory.createTrafficObserver("Display 1");
        TrafficObserver display2 = factory.createTrafficObserver("Display 2");

        trafficSystem.addObserver(display1);
        trafficSystem.addObserver(display2);

        trafficSystem.simulateTrafficUpdate("Intersection A", "Clear");
        trafficSystem.simulateTrafficUpdate("Intersection B", "having many cars");

        trafficSystem.removeObserver(display1);

        trafficSystem.simulateTrafficUpdate("Intersection C", "Moderate traffic");
    }
}