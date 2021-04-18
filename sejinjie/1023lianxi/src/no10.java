import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class no10 {
    public static void main(String[] args) throws IOException {
        FileInputStream f=new FileInputStream("C:\\Users\\20452\\Desktop\\JAVA\\c.txt");
        InputStreamReader i=new InputStreamReader(f,"GBK");
        char [] c=new char[1024*32];
        int i1 = i.read(c);
        while (i1!=-1){
            System.out.println(new String(c,0,i1));
            i1 = i.read(c);
        }
        i.close();

    }
}
