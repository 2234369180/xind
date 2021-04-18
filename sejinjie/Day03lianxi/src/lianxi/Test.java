package lianxi;

import javax.sound.midi.Soundbank;
import javax.xml.crypto.Data;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        company c=new company();
        Employee []e=new Employee[5];

        c.add(new Employee("zhangsan", "007", 15, 10000));
        c.add(new Employee("lisi", "002", 18, 1000));
        c.add(new Employee("wangwu", "000654", 24, 100000));
        c.add(new Employee("zhaoliu", "004", 35, 1000000));
        c.add(new Employee("chenqi", "005", 45, 100));
        c.add(new Employee("qianyi", "00169", 19, 17000));
        c.add(new Employee());
        c.print();
        System.out.println(c.panduanmingzi("zhangsan"));
        System.out.println(c.panduanmingzi(null));
        System.out.println(c.panduanmingzi("zhangsan1"));
        c.shanchu("lisi");
        c.print();
        System.out.println("==================");
        c.print();
        System.out.println("==========11========");
        c.shengxu();
        c.print();
        c.jiangxu();
        System.out.println("==========11========");
        c.print();
        System.out.println("==========11========");

        }
    }

