package InnerClasses;

public class Main {
    public static void main(String[] args) {
        GearBox Ferrari = new GearBox(6);
        GearBox.Gear first = Ferrari.new Gear(1, 17.2);
        System.out.println(first.driveSpeed(1000));
    }
}
