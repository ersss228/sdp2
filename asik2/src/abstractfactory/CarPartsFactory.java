package abstractfactory;

public class CarPartsFactory implements VehiclePartsFactory {
  @Override
  public Engine createEngine() {
    return new CarEngine();
  }
  @Override
  public Wheel createWheel() {
    return new CarWheel();
  }

}
