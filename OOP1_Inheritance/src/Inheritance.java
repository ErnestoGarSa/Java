public class Inheritance {

    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "Slow");

        Dog2 dog = new Dog2();
        doAnimalStuff(dog, "Fast");

        Dog2 yorkie = new Dog2("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog2 retriever = new Dog2("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog2 wolf = new Dog2("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("__________");
    }

}
