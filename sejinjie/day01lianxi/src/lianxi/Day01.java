package lianxi;

import java.util.Scanner;

public class Day01  {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输出一个日期的年份");
        int a=input.nextInt();
        System.out.println("请输出一个日期的月份");
        int b=input.nextInt();
        System.out.println("请输出一个日期的日期");
        int c=input.nextInt();
        int s;
        if((a/4==0&&a/100!=0)||a/400==0){
            a=1;

        }else {
            a=0;
        }
        switch (b){
            case 1:
            b=0;
            break;
            case 2:
                b=31;
                break;
            case 3:
                b=28+31+a;
                break;
            case 4:
                b=28+31+31+a;
                break;
            case 5:
                b=28+31+31+30+a;
                break;
            case 6:
                b=28+31+31+30+31+a;
                break;
            case 7:
                b=28+31+31+30+31+30+a;
                break;
            case 8:
                b=28+31+31+30+31+30+31+a;
                break;
            case 9:
                b=28+31+31+30+31+30+31+31+a;
                break;
            case 10:
                b=28+31+31+30+31+30+31+31+30+a;
                break;
            case 11:
                b=28+31+31+30+31+30+31+31+30+31+a;
                break;
            case 12:
                b=28+31+31+30+31+30+31+31+30+31+30+a;
                break;

        }
        s=b+c;
        System.out.println("这是这年的第"+s+"天");
    }


}
