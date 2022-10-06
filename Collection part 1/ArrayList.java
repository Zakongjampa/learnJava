import java.util.ArrayList;
import java.util.Iterator;

class TestArrayList{
    public static ArrayList<String> ar = new ArrayList<>();

  
    public static void main(String[] args){  
        ar.add("Tenzin");
        // show();
        // showWithIndex();

        ar.set(0,"Dolma");
        // showWithIndex();
        ar.add(0,"Pema");
        showWithIndex();

        ar.remove("Dolma");
        showWithIndex();   
        
        System.out.println("Displaying using iterator");
        listIterator();
    }

    public static void show(){
         for(String name : ar){
            System.out.println(name);
        }
    }

    public static void showWithIndex(){
        for(int i=0; i<ar.size(); i++){
            System.out.println("Index : "+i+"   Value : "+ar.get(i));
        }
    }


    public static void listIterator(){
        if(ar.isEmpty()){
            System.out.println("It is empty, Nothing to display");
        }else{
            Iterator<String> itr = ar.iterator();

            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }       
    }
}