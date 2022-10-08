import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.putIfAbsent(1, "one");
        map.putIfAbsent(null, "null");
        map.putIfAbsent(2, "two");
        map.putIfAbsent(4, "four");
        map.put(3, "three");
        map.put(null,"another");

        //Elements can be traversed in any order
        for(Map.Entry<Integer,String> m: map.entrySet()){
            System.out.println("Key : "+m.getKey()+"  and Value : "+m.getValue());
        }

        //performing various operations using Map

        //adding an elements
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(new Integer(1), "Tenzin");
        hm.put(new Integer(2), "Phurbu");
        hm.put(new Integer(3),"Sonam");
        System.out.println("Printing Hash Map ");
        System.out.println("========================");
        show(hm);

        LinkedHashMap<Integer, String> lm = new LinkedHashMap<>(hm);
        System.out.println("Linked HashMap showing");
        System.out.println("------------------------------");
        show(lm);

        TreeMap<Integer,String> tm = new TreeMap<>(lm);
        System.out.println("Showing Tree Map Which doesn't accept any null");
        System.out.println("-------------------");
        show(tm);

        


    }

    public static void show(Map<Integer,String> map){
        for (Map.Entry<Integer, String> mapList : map.entrySet()) {
            System.out.println("Key : " + mapList.getKey() + " Value : " + mapList.getValue());
        }
    }
}
