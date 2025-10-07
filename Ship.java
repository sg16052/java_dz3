// Класс для корабля
public class Ship extends Transport {
    private int tonnage;

    public Ship(String model, int year, Engine engine, int tonnage) {
        super(model, year, engine);
        this.tonnage = tonnage;
    }

    @Override
    public void start() {
        System.out.println("Корабль " + model + " отплывает");
    }

    @Override
    public void stop() {
        System.out.println("Корабль " + model + " приплывает");
    }

    @Override
    public void displayInfo() {
        System.out.println("Корабль: " + model);
        System.out.println("Год: " + year);
        System.out.println("Двигатель: " + engine.power + " кол-во л.с., топливо: " + engine.fuelType);
        System.out.println("Водоизмещение: " + tonnage);
    }
}
