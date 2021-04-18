import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class no3 {
    public static void main(String[] args) throws IOException {
        FileInputStream f=new FileInputStream("C:/Users/20452/Desktop/JAVA/2-08/aaa.txt");
        System.out.println(f.available());
        int i = f.read();
        System.out.println(i);
        f.skip(3);
        System.out.println(f.available());
        f.close();
    }
}
