public class Generics {

    public static void main(String[] args) {

//        Generics is a feature of Java that allows you to create Re-usable components (Classes, Methods and Interfaces)
//        that can work with different types of objects. It uses angle brackets <>

        Box<String> box = new Box<>();
        box.setItem("Banana");
        System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("T-Shirt", 12.5);
        product1.showProduct();
        Product<String, Integer> product2 = new Product<>("Pants", 4500);
        product2.showProduct();

    }
}

class Box<T>{

    T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }
}

class Product<T, U>{

    T item;
    U price;

    Product(T item, U price){
        this.item = item;
        this.price = price;
    }

    public void showProduct(){
        System.out.println(this.item + " "  + this.price);
    }
}
