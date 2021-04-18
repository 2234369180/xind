import java.io.FileInputStream;
import java.io.IOException;

public class no5 {
    public static void main(String[] args) {
        try (FileInputStream f=new FileInputStream("C:/Users/20452/Desktop/JAVA/2-08/aaa.txt");){
            System.out.print("剩余字节数"+f.available());
            int i = f.read();
            for (;i!=-1;){
                System.out.print("剩余字节数"+f.available());
                char c=(char)i;
                System.out.println(c+"kkk");
                i=f.read();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
