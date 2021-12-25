public class Service {
  public void execute() {
    System.out.println("Execute service.execute method.");
    System.out.println(Calc.add(4,5));
    System.out.println(Calc.subtract(4, 2));
    System.out.println(Calc.multiply(4, 2));
    // 4 / 2 = 2
    System.out.println(Calc.divide(4, 2));
  }
}
