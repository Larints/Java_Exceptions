package lesson_3.ex_02;

public class ZooApp {
    public static void main(String[] args) throws HungryCatException {
        Zoo zoo = new Zoo();

        Animal cat = new Cat(true);
//        Animal dog = new Dog();

        zoo.addAnimal(cat);
//        zoo.addAnimal(dog);

        zoo.makeAllSounds();
    }
}