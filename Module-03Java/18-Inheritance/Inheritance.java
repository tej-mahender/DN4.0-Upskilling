public class Inheritance {

    // Base class
    static class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Subclass
    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Bark");
        }
    }

    public static void main(String[] args) {
        // Create an instance of Animal
        Animal genericAnimal = new Animal();
        System.out.print("Animal says: ");
        genericAnimal.makeSound();

        // Create an instance of Dog
        Dog dog = new Dog();
        System.out.print("Dog says: ");
        dog.makeSound();
    }
}
