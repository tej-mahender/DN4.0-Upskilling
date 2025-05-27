// Define the interface
interface Playable {
    void play();
}

// Implementing class: Guitar
class Guitar implements Playable {
    public void play() {
        System.out.println(" Guitar is playing: Strum strum!");
    }
}

// Implementing class: Piano
class Piano implements Playable {
    public void play() {
        System.out.println("Piano is playing: Plink plonk!");
    }
}

// Main class to test interface implementation
public class Interface {
    public static void main(String[] args) {
        // Create instances of each instrument
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        // Call the play() method on each
        guitar.play();
        piano.play();
    }
}
