import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class no5 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("jj");
        c.add("gg");
        c.add("gg");
        c.add("dd");
        c.add("dd");
        c.add("jj");
        System.out.println(c);
        for (Iterator<String> c1 = c.iterator(); c1.hasNext(); ) {
            String next =  c1.next();
            if("dd".equals(next)){
                c1.remove();
            }

        }

            System.out.println(c);

    }
}
