
public class TestInterrupt {
    public static int balance =0;

    public void withdraw(int amount){
        synchronized(this){
            if(balance <= 0){
                try {
                    System.out.println("Waiting for balance updation");
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Original Balance : "+balance);
                    System.out.println("Withdrawal amount : "+amount);
                    balance = balance - amount;
                    System.out.println("Withdrawn Successfully");
                    System.out.println("Remaining Balance : "+balance);
                }
            }else{
                System.out.println("We are inside else block");
            }
        }

       ;
        
    }

    public void deposit(int amount){
        System.out.println("Depositing");
        balance = balance + amount;
        System.out.println("Balance Updated : "+balance);
       
    }

    public static void main(String[] args) {
        TestInterrupt test = new TestInterrupt();

        // Thread with reference got interrupted 
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
               test.withdraw(100);
            }
            
        });
        thread.start();
        if(balance <= 0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            // Thread.interrupted();
        }
        

        // Anonymous Thread got interrupted 
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
               test.withdraw(100);
            }
            
        });
        thread1.start();

        Thread thread2 =new Thread(new Runnable() {

            @Override
            public void run() {
               try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            test.deposit(5000);
            thread1.interrupt();
                
            }
            
        });
        thread2.start();
    }
    
}
