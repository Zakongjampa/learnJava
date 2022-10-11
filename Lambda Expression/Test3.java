import java.util.ArrayList;
import java.util.List;

class Data{
    private String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data [name=" + name + "]";
    }   
}

public class Test3 {
    public static void main(String[] args) {
        List<Data> list = new ArrayList<>();
        list.add(new Data("Tenzin"));
        list.add(new Data("Jampa"));
        list.add(new Data("Phurbu"));
        list.add(new Data("Yeshi"));
        list.add(new Data("Pema"));
        list.add(new Data("Samdup"));
        list.add(new Data("Dolma"));
        list.add(new Data("Lobsang"));

        list.forEach(data -> System.out.println(data.getName()));
    }
}
