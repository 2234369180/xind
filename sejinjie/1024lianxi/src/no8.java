import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class no8 {
    public static void main(String[] args) throws IOException {
        FileReader f=new FileReader("C:\\Users\\20452\\Desktop\\JAVA.b.txt");
        char[] c=new char[1024*256];

        int i = f.read(c);


        while (i!=-1){
            System.out.println(new String(c,0,i));
            i = f.read(c);

        }
        f.close();

    }
}
