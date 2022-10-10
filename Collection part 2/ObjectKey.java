import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
    private String sectionNo, LectureNo;

    public Code(String sectionNo, String lectureNo) {
        this.sectionNo = sectionNo;
        LectureNo = lectureNo;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    public String getLectureNo() {
        return LectureNo;
    }

    @Override
    public String toString() {
        return "Code [sectionNo=" + sectionNo + ", LectureNo=" + LectureNo + "]";
    }

    @Override
    public int compareTo(Code o) {
        String code1 = sectionNo.concat(LectureNo);
        String code2 = o.getSectionNo().concat(o.getLectureNo());
        return code1.compareTo(code2);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sectionNo == null) ? 0 : sectionNo.hashCode());
        result = prime * result + ((LectureNo == null) ? 0 : LectureNo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Code other = (Code) obj;
        if (sectionNo == null) {
            if (other.sectionNo != null)
                return false;
        } else if (!sectionNo.equals(other.sectionNo))
            return false;
        if (LectureNo == null) {
            if (other.LectureNo != null)
                return false;
        } else if (!LectureNo.equals(other.LectureNo))
            return false;
        return true;
    }
    
}

public class ObjectKey {
    public static void main(String[] args) {
        Map<Code,String> lectures = new TreeMap<>();

        lectures.put(new Code("S01", "L03"), "Generics");
        lectures.put(new Code("S01", "L01"), "Files under Java");
        lectures.put(new Code("S02", "L03"), "Network Programming");
        lectures.put(new Code("S01", "L07"), "OOPS");
        lectures.put(new Code("S01", "L05"), "Methods");
        lectures.put(new Code("S01", "L03"), "Expression");

        for(Map.Entry<Code,String> list :  lectures.entrySet()){
            System.out.println("Key: "+list.getKey()+" Value : "+list.getValue());
        }

        String name1 =new String("Jampa");
        String name2 =new String("Jampa");

        System.out.println(name1.equals(name2));
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());


        // For custom object comparision we have to override the equals and hashCode method
        Code c1 = new Code("S01", "Generic");
        Code c2 = new Code("S02", "Generic");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2));

        System.out.println(lectures.get(new Code("S01","L03")));
        
    }
}
