public class Car {

  // private int wheels;
  // private int doors;
  private String model;
  // private String engine;
  public String colour;

  public void setModel(String model) {
    String validModel = model.toLowerCase();
    if (validModel.equals("accent") || validModel.equals("elantra")) {
      this.model = model;
    } else {
      this.model = "unknown";
    }
  }

  public String getModel() {
    return this.model;
  }
}
