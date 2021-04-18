public class no3 {
    public static void main(String[] args) {
        Thread t=new newthread();
        t.start();
        for (int i = 0; i < 21212121121f; i++) {
            System.out.println("main方法------------"+i);
        }
    }
}
class newthread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<100000000000f;i++){
            System.out.println("run方法----------"+i);
        }
    }
}
