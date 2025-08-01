public class D53Q25kadai {
    public static void main(String[] args) {
        char[] ch = {'A','B','C'};
        String s1 = new String("ABC").intern();
        String s2 = new String(ch).intern();
        //文字列の内容が同じなら、intern() を使って同じリテラルを共有できます
        boolean b1 = s1 == s2;
        boolean b2 =  s1.equals(s2);
        System.out.println(b1+" "+b2);
    }
}
