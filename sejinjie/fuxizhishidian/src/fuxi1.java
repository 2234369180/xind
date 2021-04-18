import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.Array;
import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

public class fuxi1 {
    public static void main(String[] args) {
        //根据字节数组创建String对象
        byte [] b={62,120,66};
       String s=new String(b);
        System.out.println(s);

        //根据字符数组创建String对象,
        char [] c={635,15,346,1234,1532};
        String s1=new String(c);
        System.out.println(s1);

        //通过字符串变量名创建新String对象
            String s2=new String(s1);
        System.out.println(s2);
        /*char charAt(int index)  返回字符串指定索引值的字符
        int length()  返回字符串长度,即字符串中字符的数量
                charAt(i)方法返回value[i]数组元素,  length()方法返回value.length数组的长度*/
        String txt = "Hello world";
        char c1 = txt.charAt(1);
        System.out.println(c1);
        System.out.println(txt.length());
        for(int i=0;i<txt.length();i++){
            System.out.print(txt.charAt(i)+" ");
        }


        //可以通过for循环遍历String字符串的每个字符

        /*2)
                int compareTo(String anotherString)  比较当前字符串与参数字符串的大小,如果当前字符串大返回正数,
				参数字符串大返回负数,相等返回0, 在比较时逐个字符比较,遇到第一个不相等的字符码值相减
                int compareToIgnoreCase(String str)  忽略大小写后再比较字符串大小

            Java把当前对象与另外一个对象比较大小的功能抽象到Comparable接口中, String类实现了Comparable接口,重写了compareTo()方法
         */
        System.out.println("abc".compareTo("abcd"));

        //如果想要比较汉字, 需要先拿到汉字的比较器

        //二分查找前提是数组由小到大排序


        //1) 调用Arrays.toString()可以把数组元素连接为字符串
        int[] iii = {54, 68, 1258, 1853, 6874, 16544, 328};
        String s3 = Arrays.toString(iii);
        System.out.println(s3);

        //2) 调用Arrays.copyOf( 源数组, 新数组的长度) 进行数组复制, 返回新的数组
        int[] ints = Arrays.copyOf(iii, iii.length/ 2);
        System.out.println(Arrays.toString(ints));


        //3) 调用Arrays.sort()可以对数组元素排序
        Arrays.sort(iii);

        //4) 排序后,可以进行二分查找
        int i = Arrays.binarySearch(iii, 38);
        System.out.println(i);

/**
 * 对象数组的排序
 */

        //        Arrays.sort(arr);  //产生java.lang.ClassCastException异常. arr数组中存储的是Person对象,
//sort()排序时需要比较数组元素的大小, 当前arr数组中的Person对象不具备比较大小的功能
        /*
            对象数组排序
                1) 调用sort(对象数组)时, 让数组中的对象具有大小比较的功能
                2) 可以调用Arrays.sort(T[] a, int fromIndex, int toIndex, Comparator<? super T> c) 方法实现排序,
				第一个参数a接收一个对象数组, 第二个fromIndex(0), 第三参数toIndex指定对a数组元素排序的范围[fromIndex, toIndex(结尾)),
				第四 个参数c指定数组元素比较规则
         */
        //对arr数组中 [ 0 , size)范围内的Person对象进行排序, 根据 年龄升序排序
        person [] p=new person[20];
    int size=0;
        p[size++]=new person("zhangsan", 11);
                p[size++]=new person("lisi", 12);
                p[size++]=new person("wangwu", 13);
        Arrays.sort(p, 0, size, new Comparator<person>() {
                    @Override
                    public int compare(person o1, person o2) {
                        return o1.name.compareTo(o2.name);
                    }
                }
        );
        for(int j=0;j<size;j++){
        System.out.print(p[j]+" ");
        }

        }
        }
class person  {
    String name;
    int age;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


}
class p implements Comparator<person>{

    @Override
    public int compare(person o1, person o2) {
        return o1.name.compareTo(o2.name);
    }


}

