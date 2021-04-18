import java.util.Objects;

public class No6 extends person{




    public static void main(String[] args) {
        person[] people = new person[20];
        int jishu=0;
        people[jishu++] = new person("liyi", 18);
        people[jishu++] = new person("lier", 18);
        people[jishu++] = new person("lisan", 18);
        people[jishu++] = new person("lisi", 18);
        people[jishu++] = new person("liwu", 18);
        people[jishu++] = new person("liliu", 18);

        int b=-1;String s="liwu";
        for(int i=0;i<jishu;i++) {
            if (s.equals(people[i].name)) {
                b = i;
                break;
            }
        }
            if(b>=0){
                System.arraycopy(people, b+1, people, b, people.length-b-1);
                people[jishu-1]=null;
                jishu--;
            }else{
                System.out.println("没有这个人");
            }
            for (int j = 0; j < jishu; j++) {
                System.out.println(people[j]+" ");
            }
        }

    }

class person{
    String name;
    int age;

    public person() {
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
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
