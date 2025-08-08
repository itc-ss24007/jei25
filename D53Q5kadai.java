public class D53Q5kadai {
    private static int[] taxes = {8,10};
    private static int FOODS = 0;
    private static int OTHER = 1;
    public static void main(String[] args) {
        int dataSize = Integer.parseInt(args[0]);
        String[] names = new String[dataSize];
        int[] prices = new int[dataSize];
        int[] nums = new int[dataSize];
        char[] types = new char[dataSize];

        int argsIdx = 1;
        for (int i = 0; i < dataSize; i++) {
            names[i] = args[argsIdx++];
            prices[i] = Integer.parseInt(args[argsIdx++]);
            nums[i] = Integer.parseInt(args[argsIdx++]);
            types[i] = args[argsIdx++].charAt(0);
        }
        System.out.println("商品名\t税抜\t税込\tタイプ");
        int sum_zeinuki=0,sum_zeikomi=0;
        for (int i = 0; i < dataSize; i++) {
            int zeinuki = prices[i] * nums[i];
            int zeikomi,taxType;
            taxType = types[i] == 'f' ? FOODS : OTHER;
            zeikomi = zeinuki * (taxes[taxType]+100)/100;
            System.out.print(names[i] + "\t" + zeinuki + "円\t");
            System.out.println(zeikomi + "円\t" + viewType(types[i]));
            sum_zeinuki += zeinuki;
            sum_zeikomi += zeikomi;
        }
        System.out.println("合計\t"+ sum_zeinuki + "円\t"+ sum_zeikomi +"円\t" );
    }

    private static String viewType(char c) {
        return c == 'f' ? "商品等" : "その他";
    }
}
