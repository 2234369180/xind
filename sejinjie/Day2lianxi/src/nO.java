import javax.naming.Name;
import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.Arrays;

public class nO {
    public static void main(String[] args) {
        p p1=new p();
        p1.print();
        p [] pp1=new p[20];
        for (int i = 0; i <pp1.length ; i++) {
            System.out.println(pp1[i]);

        }
        int gg[]=new int[]{21,15,5415,5421};
       int ident= Arrays.binarySearch(gg, 2);
        System.out.println(ident>=0?"角标是"+ident:"没有这个数");

    }



}
class p {
    String name;

    public p() {

    }


    public static void main(String[] args) {
        p p1=new p();
        System.out.println(p1.name);
    }
    public void print() {
        System.out.println(this.name);
    }

}