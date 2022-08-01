package code_design_patterns.java;

import java.util.function.Supplier;

public class Main {

  // Member variables cause in a more complex example, we could get new tacos often using the Supplier interface.
  private static Supplier<Taco> tacoSupplierChicken = () -> new Taco("Chicken");
  private static Supplier<Taco> tacoSupplier = () -> new Taco();
  private static Supplier<String> tacoHello = () -> "Hello, welcome to a test of the Supplier interface";

  public static void main(String[] args) {

    // Hello world to begin
    System.out.println(tacoHello.get());

    // Temp taco, calling Chicken supplier
    Taco taco = tacoSupplierChicken.get();
    // Print it out
    System.out.println(taco.toString());

    // This time call default supplier, no meat, straight to print out.
    System.out.println(tacoSupplier.get().toString());

  }
}
