public class no3 {
    static  int num=0;
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 4; i++) {
                    int r=i;

                }
            }


        });
    }

    private void xunhuan(int r) {
        while (true) {
            if (num % 4 == r) {
                System.out.println(Thread.currentThread().getName() + "--------------->" + num);
                num++;
                synchronized ("a"){
                    "a".notifyAll();
                }
            }else{
                synchronized ("a"){
                    try {
                        "a".wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
