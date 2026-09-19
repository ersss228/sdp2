package abstractfactory;

public class Main {
  public static void main(String[] args) {
    VehiclePartsFactory carPartsFactory = new CarPartsFactory();
    Engine engine = carPartsFactory.createEngine();
    engine.start();
    Wheel wheel = carPartsFactory.createWheel();
    wheel.rotate();

    VehiclePartsFactory motorcyclePartsFactory = new MotorcyclePartsFactory();
    Engine motorcycleEngine = motorcyclePartsFactory.createEngine();
    motorcycleEngine.start();
    Wheel motorcycleWheel = motorcyclePartsFactory.createWheel();
    motorcycleWheel.rotate();
  }
}
