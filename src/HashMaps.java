import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {
//        HashMaps is a Datastructure that stores key-value pairs

        HashMap<String, Double> product = new HashMap<>();

        product.put("A", 1.0);
        product.put("B", 2.0);
        product.put("C", 3.0);
        product.put("D", 4.0);

        System.out.println(product.get("C"));
        System.out.println(product.containsKey("A"));

        for(String key : product.keySet()){
            System.out.printf("%s : %.2f\n", key, product.get(key));
        }


    }
}