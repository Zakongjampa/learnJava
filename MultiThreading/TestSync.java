class Brakets {
    private Object lock = "Lock";

    public void generate() {
        synchronized (lock){
            for (int i = 0; i <= 10; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (i <= 5) {
                    System.out.print("[");
                } else {
                    System.out.print("]");
                }
            }
        System.out.println();
        }
        

        for(int j=0; j<=10; j++){
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}

public class TestSync {
    public static void main(String[] args) {
       
        Brakets g = new Brakets();

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for (int i = 1; i <= 5; i++) {
                    g.generate();
                }

                long endTime = System.currentTimeMillis();
                long totalTime = endTime - startTime;
                System.out.println("Total Time1 : "+totalTime);
            }

        });

        thread.start();

        Thread thread2 = new Thread(new Runnable(){

            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for (int i = 0; i <= 5; i++) {
                g.generate();
               }     
                long endTime = System.currentTimeMillis();
                long totalTime = endTime - startTime;
                System.out.println("Total Time2 : " + totalTime);           
            }

        });

        thread2.start();
        // Synchronized function
        // total :  7200

        // synchronized block
        // Total : 4670
    }
}
