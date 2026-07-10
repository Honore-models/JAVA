public class Varags {

    public static void main(){

        System.out.println(add(1,2,3,4));

    }

    static int add(int... numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}
