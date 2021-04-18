import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class no9 {
    public static void main(String[] args) {
        BufferedWriter b = null;
        try {
            FileWriter f=new FileWriter("C:\\Users\\20452\\Desktop\\JAVA\\a.txt");
             b=new BufferedWriter(f);
            b.write("kldfgj你好\n啊");
            b.newLine();
            b.write("你也好");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(b!=null){
                try {
                    b.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
