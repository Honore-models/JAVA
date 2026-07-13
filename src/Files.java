import java.io.FileWriter;
import java.io.IOException;

public class Files {

    public static void main(String[] args){

        try{
            FileWriter file = new FileWriter("text.txt");
            file.write("Hello world");
            System.out.println("File was written successfully");
        }catch(IOException e){
            System.out.println("Could not open file.");
        }
    }
}
