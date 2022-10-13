import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {
      File file = new File(".\\studyeasy");
      file.mkdir();

      file = new File(".\\studyeasy\\Team.txt");
    //   try{
    //     file.createNewFile();
    //     System.out.println("File created");
    //   }catch(IOException e){
    //     System.out.println("Error, occured while creating the file");
    //   }
    // It will work even when there is no file creation code 

    // Writing onto the file 

      try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
        bw.write("Jampa ");
        bw.newLine();
        bw.write("Tenzin ");
        bw.newLine();
        bw.write("Pema ");
        bw.newLine();
        bw.write("Khando ");
        bw.newLine();
        bw.write("Lobsang ");
        bw.close();
      }catch(IOException e){
        System.out.println("Error! occured while writing onto the file.");
      }

      try{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while((line =br.readLine()) != null){
            System.out.println(line);
        }
      }catch(FileNotFoundException e){
        System.out.println("File Not found exception");
      }catch(IOException e){
       System.out.println("Input and Output Exception");
      }
      
     
      


    }
}
