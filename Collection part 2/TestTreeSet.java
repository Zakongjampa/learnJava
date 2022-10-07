import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(1);
        tree.add(2);
        tree.add(5);
        tree.add(8);
        tree.add(10);


        System.out.println("Ceiling : "+tree.ceiling(3));
        System.out.println("Floor : "+tree.floor(3));
        // try{
        //     tree.ceiling(null);
        // }catch(NullPointerException e){
        //     e.printStackTrace();
        // }
        // System.out.println("Still Executing");

        // Iterator<Integer> itr = tree.descendingIterator();
        // while(itr.hasNext()){
        //     System.out.println("elements : "+itr.next());
        // }

        // itr = tree.iterator();

        // while(itr.hasNext()){
        //     System.out.println("Elements : "+itr.next());
        // }
        
        System.out.println(tree.first());

        System.out.println(tree.headSet(9));
        System.out.println("Poll first : "+tree.pollFirst());
        System.out.println("Poll last : "+tree.pollLast());

        //Different operations on tree set

        // 1. Adding Elements 
        tree.add(16);

        //Accesing the Elements 
        System.out.println(tree.contains(17));
        System.out.println(tree.contains(16));

        System.out.println("first element : "+tree.first());
        System.out.println("Last element : "+tree.last());

        //higher than and lower than 
        System.out.println("Higher : "+tree.higher(7));
        System.out.println("Lower : "+tree.lower(7));

        System.out.println("Floor : "+tree.floor(7));
        System.out.println("Ceiling : "+tree.ceiling(7));


        
        
    }
}
