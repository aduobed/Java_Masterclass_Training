package InnerClasses;

import java.util.ArrayList;

public class GearBox {
    private final ArrayList<Gear> gears;
    private final int maxGears;
    private int currentGear = 0;
    private boolean clutcIsIn;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0,  0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in) {
        this.clutcIsIn = in;
    }

    public void addGear(int number, double ration){
        if ((number >0 ) && (number <= maxGears)) {
            this.gears.add(new Gear(number, ration));
        }
    }

    public void changeGear(int newGear){
        if ((newGear >= 0) && (newGear <this.gears.size()) && this.clutcIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        } else {
            System.out.println("grind!");
        }
    }

    public class Gear{
        private final int gearNumber;
        private final double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs *(this.ratio);
        }
    }
}
