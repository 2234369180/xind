package cccc;

import java.util.Objects;

public class Bbb implements Cloneable{
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bbb bbb = (Bbb) o;
        return Objects.equals(name, bbb.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Bbb{" +
                "name='" + name + '\'' +
                '}';
    }

    protected int add(int a,int b){
        return a+b;
    }
}
