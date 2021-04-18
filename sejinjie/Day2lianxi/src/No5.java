public class No5 {
    public static void main(String[] args) {
        int [] ints={4541,158,124,103,67,54};
        int [] big=new int[ints.length+1];
        System.arraycopy(ints, 0, big, 0, 2);
        big[2]=111;
        System.arraycopy(ints, 2, big, 3, ints.length-2);
        ints=big;
        for (int i : big) {
            System.out.print(i+" ");

        }
    }
}
