import java.util.function.IntPredicate;

public class TestPredicate {
    public static void main(String[] args) {
        // Statement 1
        // IntPredicate greaterThan40 = new IntPredicate() {
        //     @Override
        //     public boolean test(int value) {
        //        if(value >= 40)
        //             return true;
        //         return false;
        //     }            
        // };

        // Statement 2
        // IntPredicate greaterThan40 = i -> i>40;

        // Where the statement 1 has deduced to statement 2 
        // by using the lambda function 


        IntPredicate lessThan18 = i -> i<18;

        System.out.println(lessThan18.test(20));
        System.out.println(lessThan18.test(10));
    }

    public void demo(int x, IntPredicate lessThan18, IntPredicate moreThan10){
        if(lessThan18.and(moreThan10).test(x))
            System.out.println("The input is less than 18 and more than 10");
        else
            System.out.println("Invalid input");
    }
}
