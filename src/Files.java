import java.io.FileWriter;
import java.io.IOException;

public class Files {

    public static void main(String[] args){

//       There are different ways of interacting with files in Java depending on what you have:
//        1. FileWriter : This is used when you have small files like text files
//        2. BufferWriter : When you are dealing with large files
//        3. PrintWriter : When you are dealing with structured files


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
