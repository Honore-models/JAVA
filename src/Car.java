class Car {

    String make;
    String model;
    String color;

    Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public String toString(){
        return this.make + " " + this.model + " " + this.color;
    }


}
