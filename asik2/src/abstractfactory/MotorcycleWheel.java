package abstractfactory;

public class MotorcycleWheel implements Wheel{
  @Override
  public void rotate() {
    System.out.println("Rotating motorcycle wheel");
  }
}
