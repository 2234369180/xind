import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class no3 {
    public static void main(String[] args) {
        person p=new person();
        p.age=15;
        ObjectOutputStream o=null;
        try {
             o=new ObjectOutputStream(new FileOutputStream("C:\\Users\\20452\\Desktop\\JAVA LIANXI\\b.txt"));
            o.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                o.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
