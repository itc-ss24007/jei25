public class D49Q18 {
    public static void main(String[] args) {
        int total = 75;
        int capacity = 30;
        int cargo = 2;

        System.out.println(total/capacity*(double)cargo);
        System.out.println(total/capacity*cargo);
        System.out.println((double)(total/capacity*cargo));
        System.out.println((double)total/capacity*cargo);
    }
}
