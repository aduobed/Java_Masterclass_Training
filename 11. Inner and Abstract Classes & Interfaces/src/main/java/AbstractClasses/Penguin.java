package AbstractClasses;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void canFly() {
        super.canFly();
        System.out.println("I can't fly, can go for a swim instead");
    }
}
