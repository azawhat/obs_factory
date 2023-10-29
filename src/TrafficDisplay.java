class TrafficDisplay implements TrafficObserver {
    private String name;

    public TrafficDisplay(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " Display: " + message);
    }
}