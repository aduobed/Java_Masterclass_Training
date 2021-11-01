public class App {
    public static void main(String[] args) {
        Animal animal = new Animal("cat", 4, 2, 3, 5);
//        System.out.println(animal.getName());

        Dog dog = new Dog("Hope", 4, 6, 2, 4, 1, 25, "fur");
        dog.move(4);
        System.out.println("######################");
        dog.run();
//        System.out.println(dog.getName());
//        System.out.println(dog.getName());
//        System.out.println(dog.getSize());
//        System.out.println(dogName);
    }
}
