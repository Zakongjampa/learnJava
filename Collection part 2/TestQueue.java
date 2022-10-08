import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(5);

        

        try{
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(5);
            queue.add(7);
            queue.add(9);
            queue.add(10);
        }catch(IllegalStateException e){
            System.out.println("Queue is Full");
        }

        for(int a:queue){
            System.out.println(a);
        }
       
    }
}
