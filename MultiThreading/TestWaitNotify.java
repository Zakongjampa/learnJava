


public class TestWaitNotify {
    static public int balance =0;

    public  void withdraw(int amount){
        synchronized (this){
            if(balance <= 0){
                try {
                    System.out.println("Waiting for the amount to be deposited");
                    wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        
        
        balance = balance - amount;
        System.out.println("Withdraw Successfully");
        System.out.println("Balance : "+balance);
    }

    public void deposit(int amount){
        System.out.println("We are depositing the amount");
        balance = balance +amount;
        System.out.println("Balance  : "+balance);
        synchronized(this){
            notify();
        }
    }
    public static void main(String[] args) {
        TestWaitNotify test  = new TestWaitNotify();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
               test.withdraw(1000);
            }            
        });
        thread1.setName("Thread 1");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                test.deposit(5000);
                
            }
            
        });
        thread2.setName("Thread 2");
        thread2.start();

        // Notify()  and notifyAll() are two which can stop the waiting thread. 
        // if you just call the notify, it will stop the longest waited thread. 
    }
}
