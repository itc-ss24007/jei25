public class D49Q18kadai {
    public static void main(String[] args) {
        int total = 75;
        int capacity = 30;
        int cargo = 2;

        System.out.println(total/capacity*(double)cargo);//4.0
        System.out.println(total/capacity*cargo);//結果はint型4
        System.out.println((double)(total/capacity*cargo));//4.0

        System.out.println((double)total/capacity*cargo);//5.0
        System.out.println(total/(double)capacity*cargo);//5.0
    }
}
