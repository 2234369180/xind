import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class no4 {
    public static void main(String[] args) {
        try {
            ObjectInputStream oi=new ObjectInputStream(new FileInputStream("C:\\Users\\20452\\Desktop\\JAVA LIANXI\\b.txt"));
            System.out.println(oi.readObject());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
