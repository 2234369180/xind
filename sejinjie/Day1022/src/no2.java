import java.util.*;

public class no2 {
    public static void main(String[] args) {
       TreeSet<student> t=new TreeSet<>(new Comparator<student>() {
           @Override
           public int compare(student o1, student o2) {
               return o1.score-o2.score;
           }
       });
        /*t.add(new student("zhangsan", 150));
        t.add(new student("lisi", 25));*/
        t.add(new student("wangwu", 315));
        /*t.add(new student("zhuba", 65));
        t.add(new student("chenqi", 55));
        t.add(new student("zhaoliu", 65));*/
        for (student student : t) {
            System.out.println(student);
        }
        student s=new student("laojiu", 315);
        System.out.println(t.contains(s));
        student s1=new student("chenqi", 55);







    }
}
class student{
    String name;
    int score;

    public student() {
    }

    public student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return score == student.score &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}

