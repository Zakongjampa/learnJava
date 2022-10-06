import java.util.ArrayList;

class IntWrapper{
    public int value;

    public IntWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    
}

class AutoBoxing{
    public static void main(String[] args) {
        // Wrapper Class

        //Auto boxing 
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(10);

        //Unboxing
        int a = ar.get(0);
        System.out.println(a);


        ArrayList<IntWrapper> intW = new ArrayList<>();
        intW.add(new IntWrapper(10));   //boxing 
        System.out.println(intW.get(0).getValue()); // unboxing

        
    }
}