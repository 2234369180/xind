import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class no7 {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("aa");
        l.add("bb");
        l.add("cc");
        l.add("aa");
        l.add("bb");
        l.add("cc");

        System.out.println(l);
        System.out.println("------------");
        for (String s : l) {
            System.out.print(s+" ");
        }
        l.remove("aa");
        for (Iterator<String> iterator = l.iterator(); iterator.hasNext(); ) {
            String next =  iterator.next();
            if("bb".equals(next)){
                iterator.remove();
            }

        }
        System.out.println("-------------");
        for (String s : l) {
            System.out.print(s+" ");
        }
    }
}
