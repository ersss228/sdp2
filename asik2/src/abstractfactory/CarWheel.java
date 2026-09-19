package abstractfactory;

public class CarWheel implements Wheel{
  @Override
  public void rotate() {
    System.out.println("Rotating car wheel");
  }
}
