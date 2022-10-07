import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Vehical{
    private int vehicalId;

    public Vehical(int vehicalId) {
        this.vehicalId = vehicalId;
    }

    public int getVehicalId() {
        return vehicalId;
    }

    @Override
    public String toString() {
        return "Vehical [vehicalId=" + vehicalId + "]";
    }   
    
    public void info(){
        System.out.println("Vehical ID is "+getVehicalId());
    }
}

class Car extends Vehical{
    private String carModel;

    public Car(int vehicalId, String carModel) {
        super(vehicalId);
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        return "Car [carModel=" + carModel + "]";
    }

    @Override
    public void info(){
        System.out.println("Car ID is "+getVehicalId());
    }
}


public class WildCards {
    public static void main(String[] args) {
        List<Vehical> lVehicals = new ArrayList<>();
        lVehicals.add(new Vehical(0));
        lVehicals.add(new Vehical(10));
        lVehicals.add(new Vehical(11));
        lVehicals.add(new Vehical(12));
        lVehicals.add(new Vehical(13));
        lVehicals.add(new Vehical(14));
        lVehicals.add(new Car(15,"A12"));
        // display(lVehicals);
        // show(lVehicals);
        showWith(lVehicals);
    }

    // ? is the wild card 
    //Vehical is the upper bound 
    public static void display(List<? extends Vehical> list){
        for(Vehical element : list){
            System.out.println(element);
        }
    }

    //Car is the lower bound 
    public static void show(List<? super Car> list){
        Iterator<? super Car> itr = list.iterator();

        while(itr.hasNext()){
            System.out.println("Car Number  : "+itr.next());
        }
    }


    public static void showWith(List<? extends Vehical> list){
        for(int i=0; i<list.size(); i++){
            list.get(i).info();
        }
    }
}
