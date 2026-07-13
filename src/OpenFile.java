import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OpenFile {

    public static void main(String[] args) {

//        When reading files in Java we combine bufferedReader and FileReader
//        💡 What is Buffering? Buffering is the process by which the data is stored to temporary memory (RAM) instead of
//        Moving direct from source to destination.

//       ➡️ How BufferReader and FileReader works together to improve performance and efficiency

//        The file reader reads the file and then the buffer reader get that content from file reader and stores them in
//        the Buffer and this reduce the number of reads from that file because when the contents are needed again it
//        will come from Buffer

        String filePath = "C:\\Users\\HP\\Documents\\KiCad\\DB_PROMPT.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

        }catch(FileNotFoundException e){
            System.out.println("File not found.");
        }catch(IOException e){
            System.out.println("Error opening file.");
        }
    }
}
