// Класс двигателя
public sealed class Engine permits CarEngine, PlaneEngine, ShipEngine, BikeEngine {
    protected FuelType fuelType;
    protected int power;

    public Engine(FuelType fuelType, int power) {
        this.fuelType = fuelType;
        this.power = power;
    }
}
