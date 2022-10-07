import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<String> sSet = new HashSet<>();
        sSet.add("A");
        sSet.add("B");
        sSet.add("F");

        System.out.println(sSet);

        //Accessing an element

        System.out.println(sSet.contains("D"));
        System.out.println(sSet.contains("F"));

        //Removing an element 
        System.out.println(sSet.remove("B"));
        System.out.println("Elements are : ");
        System.out.println("-------------------");
        System.out.println(sSet);

        //iterating through the set
        for(String s : sSet){
            System.out.println("Elements : "+s);
        }

        //Iterating by iterator 
        Iterator<String> itr  = sSet.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

       


    }
}
