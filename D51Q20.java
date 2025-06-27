public class D51Q20 {
    public static void main(String[] args) {
        boolean flg = true;
        int n = 6;
        char c = (flg=n>8) ? 'Y' : 'N';//赋值表达式不仅完成赋值，还会返回赋值后的值 flg = false,返回false
        System.out.println(c);
    }
}
