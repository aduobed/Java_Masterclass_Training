
public class FeetToInchesChallenge {
  public static void main(String[] args) {

    calcFeetAndInchesToCentimeters(6, 11);

    calcFeetAndInchesToCentimeters(157);
  }

  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    if (feet >= 0 && inches >= 0 && inches <= 12) {
      // 1inch = 2.54cm & 1 foot 12inches
      double centimeters = (feet * 12) * 2.54;
      centimeters += inches * 2.54;

      System.out.println(feet + " feet " + inches + " inches = " + centimeters);
      return centimeters;
    }
    System.out.println("Invalid feet or inches");
    return -1;
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {
    if (inches >= 0) {
      double feet = (int) inches / 12;
      double remainingInches = (int) inches % 12;
      System.out.println(inches + " inches amounts to: " + feet + " and " + remainingInches);
      return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
    return -1;
  }
}
