public class no1 {

    public static void main(String[] args) throws InterruptedException {
        cl c=new cl();
        cl c2=new cl();
        Thread t1=new Thread(c,"t1");
        Thread t2=new Thread(c,"t2");
        Thread t3=new Thread(c2,"t3");
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(1000);
        cl c3=new cl();
        System.out.println("c3:"+c3.num);
        Thread t4=new Thread(c3,"t4");
        t4.start();

    }
}

class cl implements Runnable {
    static int num = 0;

    @Override
    public void run() {
        synchronized ("f") {
            for (int i = 0; i < 10; i++) {
                num++;
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + num);

    }
}
