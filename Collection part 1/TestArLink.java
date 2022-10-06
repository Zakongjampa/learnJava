import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Data{
    static int staticRoll=0;
    int rollNo=0;
    String name;
    public Data(String name) {
        this.rollNo = staticRoll++;
        this.name = name;
    }
    
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data [rollNo=" + rollNo + ", name=" + name + "]";
    }

    

    

}



public class TestArLink {
    public static List<Data> list = new ArrayList<>();
    public static List<Data> lList = new LinkedList<>();

    public static void main(String[] args) {
        list.add(new Data("Tenzin"));
        list.add(new Data("Tsering"));
        list.add(new Data("Sonam"));

        // show();
        // showWithIterator();

        lList.addAll(list);
        show((LinkedList<Data>) lList);

    }

    public static void show(){
        for(Data d : list){
            System.out.println(d);
        }
    }

    public static void show(LinkedList<Data> list){
        for(Data d: list){
            System.out.println(d);
        }
    }

    public static void showWithIterator(){
        Iterator<Data> itr = list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }


}
