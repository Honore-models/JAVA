import java.io.FileWriter;
import java.io.IOException;

public class Files {

    public static void main(String[] args){

//       ➡️ This is ordinary method of opening a file, but there is the best approach called try-with-resources
//       ⚠️ If you try to write a file without closing it , it may cause data and resource leakage.

        FileWriter file = null;

        try{
            file = new FileWriter("test.txt");
            file.write("This is my first file.\n");
            System.out.println("File was written successfully");

        }catch(IOException e){
            System.out.println("Could not open file.");

        }finally {

            if(file != null){
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("Could not close file.");
                }
            }
        }

//      This is try-with-resources approach that closes the file automatically.

        try(FileWriter file2 = new FileWriter("with-resources.txt")){
            file2.write("This is the second file with try-with-resources approach");
            System.out.println("File2 written successfully");
        }catch(IOException e){
            System.out.println("Could not open file.");
        }
    }
}
