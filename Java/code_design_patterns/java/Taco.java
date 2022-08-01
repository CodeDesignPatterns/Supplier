package code_design_patterns.java;

public class Taco {

  private String meat;
  private static final String DEFAULT_MEAT = "Beef";


  public Taco(String meat) {
    this.meat = meat;

  }

  public Taco() {
    this.meat = DEFAULT_MEAT;

  }

  public String getMeat() {
    return meat;
  }

  

  @Override
  public String toString() {
    return "Taco{" +
        "meat='" + meat + '\'' +
        '}';
  }

}
