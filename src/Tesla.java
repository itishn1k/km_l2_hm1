public final class Tesla extends Car{
    public Tesla(String transportName, int speed, int capacity) {
        super(transportName, speed, capacity, EngineType.ELECTRIC);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
