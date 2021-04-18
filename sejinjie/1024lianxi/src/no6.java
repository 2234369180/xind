import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Set;

public class no6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream f=new FileInputStream("C:\\Users\\20452\\Desktop\\JAVA LIANXI\\a.txt");
        ObjectInputStream o=new ObjectInputStream(f);
        Object o1 = o.readObject();
       // List li=(List) o1;
        System.out.println(o1);

    }
}
