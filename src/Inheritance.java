public class Inheritance {

    public static void main(String[] args) {

//        Animal animal = new Animal();
        Cow cow = new Cow();
        cow.speak("Mooing");
    }
}

// The object created from a subclass contains the parent and child parts, so
// When a child object is created, the parent part of that same object must be initialized first.

// When you create a subclass that inherits from the super class before calling the constructor of the subclass you must first
// call that of the superclass.
// NOTE: If the superclass has no-argument constructor this will work well even when you haven't explicitly called the constructor of
// the superclass cause Java will implicitly call it with super() before executing anything in the subclass constructor
// Why do we need to first call the superclass constructor?
// It is because before Java constructs the child, must first construct the Parent part. like No Father no Child
// If the superclass has a constructor which requires arguments then we will need to explicitly call it with super(arguments)