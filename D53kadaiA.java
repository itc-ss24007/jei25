public class D53kadaiA {
    public static void main(String[] args) {
        int sum = 0;
        if(args.length == 0){return;}
        for(String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println(sum);
    }
}
