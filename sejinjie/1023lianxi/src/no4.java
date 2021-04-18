import java.io.FileInputStream;
import java.io.IOException;

public class no4 {
    public static void main(String[] args) {
        try {
            FileInputStream f=new FileInputStream("C:/Users/20452/Desktop/JAVA/2-08/aaa.txt");
            int i=f.read();
            while (i!=-1){
                System.out.println(i);
                i=f.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
