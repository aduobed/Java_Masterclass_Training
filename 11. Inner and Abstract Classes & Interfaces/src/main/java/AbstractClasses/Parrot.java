package AbstractClasses;

public class Parrot extends Bird{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void canFly() {
        super.canFly();
        System.out.println("Flying from branch to branch....");
    }
}
