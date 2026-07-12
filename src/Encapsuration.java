public class Encapsuration {

    public static void main(String[] args) {

//        This is a way of controlling access to properties and methods of a class i.e. controlling how they are accessed
//        Getters and Setters and special methods that allows you to read and modify private methods and properties

        Cars cars = new Cars("Toyota", "Blue", 5100);

        cars.setMake("KIA");
        cars.setPrice(65000);
        System.out.println(cars.getMake());
        System.out.println(cars.getColor());
        System.out.println(cars.getPrice());


    }
}

class Cars{

    private String make;
    private String color;
    private int price;

    Cars(String make, String color, int price){
        this.make = make;
        this.color = color;
        this.price = price;
    }

//    getters
    public String getMake() {
        return this.make;
    }

    public String getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;
    }

//    setters
    public void setMake(String make){
        this.make = make;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setPrice(int price){
        if(price < 0){
            System.out.println("Price cannot be negative");
        }else{
            this.price = price;
        }
    }
}
