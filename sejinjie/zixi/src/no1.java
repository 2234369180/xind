import java.util.HashMap;
import java.util.HashSet;

public class no1 {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<>();
        String s1=new String("h");
        String s2="h";
        h.add(s1);
        h.add(s2);
        System.out.println(h.size());
    }
}
