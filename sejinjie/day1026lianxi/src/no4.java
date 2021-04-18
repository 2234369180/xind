import java.util.Date;

public class no4 {
    public static void main(String[] args) {
        Thread t=new Thread(new c());
        t.start();


    }
}
class c implements Runnable{

    @Override
    public void run() {
        long d=System.currentTimeMillis();
        for (int i = 0; i < 120000000000l; i++) {
        }
        long d1=System.currentTimeMillis();
        System.out.println("支线循环用了:"+(d1-d)+"毫秒");
        String s = String.valueOf(1200000000l);
        System.out.println(s+"长度是:"+s.length());
    }
}
