class TrafficDisplayFactory implements TrafficDeviceFactory {
    public TrafficObserver createTrafficObserver(String name) {
        return new TrafficDisplay(name);
    }
}