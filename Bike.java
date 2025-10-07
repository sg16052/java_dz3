// Класс для мотоцикла
public class Bike extends Transport {
    private String sidecar;

    public Bike(String model, int year, Engine engine, String sidecar) {
        super(model, year, engine);
        this.sidecar = sidecar;
    }

    @Override
    public void start() {
        System.out.println("Мотоцикл " + model + " заводится");
    }

    @Override
    public void stop() {
        System.out.println("Мотоцикл " + model + " останавливается");
    }

    @Override
    public void displayInfo() {
        System.out.println("Мотоцикл: " + model);
        System.out.println("Год: " + year);
        System.out.println("Двигатель: " + engine.power + " кол-во л.с., топливо: " + engine.fuelType);
        System.out.println("Наличие коляски: " + sidecar);
    }
}
