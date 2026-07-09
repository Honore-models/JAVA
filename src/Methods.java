public class Methods {

    public static void main(String[] args) {

        int width = 10;
        int height = 15;
        int area = area(width, height);
        System.out.println("Area is " + area);

    }

    static int area(int width, int height){
        return width * height;
    }
}
