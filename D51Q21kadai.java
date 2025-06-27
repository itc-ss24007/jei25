public class D51Q21kadai {
    public static void main(String[] args) {
        int a = 0b101;//二進数->十進数 1*2*2+0*2*1+1=5
        int b = 027;//八進数->十進数 2*8+7=23
        int c = 0x2b;//16進数->十進数 2*16+11=43
        System.out.println(a);//5
        System.out.println(b);//23
        System.out.println(c);//43
        System.out.println(a+b+c);//71
    }
}
