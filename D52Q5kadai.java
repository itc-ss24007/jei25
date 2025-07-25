public class D52Q5kadai {
    public static void main(String[] args) {
        String majors = "+---------";
        int LIMIT = 400;
        int max = 0,i =0;
        if(args.length == 0){return;}
        int[] data = new int[args.length];
        for(String s : args){
            data[i] = Integer.parseInt(s);
            if(data[i] >= LIMIT ) return;
            if(data[i] > max) {
                max = data[i];
            }
            i++;
        }
        int majormax = (max - 1)/10 +1;
        System.out.print("       ");
        for(i=0;i<majormax;i++){
            System.out.print("+---------");
        }
        System.out.println("");
        for(i=0;i<data.length;i++){
            System.out.printf("%4d : ", data[i]);
            int n = (data[i]-1)/10+1;
            for(int j=0;j<n;j++){
                System.out.print('*');
            }
            System.out.println("");
        }
    }
}
