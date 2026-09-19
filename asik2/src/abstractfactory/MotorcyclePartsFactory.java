package abstractfactory;

public class MotorcyclePartsFactory implements VehiclePartsFactory {

  @Override
  public Engine createEngine() {
    return new MotorcycleEngine();
  }

  @Override
  public Wheel createWheel() {
    return new MotorcycleWheel();
  }
}
