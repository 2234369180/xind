import java.lang.reflect.Array;
import java.util.*;

public class no1 {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("aa");
        l.add("bb");
        l.add("cc");
        l.add("aa");
        l.add("bb");
        l.add("cc");
        l.add("dd");
        l.add("ee");
        System.out.println(l);
        ListIterator<String> li = l.listIterator();
       for(;li.hasNext();){
           String s=li.next();
           System.out.print(s+"  ");
       }
        System.out.println();
       for(;li.hasPrevious();){
           String s1=li.previous();
           System.out.print(s1+"  ");
       }
        System.out.println();
        System.out.println("----------------------");
       for(;li.hasNext();){
           String s2=li.next();
           if("aa".equals(s2)){
               li.add("对a");
           }else if("bb".equals(s2)){
               li.remove();
           }else if("cc".equals(s2)){
               li.set("cccc");
           }
           System.out.print(s2+" ");


       }
        System.out.println(l);
       l.sort(new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               return o1.compareTo(o2);
           }
       });
        System.out.println(l);
        List<String> sub = l.subList(1, 4);
        System.out.println(sub);
        List<String> sub2 = l.subList(2, 6);
        System.out.println("sub2"+sub2);
        l.set(3, "王炸");
        System.out.println(sub);
        System.out.println(sub2);

        System.out.println(sub);
        sub2.clear();
        System.out.println(l);
        System.out.println("*********************************");

        Object[] o = l.toArray();
        for (Object o1 : o) {
            //toArray()方法返回 Object[]数组,当前objects数组实际存储的是String字符串 想打印数组中的字符串,及这个字符串的长度
            String o2 = (String) o1;
            System.out.println(o2+"----"+o2.length());

        }
        //当前 List集合存储String字符串, 可以先创建一个存储String字符串的数组

               Integer i=60;
        System.out.println(i==60);







    }
    }

