import java.sql.SQLOutput;

public class Saa {
    public static void main(String[] args) {
        Saa s=new Saa();
        s.bbb();
    }
    int a=0;
    public  void aaa(){
        a=1;
    }
    public void bbb(){
        int b=2;
        int c=b-a;
        System.out.println(c);
    }
}
