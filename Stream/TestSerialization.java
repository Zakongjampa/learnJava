import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Vehical implements Serializable{
    private String type;
    private int number;
    
    public Vehical(String type, int number) {
        this.type = type;
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Vehical [type=" + type + ", number=" + number + "]";
    }  
}

public class TestSerialization {
    public static void main(String[] args) {
        Vehical bike = new Vehical("Bike", 1);
        Vehical car = new Vehical("Car", 234);

        try(FileOutputStream file = new FileOutputStream("studyeasy\\vehical.dat")){
            try (ObjectOutputStream obj = new ObjectOutputStream(file)) {
                obj.writeObject(bike);
                obj.writeObject(car);
                System.out.println("Object Writing onto the file.");
            } catch (FileNotFoundException e) {
               System.out.println("File Not Found Exception");
            }
        } catch(IOException e){
           System.out.println("Input / Output Exception!");
        }
    }
}
