public class no2 {
    static int num=0;
    public static void main(String[] args) {

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                while (num<100){
                    if(num%2==0){
                        System.out.println(Thread.currentThread().getName()+"------------>"+num);
                        num++;
                        synchronized ("a"){
                            "a".notify();
                        }
                    }else {
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
        },"t1");
        t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                while (num<100){
                    if (num%2!=0){
                        System.out.println(Thread.currentThread().getName()+"-------------->"+num);
                        num++;
                        synchronized ("a"){
                            "a".notify();
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
        },"t2");
        t2.start();
    }
}
