public class Cow extends Animal{

    Cow() {
        super("Honore");
        System.out.println("This is child constructor.");
    }

    void speak(String speak) {
        super.speak("Speaking");
        System.out.printf("I am a cow %s.", speak);
    }
}
