public class Main {
    public static void main(String[] args) {

// Создание экземпляров классов
        Car car = new Car("Lada", 2025, new CarEngine(FuelType.PETROL, 100), 4);

        car.displayInfo();
        car.start();
        car.stop();

        Plane plane = new Plane("Boeing", 2005, new CarEngine(FuelType.JET_FUEL, 1000), 200);

        plane.displayInfo();
        plane.start();
        plane.stop();

        Ship ship = new Ship("Сruiser", 1990, new CarEngine(FuelType.DIESEL, 10000), 2000);

        ship.displayInfo();
        ship.start();
        ship.stop();

        Bike bike = new Bike("Honda", 2013, new CarEngine(FuelType.ELECTRIC, 20), "Yes");

        bike.displayInfo();
        bike.start();
        bike.stop();

    }
}