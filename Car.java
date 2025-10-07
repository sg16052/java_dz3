// Класс для автомобиля
public class Car extends Transport {
    private final int doors;

    public Car(String model, int year, Engine engine, int doors) {
        super(model, year, engine);
        this.doors = doors;
    }

    @Override
    public void start() {
        System.out.println("Автомобиль " + model + " едет");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль " + model + " останавливается");
    }

    @Override
    public void displayInfo() {
        System.out.println("Автомобиль: " + model);
        System.out.println("Год: " + year);
        System.out.println("Двигатель: " + engine.power + " кол-во л.с., топливо: " + engine.fuelType);
        System.out.println("Количество дверей: " + doors);
    }
}
