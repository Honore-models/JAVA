public class ToString {

    public static void main(String[] args) {

//        .toString() : When you create a class in Java that class automatically inherits from Object class and this object
//        class has a special method called toString which returns string representation of the Object , usually the id of the
//        object and the hash code, so we can override this toString method and modify what it returns

        Car car = new Car("Ford", "Mustand", "Green");
        System.out.println(car);

    }
}
