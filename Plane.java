// Класс для самолета
public class Plane extends Transport {
    private int seats;

    public Plane(String model, int year, Engine engine, int seats) {
        super(model, year, engine);
        this.seats = seats;
    }

    @Override
    public void start() {
        System.out.println("Самолет " + model + " взлетает");
    }

    @Override
    public void stop() {
        System.out.println("Самолет " + model + " садится");
    }

    @Override
    public void displayInfo() {
        System.out.println("Самолет: " + model);
        System.out.println("Год: " + year);
        System.out.println("Двигатель: " + engine.power + " кол-во л.с., топливо: " + engine.fuelType);
        System.out.println("Количество мест: " + seats);
    }
}
