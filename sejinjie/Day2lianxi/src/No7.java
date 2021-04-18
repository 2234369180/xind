public class No7 {
    public static void main(String[] args) {
        int [] ints={21,32,20,34,18,36};
        int t;
        for (int i = 0; i <ints.length-1 ; i++) {
            System.out.println("-------第"+(i+1)+"轮---------");
            for (int j = 0; j <ints.length-1-i ; j++) {
                if(ints[j]<ints[j+1]){
                    t=ints[j+1];
                    ints[j+1]=ints[j];
                    ints[j]=t;
                }
                    for (int anInt : ints) {
                        System.out.print(anInt+" ");
                    }
                System.out.println();

            }

        }
    }
}
