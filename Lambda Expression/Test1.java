import java.util.ArrayList;
import java.util.List;

interface Lambda{
    public void demo();
}

public class Test1 {
    public static void main(String[] args) {
        int x=10;
        Lambda d = () -> System.out.println("Value of x : "+x);
        d.demo();
        // there outer variables are available to the lambda express because 
        // of the scope
        int y=20; 
        new Thread(()-> System.out.println(y)).start();

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(54);
        list.add(7);
        list.add(51);
        list.add(45);
        list.add(59);

        // for(int i : list){
        //     if(i >= 10)
        //         System.out.println(i);
        // }

        list.forEach(i ->{ 
            if( i >= 10)
                System.out.println(i); 
        });

    }
}
