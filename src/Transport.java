public abstract class Transport {
    private String transportName;
    private int speed;
    private int capacity;
    private EngineType engineType;

    public Transport(String transportName, int speed, int capacity, EngineType engineType) {
        this.transportName = transportName;
        this.speed = speed;
        this.capacity = capacity;
        this.engineType = engineType;
    }

    public String getTransportName() {
        return transportName;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
