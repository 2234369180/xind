import java.sql.SQLOutput;

public class no2 {
    public static void main(String[] args) {
       a<Integer> a1=new a<>();
        a1.setName(11);
        System.out.println(a1.getName());


    }
}
class a<T>{
    private T name;


    public a() {
    }



    public T getName() {
        return name;
    }

    public void setName(T name) {
        if(name=="zg")
        {this.name = name;}
    }


}
