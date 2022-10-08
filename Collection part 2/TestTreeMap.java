import java.util.Comparator;
import java.util.TreeMap;

class Student{
    String name;
    int rollNo;
    private static int rollCount=0;
    public Student(String name) {
        this.name = name;
        this.rollNo = ++rollCount;
    }
    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public static int getTotalStudents() {
        return rollCount;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + "]";
    }    
}

public class TestTreeMap {
    public static void main(String[] args) {
        private Comparator<Student> COMPARE_ROLL = new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getRollNo() > o2.getRollNo()){
                    return 1;
                }else if(o1.getRollNo() < o2.getRollNo()){
                    return -1;
                }else
                    return 0;
            }
            
        };

        TreeMap<Integer,Student> student = new TreeMap<Integer,Student>(COMPARE_ROLL);
        student.put(1,new Student("Tenzin"));
    }
}
