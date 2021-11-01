public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew() {
        System.out.println("Dog.chew() method called.");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat method called.");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() method is called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() method is called");
        super.move(10);
    }

    public void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() method called.");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() method called");
        moveLegs(speed);
        super.move(speed);
    }
}
