import java.util.ArrayList;
import java.util.Collection;

public class no6 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("fsjg");
        c.add("aa");
        c.add("bb");
        c.add("cc");
        System.out.println(c);

        Collection<String> c1=new ArrayList<>(c);
        System.out.println(c1);
        c1.remove("fsjg");

        Collection<String> c2=new ArrayList<>();
        c2.addAll(c1);
        System.out.println(c2);
        c2.add("fg");

        c2.removeAll(c1);
        System.out.println(c2);
        c2.retainAll(c);
        System.out.println("------------");

        System.out.println(c2);

    }
}
