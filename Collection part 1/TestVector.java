import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Data implements Comparable<Data>{
    String name;
    int rollNo;
    static int rollCount=0;

    public Data(String name) {
        this.name = name;
        this.rollNo = rollCount++;
    }

    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollNo;
    }
   
    public static int getRollCount(){
        return rollCount;
    }

    @Override
    public String toString() {
        return "Data [name=" + name + ", rollNo=" + rollNo + "]";
    }

    @Override
    public int compareTo(Data o) {
        // if(name.length() == o.name.length()){
        //     return 0;
        // }else if(name.length() > o.name.length()){
        //     return 1;
        // }else{
        //     return -1;
        // }

        return (name.compareTo(o.name));
    }    
}


public class TestVector {
    public static List<String> vector = new Vector<>();
    public static Vector<Data> vectObj = new Vector<>();

    public static void main(String[] args) {

        vector.add("Jampa");
        vector.add("Phurbu");
        vector.add("Sonam");

        //adding element at a particular location

        vector.add(2, "Tenzin");


        vectObj.add(new Data("Tenzin"));
        vectObj.add(new Data("Tsering"));
        vectObj.add(new Data("Sonam"));
        showData();
        System.out.println("After Sorting the elements ");
        System.out.println("------------------------------------");
        Collections.sort(vectObj);
        showData();

    }    

    public static void show(){
        for(String name : vector){
            System.out.println(name);
        }
    }

    public static void showData(){
        for(Data d : vectObj){
            System.out.println(d);
        }
    }

    public static void showWithIndex(){
        for(int i=0; i<vector.size(); i++){
            System.out.println("Index : "+i+ " and value : " +vector.get(i));
        }
    }

    public static void showWithIterator(){
        Iterator<String> itr = vector.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void showWithListIter(){
        ListIterator<String> itr = vector.listIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
