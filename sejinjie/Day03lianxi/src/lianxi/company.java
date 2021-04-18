package lianxi;

import java.util.Arrays;
import java.util.Comparator;

public class company  {
    Employee [] data;
    int jishu;
    public company() {
        data=new Employee[100];
    }
    public company(int a){
        if(a>0){
            data=new Employee[a];
        }else{
            data=new Employee[100];
        }
    }
    public void add(Employee e){
        if(jishu==data.length){
            data=Arrays.copyOf(data, data.length*2);
        }
        data[jishu++]=e;
    }
    //显示员工信息
    public void print(){
        System.out.println("-----------员工信息--------");
        for(int i=0;i<jishu;i++){
            System.out.println(data[i]);
        }
    }

    public boolean panduanmingzi(String name) {
        if (name == null) {
            for (int i = 0; i < jishu; i++) {
                if (data[i].name == null) {
                    return true;
                }
            }
        } else {
            for (int j = 0; j < jishu; j++) {
                if (name.equals(data[j].name)) {
                    return true;
                }
            }
        }
        return false;
    }
    public int panduan(String name){
        if(name!=null){
            for(int i=0;i<jishu;i++){
                if(name.equals(data[i].name)){
                    return i;
                }
            }
        }else{
            for(int j=0;j<jishu;j++){
                if(data[j].name==null){
                    return j;
                }
            }
        }
        return -1;
    }
    public void shanchu(String name){
        int b=panduan(name);
        if(b>=0){
            System.arraycopy(data, b+1, data, b, data.length-b-1);
            data[--jishu]=null;
        }
    }
    public void shengxu(){
        Arrays.sort(data, 0, jishu, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.age-o2.age;
            }
        });

    }
    public void jiangxu(){
        Arrays.sort(data, 0, jishu, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.age-o1.age;
            }
        });
    }


}







