import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Data<K,V>{
    private K key;
    private V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }   

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data [key=" + key + ", value=" + value + "]";
    }
}




public class customSorting {
    public static void main(String[] args) {

        final Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer, String>>(){
            @Override
            public int compare(Data<Integer,String> o1, Data<Integer, String> o2){
                if(o1.getKey() > o2.getKey()){
                    return 1;
                }else if(o1.getKey() == o2.getKey()){
                    return 0;
                }else{
                    return -1;
                }
            }
        };

        final Comparator<Data<Integer,String>> COMPARE_NAME_LENGTH = new Comparator<Data<Integer,String>>() {
            @Override
            public int compare(Data<Integer,String> o1, Data<Integer,String> o2){
                if(o1.getValue().length() > o2.getValue().length()){
                    return 1;
                }else if(o1.getValue().length() < o2.getValue().length()){
                    return -1;
                }else{
                    return 0;
                }
            }
        };

        Set<Data<Integer,String>> set = new TreeSet<Data<Integer, String>>(COMPARE_NAME_LENGTH);
        set.add(new Data<Integer, String>(1, "one"));
        set.add(new Data<Integer, String>(2, "two"));
        set.add(new Data<Integer, String>(3, "three"));
        set.add(new Data<Integer, String>(4, "four"));
        set.add(new Data<Integer, String>(5, "five"));

        for(Data<Integer,String> d : set){
            System.out.println(d);
        }
    }
}
