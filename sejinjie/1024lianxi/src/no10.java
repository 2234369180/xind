import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class no10 {
    public static void main(String[] args) throws IOException {
        BufferedReader b=null;
        try {

            FileReader f=new FileReader("C:\\Users\\20452\\Desktop\\JAVA\\a.txt");
            b=new BufferedReader(f);
            String s = b.readLine();
            while (s!=null){
                System.out.println(s);
                s = b.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (b!=null){
                b.close();
            }
        }
    }
}
