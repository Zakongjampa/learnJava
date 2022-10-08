import java.util.Set;
import java.util.TreeSet;

public class TestHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        for(int i=30; i>0; i--){
            set.add(i);
        }

        for(int i:set){
            System.out.println(i);
        }
    }

   
}
