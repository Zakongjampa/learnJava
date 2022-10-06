import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {
    static LinkedList<String> ar = new LinkedList<>();

    public static void main(String[] args) {
        
        //adding element into linked list
        ar.add("Tenzin");
        ar.add("Dolma");
        // showWithIndex();

        System.out.println("First element "+ ar.getFirst());
        System.out.println("Last element : "+ar.getLast());

        ar.addFirst("Karma");
        ar.addLast("Sonam");

        //Similar methods 
        ar.offerFirst("Tenzin");
        ar.offerLast("Phurbu");

        // showWithIndex();
        

        ar.add("Pema");

        System.out.println("Peeking  : "+ar.peek());
        System.out.println("Peek for last element : "+ar.peekLast());


        // The peek method will only return null in case the linkedlist is empty but in case of the element, it will throw an exception. 

        //Removing an element

        System.out.println("Removing first element : "+ar.poll());
        System.out.println("Removing last element : "+ar.pollLast());
        showWithIndex();
        
        System.out.println("Displaying using Iterator");
        showWithIterator();

    }

    public static void show(){
        for(String name :  ar){
            System.out.println(name);
        }
    }

    public static void showWithIndex(){
        for(int i=0; i<ar.size(); i++){
            System.out.println("Index : "+i+"   Value : "+ar.get(i));
        }
    }

    public static void showWithIterator(){
        ListIterator<String> itr =  ar.listIterator();

        while(itr.hasNext()){
            System.out.println("Element : "+itr.next());
        }
    }
}
