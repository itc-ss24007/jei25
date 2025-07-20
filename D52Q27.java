enum Signal {RED,YELLOW,GREEN};
public class D52Q27 {
    public static void main(String[] args) {
        Signal sig = Signal.YELLOW;
        if(sig == Signal.GREEN){
            System.out.println("green");
        }else if(sig == Signal.YELLOW){
            System.out.println("yellow");
        }else{
            System.out.println("red");
        }

    }
}
