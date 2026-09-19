package abstractfactory;

public interface VehiclePartsFactory {
  Engine createEngine();
  Wheel createWheel();
}
