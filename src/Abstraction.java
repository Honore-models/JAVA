public class Abstraction {

    public static void main(String[] args){

//        Abstraction is hiding complex implementation from the user, like in everyday life examples,
//        Like when you are interacting with the methods of a certain class, and you don't really need to know how
//        they were implemented.
//        NOTE: Abstraction can even happen without using abstract classes and methods, like this example below:

//        Do you know how add() is implemented?
//
//        Maybe yes because you wrote it. But imagine it were part of a library.
//        As the user of the class, you don't need to know the internal code—you only need to know:

//        - It takes two integers.
//        - It returns their sum.
//
//        The implementation is hidden behind the method. That's abstraction.

//        ⚠️ Abstraction exists independently of the 'abstract' keyword.

//        An abstract class doesn't hide the code from the subclasses—they still have to write the implementation.
//        Instead, it hides the implementation from the code that uses the objects.

        Calculator calc = new  Calculator();
        System.out.println(calc.add(5,6));


    }
}

class Calculator {

    public int add(int a, int b) {

        return a + b;
    }
}

abstract class Animals {
    abstract void speak();
}

class Cows extends Animals{

    @Override
    void speak() {
        System.out.println("I'm cow");
    }
}

class Dogs extends Animals{

    @Override
    void speak() {
        System.out.println("I'm dog");
    }
}