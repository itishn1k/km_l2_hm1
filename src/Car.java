public class Car extends Transport{

    public Car(String transportName, int speed, int capacity, EngineType engineType) {
        super(transportName, speed, capacity, engineType);
    }

    public String getInfo() {
        return getTransportName() +
                "\nSpeed " + getSpeed() + " km/h" +
                "\nPassenger capacity " + getCapacity()+ " persons" + "\nEngine type " + getEngineType()+"\n";
    }

    public final String getInfo(String BU) {
        return  BU+
                "\n"+getTransportName() +
                "\nSpeed " + getSpeed() + " km/h" +
                "\nPassenger capacity " + getCapacity()+ " persons" + "\nEngine type " + getEngineType()+"\n";
    }

}
