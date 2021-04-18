import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ceshi {


    public static void main(String[] args) throws IOException {

        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("C:\\Users\\20452\\Desktop\\JAVA\\a.txt"));
        List<ee> l = new ArrayList<>();
        l.add(new ee("zhangsan"));
        l.add(new ee("zhangsan"));
        o.writeObject(l);
        o.close();


    }
}