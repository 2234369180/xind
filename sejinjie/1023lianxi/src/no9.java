import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class no9 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f=new FileOutputStream("C:\\Users\\20452\\Desktop\\JAVA\\c.txt");
        OutputStreamWriter o=new OutputStreamWriter(f,"GBK");
        o.write("kljfedgdfgh具有很深的分太高1");
         o.close();

    }
}
