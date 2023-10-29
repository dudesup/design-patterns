package creational_patterns.builder.components;

import creational_patterns.builder.cars.Car;

public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel(){
        System.out.printf("Fuel level: " + car.getFuel());
    }

    public void showStatus(){
        if(this.car.getEngine().isStarted()){
            System.out.printf("Car is started");
        } else {
            System.out.printf("Car isn't started");
        }
    }
}
