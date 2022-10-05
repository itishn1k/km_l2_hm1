public class Main {
    public static void main(String[] args) {
        Tesla tesla1 = new Tesla("Tesla Model X",270,6);
        Lexus lexus = new Lexus("LX570",220,5);
        Car car = new Car("Dad's Nissan",180,5,EngineType.THERMAL);
        System.out.println(tesla1.getInfo());
        System.out.println(lexus.getInfo("Б/У"));
        System.out.println(car.getInfo("Б/У"));
    }
}