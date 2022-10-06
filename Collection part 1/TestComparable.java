import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

class Names implements Comparable<Names>{
    private String names;

    public Names(String names) {
        this.names = names;
    }

    @Override
    public int compareTo(Names o) {
        if(names.length() > o.names.length())
            return 1;
        else if(names.length() < o.names.length())
            return -1;
        return 0;
    }

    public String getNames() {
        return names;
    }

}
public class TestComparable {
    public static void main(String[] args) {
        List<Names> nameListt = new ArrayList<>();
        nameListt.add(new Names("Tenzin"));
        nameListt.add(new Names("Dolma"));
        nameListt.add(new Names("Jampa"));
        nameListt.add(new Names("Phurbu"));

        TestComparable test = new TestComparable();
        System.out.println("Before sorting ");
        test.printList(nameListt);
        System.out.println("After sorting");
        Collections.sort(nameListt);
        test.printList(nameListt);

        System.out.println("Reversing the list");
        Collections.reverse(nameListt);
        test.printList(nameListt);
    }
    public void printList(List<Names> list){
        ListIterator<Names> itr = list.listIterator();

        while(itr.hasNext()){
            System.out.println("Element : "+itr.next().getNames());
        }
    }
}
