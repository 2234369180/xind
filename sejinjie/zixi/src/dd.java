import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class dd {
    public static void main(String[] args) {
        List<String> l=new Vector();
        l.add("11324234");
        l.add("22rgfdg");
        l.add("33gfjh");
        String s1;
        System.out.println(l);
        Iterator<String> i = l.iterator();
        while (i.hasNext()){
            String next = i.next();
            String su = next.substring(3);
            System.out.println(su);
            s1=su;
        }

        System.out.println("--------------");

    }
}
