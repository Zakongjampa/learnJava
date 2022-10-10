public class TestJoin {
    public int counter=0;
    public static void main(String[] args) {
        TestJoin test = new TestJoin();

        Thread thread = new Thread(new Runnable(){

            @Override
            public void run() {
                for(int i=0; i<1000; i++){
                    test.counter++;
                }                
            }
        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                for(int i=0; i<1000; i++){
                    test.counter++;
                }
            }
            
        });
        thread.start();
        thread2.start();
        
        // this join will join the currrent (Main Thread ) with the thread that we have created called  thread.
        try {
            thread2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Value of counter : "+test.counter);


    }
}
