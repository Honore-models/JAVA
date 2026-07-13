import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OpenFile {

    public static void main(String[] args) {
//        When reading files in Java we combine bufferedReader and FileReader

        try(BufferedReader reader = new BufferedReader(new FileReader("with-resources.txt"))){
            System.out.println("File exists and was opened successfully.");
        }catch(FileNotFoundException e){
            System.out.println("File not found.");
        }catch(IOException e){
            System.out.println("Error opening file.");
        }
    }
}
