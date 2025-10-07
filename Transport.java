// Абстрактный класс видов транспорта
public abstract class Transport {
    protected String model;
    protected int year;
    protected Engine engine;

    public Transport(String model, int year, Engine engine) {
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    public abstract void start();
    public abstract void stop();
    public abstract void displayInfo();
}
