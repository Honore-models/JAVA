import java.io.FileWriter;
import java.io.IOException;

public class Files {

    public static void main(String[] args){

//      this is try-with-resources approach that closes the file automatically.
        try(FileWriter file = new FileWriter("test.txt");){

            file.write("\nThis is my first file.\n");
            System.out.println("File was written successfully");

        }catch(IOException e){
            System.out.println("Could not open file.");
        }
    }
}
