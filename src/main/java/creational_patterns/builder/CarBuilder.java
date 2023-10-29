package creational_patterns.builder;

import creational_patterns.builder.cars.Car;
import creational_patterns.builder.cars.CarType;
import creational_patterns.builder.components.Engine;
import creational_patterns.builder.components.GPSNavigator;
import creational_patterns.builder.components.Transmission;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        type = type;
    }

    @Override
    public void setSeats(int seats) {
        seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
