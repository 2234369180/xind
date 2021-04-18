public class no1 {

        private static final Object OBJ  = new Object();    //定义常量对象作为锁对象
        public static void main(String[] args) {
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 200; i++) {
                        System.out.println(Thread.currentThread().getName() + " --------- " + i);
                        if ( i == 100 ){
                            System.out.println(Thread.currentThread().getName() + " 将要进入等待状态");
                            synchronized ( OBJ){
                                try {
                                    System.out.println("============要等待了");
                                    OBJ.wait();     //线程等待
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }, "t1");
            t1.start();

            //当前main线程
            for (int i = 0; i < 10; i++) {
                System.out.println("main == " + i + " == " + System.currentTimeMillis());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("main线程执行完for循环后,把t1等待的线程唤醒");
            synchronized (OBJ){
                OBJ.notify();
            }
//        t1.interrupt();     //中断t1线程也会把t1的wait等待给中断,wait等待被中断会抛出异常
        }
    }


