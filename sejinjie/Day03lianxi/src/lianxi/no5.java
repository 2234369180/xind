package lianxi;

public class no5 {
    public static void main(String[] args) {
        int[][] a=new int[5][3];
        for (int i = 0; i <a.length ; i++) {
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        a[1]=new int[10];
        a[2][0]=12;
        for (int i = 0; i <a.length ; i++) {
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("--------------");
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt);

            }
            System.out.println();
        }
    }
}
