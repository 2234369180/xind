import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class no1 {
    public static void main(String[] args) {


        try (FileInputStream fi=new FileInputStream("C:\\Users\\20452\\Desktop\\JAVA\\2-07\\JJavaSE课堂笔记");
             FileOutputStream fo=new FileOutputStream("C:\\Users\\20452\\Desktop\\JAVA LIANXI",true);){

            byte [] b=new byte[1024];
            int i=0;
            while ((i=fi.read(b))!=-1){
                fo.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
