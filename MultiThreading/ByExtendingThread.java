class MyCounter extends Thread {
    private int ThreadNo;

    public MyCounter(int threadNo) {
        ThreadNo = threadNo;
    }

    @Override
    public void run() {
        countMe();
        super.run();
    }

    public void countMe() {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("The value if i is " + i + " and the thread number is :" + ThreadNo);
        }
    }
}

public class ByExtendingThread {
    public static void main(String[] args) {
        MyCounter ct1 = new MyCounter(1);
        MyCounter ct2 = new MyCounter(2);
        long startTime = System.currentTimeMillis();
        ct1.start();
        System.out.println("===================================");
        ct2.start();
        long endTime = System.currentTimeMillis();
        System.out.println("Total time : " + (endTime - startTime));
    }
}
