package abstractfactory;

public class CarEngine implements Engine{
  @Override
  public void start() {
    System.out.println("Starting car engine");
  }
}
