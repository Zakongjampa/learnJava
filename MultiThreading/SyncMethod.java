class Braket{
    public static synchronized void generate(String ThreadCode){
        for(int i=0; i<=10; i++){
            if(i<= 5){
                System.out.print('[');
            }else{
                System.out.print(']');
            }
        }
        System.out.println("   Generated by "+ThreadCode);
    }


}

public class SyncMethod {
    public static void main(String[] args) {
       

        new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0; i<=5; i++){
                    Braket.generate("Thread 1");
                }                
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<=5; i++){
                    Braket.generate("Thread 2");
                }                
            }            
        }).start();
    }
}
