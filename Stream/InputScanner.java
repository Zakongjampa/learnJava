import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputScanner{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File(".\\studyeasy\\Team.txt"))) { //try with resources 
            String line;                                                              // where it will close the resource automatically
            while(sc.hasNext()){
                line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File file = new File(".\\studyeasy\\Team.txt");
        if(file.delete()){
            System.out.println("Deletion is successful!");
        }else{
            System.out.println("Error! while deleting!");
        }
        
    }
}