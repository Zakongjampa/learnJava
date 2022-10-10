import java.util.Random;

class MyCounter implements Runnable{
    private int ThreadNo;

    

    public MyCounter(int threadNo) {
        ThreadNo = threadNo;
    }

    @Override
    public void run() {
        Random random = new Random();
        for(int i=0; i<=9; i++){
            try{
                Thread.sleep(random.nextInt(5000));
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println(" i = "+i+" , ThreadNo : "+ThreadNo);
        }
    }

    public int getThreadNo() {
        return ThreadNo;
    }

}

public class ByImplementingRunnable {
    public static void main(String[] args) {
        // By using the Runnable interface 
        // --------------------------------

        // Thread thread1 = new Thread(new MyCounter(1));
        // Thread thread2 = new Thread(new MyCounter(2));
        // thread1.start();
        // thread2.start();

        // By Creating an anonymous class 
        // --------------------------------

        // new Thread(new Runnable() {

        //     @Override
        //     public void run() {
        //       for(int i=0; i<= 9; i++){
        //         try{
        //             Thread.sleep(100);
        //         }catch(Exception e){
        //             e.printStackTrace();
        //         }
                
        //         System.out.println("Value of i : "+i);
        //       }
                
        //     }
            
        // }).start();

        // By making an anonymous object 
        // ---------------------------

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
               for(int i=0; i<=9; i++){
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                
                System.out.println("Value of i "+i);
               }
                
            }
            
        });

        thread.start();
    }
}
