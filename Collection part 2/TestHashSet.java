import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> nameSet = new HashSet<>();
        nameSet.add("Jampa");
        nameSet.add("Phurbu");
        nameSet.add("Karma");
        nameSet.add("Tenzin");
        nameSet.add("Sonam");
        nameSet.add("Jampa");

        show(nameSet);
    }

    public static void show(Set<String> set){
        for(String name : set){
            System.out.println(name);
        }
    }
}
