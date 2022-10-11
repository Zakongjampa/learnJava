import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Lambda{
    public void demo();
}
// functional interface is an interface having only one abstract method


class Data{
    private String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data [name=" + name + "]";
    }

    
    
}

public class Test {
    public static void main(String[] args) {
        Lambda lambda = () ->{ 
            System.out.println("Statement 1");
            System.out.println("Statement 2");
        };
        lambda.demo();

        Lambda demo = (()-> System.out.println("Statement 1") );
        demo.demo();

        Thread thread1 = new Thread(()->System.out.println("Inside Thread 1"));
        thread1.start();

        System.out.println("--------------------------------------------");
        List<Data> list = new ArrayList<>();
        list.add(new Data("Tenzin"));
        list.add(new Data("Ed"));
        list.add(new Data("Sonam"));
        list.add(new Data("Yeshi"));
        list.add(new Data("Kunphen"));

        // Collections.sort(list, (Data o1, Data o2) -> o1.getName().compareTo(o2.getName())); 
        for(Data d :  list){
            System.out.println(d.getName());
        }

        Collections.sort(list, (Data o1, Data o2) -> {
            if(o1.getName().length() <  o2.getName().length())
                return -1; 
            else if(o1.getName().length() >  o2.getName().length())
                return 1;
            else
                return 0;
        });

        for (Data d : list) {
            System.out.println(d.getName());
        }

    }
}
