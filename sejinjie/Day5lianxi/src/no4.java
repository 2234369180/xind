import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class no4 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add(123);
        c.add("你好");
        c.add("hello");
        System.out.println(c);
        c.add(new Date());
        for (Object o : c) {
            System.out.println(o);

            
        }
        c.remove("你好");
        int a=c.size();
        System.out.println(a);
        boolean b=c.contains("hello");
        System.out.println(b);
        for (Object o : c) {
            System.out.println(o);
        }
    }
}
