import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class rr {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream o=new ObjectInputStream(new FileInputStream("a.txt"));
        ObjectInputStream o1=new ObjectInputStream(new FileInputStream("b.txt"));
        Object o2 = o.readObject();
        System.out.println(o2);
        Object o3 = o1.readObject();
        System.out.println(o3);

    }
}
