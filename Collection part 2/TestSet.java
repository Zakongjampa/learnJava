import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
    public static Set<String> tSet = new HashSet<>();
    public static Set<Integer> set1 = new HashSet<>();
    public static Set<Integer> set2 = new HashSet<>();

    public static void main(String[] args) {

        // tSet.add("Tenzin");
        // tSet.add("Dolma");
        // tSet.add("Yeshi");
        // tSet.add("Tenzin");
        // show();
        // tSet.remove("Tenzin");

        // Object[] arrSet =  tSet.toArray();

        // for(int i=0; i<arrSet.length; i++){
        //     System.out.println("Element : " +(String)arrSet[i]);
        // }
        
        int[] arr = {1,3,2,4,8,9,0};
        insertInto(arr, set1);

        //Searching for Number 9 in the set 
        //Using an Array

        // Object[] setArr = set1.toArray();

        // for(int i=0; i<setArr.length; i++){
        //     if((int)setArr[i] == 9){
        //         System.out.println("Found the element");
        //     }
        // }

        //using a for loop onto Set

        // for(int i : set1){
        //     if(i == 9){
        //         System.out.println("found the element");
        //     }
        // }

        //Using Arraylist 
        ArrayList<Integer> test = new ArrayList<>(set1);
        System.out.println("Element at index 3 is "+test.get(3));
     
        // set1.addAll((Arrays.asList(arr));

        int[] arr2 = {1,3,7,5,4,0,7,5};
        insertInto(arr2, set2);

        //Intersection operation 
        // System.out.println("Intersection operation in Set");
        // System.out.println("--------------------------");
        // set1.retainAll(set2);
        // show(set1);

        //union operation
        // System.out.println("Union Operations ");
        // System.out.println("-----------------------");
        // set1.addAll(set2);
        // show(set1);

        //Difference Operation A - B
        // System.out.println("Difference Operation");
        // System.out.println("--------------------");
        // set1.removeAll(set2);
        // show(set1);
        


        
        

    }

    

    public static void insertInto(int[] arr, Set<Integer> set){
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
    }

    public static void show(Set<Integer> set){
        if(set.isEmpty()){
            System.out.println("Nothing to show, it empty");
        }else{
            for(Integer name : set){
                System.out.print(name +"     ");
            }
        }
        
    }

    public static void showIterator(){
        Iterator<String> itr = tSet.iterator();
        while(itr.hasNext()){
            System.out.println("Element : "+itr.next());
        }
    }
}
