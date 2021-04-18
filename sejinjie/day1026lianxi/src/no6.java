public class no6 {
    public static void main(String[] args) {
       aaa a=new aaa();
       aaa b=new aaa();
        Thread t=new Thread(a);
        Thread t1=new Thread(b);
        t1.setName("t1");
        t.setName("t");
       t.start();
      t1.start();
        try {
            Thread.sleep(1000*3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.b=false;
        System.out.println("kkkk11111111111");
    }
}
class  aaa implements Runnable{
boolean b=true;
    @Override
    public void run() {

                for (int i = 0; i < 10; i++) {
                    if(b){
                    System.out.println(Thread.currentThread().getName() + "--------->" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else{
                    return;
        }
                }


    }
}