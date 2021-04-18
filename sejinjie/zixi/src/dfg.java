import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class dfg {
    public static void main(String[] args) {
        student s1=new student("zhangsan");
        student s2=new student("zhangsan");
        Map<student,String> m=new HashMap();
        m.put(s1,"k");

        System.out.println(m);

    }
}
class  student{
    String name;

    public student(String name) {
        this.name = name;
    }

    public student() {
    }
}
