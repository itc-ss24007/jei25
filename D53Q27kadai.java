enum Udon{
    KAKE("かけ",290),
    KITSUNE("きつね",-380),
    CURRY("カレー",490),
    TENPURA("天ぷら",200);
    private String japaneseName;
    int price;
    Udon(String japaneseName,int price){
        this.japaneseName = japaneseName;
        if(price >= 0){
            this.price = price;
        }else {
            this.price = -1 * price;
        }
    }
    public String toString(){
        return japaneseName + ":" + price + "円";
    }
}
public class D53Q27kadai {
    public static void main(String[] args) {
        System.out.print(Udon.TENPURA);
    }
}
