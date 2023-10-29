package creational_patterns.builder;

import creational_patterns.builder.cars.CarType;
import creational_patterns.builder.components.Engine;
import creational_patterns.builder.components.GPSNavigator;
import creational_patterns.builder.components.Transmission;
import creational_patterns.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
