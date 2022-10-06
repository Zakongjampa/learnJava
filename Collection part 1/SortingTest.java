import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class SortingTest {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("Nepal");
        countries.add("Poland");
        countries.add("Egypt");
        countries.add("Thailand");
        countries.add("Russia");

        SortingTest test = new SortingTest();
        System.out.println("Before Sorting");
        test.printList(countries);
        System.out.println("After sorting");
        Collections.sort(countries);
        countries.sort(null);
        test.printList(countries);
        System.out.println("Reversing list : ");
        Collections.reverse(countries);
        test.printList(countries);
        
        
    }

    public void printList(List<String> list){
        ListIterator<String> itr = list.listIterator();

        while(itr.hasNext()){
            System.out.println("Element : "+ itr.next());
        }

    }
}
