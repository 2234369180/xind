import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] ints=new int[10];
        for(int c=0;c<ints.length;c++){
        System.out.println("请输入第"+(c+1)+"个数");
        ints [c]=in.nextInt();
        }
        int a=ints[0];int b=0;
        for (int i = 1; i <10 ; i++) {
            if(ints[i]>a){
                a=ints[i];
            }
            for(int j=1;j<10;j++){
                if(ints[i]<ints[b]){
                    b=i;
                }
            }

        }
        System.out.println(a);
        System.out.println("最小元素"+ints[b]+"最小元素下表"+b);

    }
}
