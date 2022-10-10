public class TestVolatile {
    volatile public static int flag =0;
    // volatile keyword is used only for variable where the caching is not allowed
    
    public static void main(String[] args) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    if (flag == 0) {
                        break;
                    }
                }
            }
            
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                flag = 1;
                System.out.println("Flag value updated!!");
            }
            
        }).start();

    }
}
