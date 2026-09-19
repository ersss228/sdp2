package factorymethod;

public class Main {
  public static void main(String[] args) {
    VehicleFactory carFactory = new CarFactory();
    Vehicle car = carFactory.createVehicle();
    car.drive();

    VehicleFactory motorcycleFactory = new MotorcycleFactory();
    Vehicle motorcycle = motorcycleFactory.createVehicle();
    motorcycle.drive();
  }
}
