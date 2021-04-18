import java.util.Arrays;

/*根据 字符串中信息创建Student对象, 保存到数组中
        * 字符串中存储学生的学号,姓名,成绩*/
public class no3 {
    public static void main(String[] args) {
        String txt = "101,lisi,99;202,wangwu,78;303,chenqi,86;404,zhaosi,42;505,feifei,18";
        Student [] s=new Student[50];
        int jishu=0;
        String [] s1=txt.split("[,;]");
        for (int i=0;i<s1.length;i+=3){
            Student s2=new Student(s1[i],s1[i+1],Integer.valueOf(s1[i+2]));
            if(jishu==s.length){
                s= Arrays.copyOf(s, s.length*2);

            }else{
                s[jishu++]=s2;
            }
        }
        for (Student s2 : s) {
            System.out.println(s2);
        }




    }
}
class Student{
    String id;
    String name;
    int score;

    public Student() {
    }

    public Student(String id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
