class Data {
    private Object data;

    public Data(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Data [data=" + data + "]";
    }
 
    
}

class GenericType<T>{
    T data;

    public GenericType(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "GenericType [data=" + data + "]";
    }
    
}


public class NeedGeneric {
    public static void main(String[] args) {
        Data data = new Data("Some String");
        String variable = (String) data.getData();
        System.out.println(variable);


        GenericType<String> d = new GenericType<>("Some String");
        String var = d.getData();
        System.out.println(var);
    }
}
