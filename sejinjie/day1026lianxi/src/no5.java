import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class no5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("---------------"+Thread.activeCount());
        FutureTask f=new FutureTask(new ca());
        Thread t=new Thread(f);
        System.out.println("---------------"+Thread.activeCount());
        t.start();
        System.out.println("---------------"+t.isAlive());
        System.out.println(f.get());
        System.out.println("结束了?");

    }
}
class ca implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Random r=new Random();
        int i = r.nextInt(10);
        return i;
    }
}
