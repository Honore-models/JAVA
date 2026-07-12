public class Composition {

    public static void main(String[] args) {

//        Composition: Is when one object contains another object and that contained object is totally dependent on that
//        object that contains it.
//        Here this Engine object completely depend on car engine cz it cant be created before Car object

        Carz cars = new Carz("Ford", 2026, "V8");



    }
}

class Engine{

    String name;

    Engine(String name){
        this.name = name;
    }
}

class Carz{

    String model;
    int year;
    Engine engine;

    Carz(String model, int year, String engineName){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineName);
    }
}
