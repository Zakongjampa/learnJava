import java.util.Iterator;
import java.util.Stack;

public class TestStack {
        public static Stack<String> stk = new Stack<>();

        public static void main(String[] args) {
        stk.push("Tenzin");
        stk.push("Dolma");
        stk.push("Sonam");
        stk.push("Kalsang");
       
        System.out.println("Showing using show");
        show();
        
        System.out.println("Showing using iterator");
        showWithIterator();

    }

    public static void show(){
        if (stk.isEmpty()) {
            System.out.println("It is empty");
        }else{
            for(String name : stk){
                System.out.println(name);
            }
        }
        
    }

    public static void showWithIterator(){
        if(stk.empty()){
            System.out.println("It is empty");
        }else{
            Iterator<String> itr = stk.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }

        
    }
}
