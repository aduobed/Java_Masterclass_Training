package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Wolf");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Ghana black");
        parrot.breathe();
        parrot.canFly();

        Penguin penguin = new Penguin("TG");
        penguin.canFly();
    }
}
