public class Anonymous {

    public static void main(String[] args){

//        Anonymous classes are classes you create when you want like a small unique feature that might need a separate class
//        This anonymous classes can't be re-used cz they have no identifier(name). It is like creating a class inside another class

        Dog dog = new Dog();

        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("i am a speaking Dog");
            }
        };


    }
}

class Dog{

    void speak(){
        System.out.println("Woof! Woof!");
    }
}