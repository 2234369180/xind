import org.omg.CORBA.portable.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class no5 {
    public static void main(String[] args) {
        List<person> l=new ArrayList<>();
        l.add(new person(45));
        l.add(new person(47));
        l.add(new person(49));
        l.add(new person(38));


        try {
            FileOutputStream f=new FileOutputStream("C:\\Users\\20452\\Desktop\\JAVA LIANXI\\a.txt");
            ObjectOutputStream o=new ObjectOutputStream(f);
            o.writeObject(l);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
