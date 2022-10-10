class Brakets{
    public void generate(){
        for(int i=0; i<=10; i++){
            if(i<=5){
                System.out.print("[");
            }else{
                System.out.print("]");
            }
            System.out.println();
        }
    }
}

public class Testing {
    public static void main(String[] args) {
        Brakets b = new Brakets();
        
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=1; i<=5; i++){
                    b.generate();
                }
            }
            
        });

        thread.start();
     
        
    }
}
