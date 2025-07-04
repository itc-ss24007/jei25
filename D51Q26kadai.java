public class D51Q26kadai {
    public static void main(String[] args) {
        int n = 1;
        String s = "";
        switch (n){
            case 1:s+="one";break;//break文ないと、以降のブロックの処理が順次に実行されるので
            case 2:s+="two";break;
            default:s+="?";break;
        }
        System.out.println(s);
        int n1 = 2;
        String s1 ="";
        switch (n1){
            case 1:s1+="one";
            case 2:s1+="two";
            default:s1+="?";
        }
        System.out.println(s1);
        //switch 文の中で、break を書かないと、
        // 次の case に処理がそのまま落ちていくことを「fall-through（フォールスルー）」と言います
    }
}
