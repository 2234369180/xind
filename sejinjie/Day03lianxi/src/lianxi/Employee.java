package lianxi;

public class Employee implements Comparable<Employee> {
    String name;
    String id;
    int age;
    double sasalary;

    public Employee() {
    }

    public Employee(String name, String id, int age, double sasalary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.sasalary = sasalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", sasalary=" + sasalary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return o.name.compareTo(this.name);
    }
}
