import java.util.Arrays;

public class D50Q6 {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        if (max < min) {
            int temp = max;
            max = min;
            min = temp;
        }
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.initializePrimeNumbers(max);
        int[] part = primeNumbers.getPart(min, max);
        for (int i = 0; i < part.length; i++) {
            System.out.print(part[i] + " ");
        }

    }
}
    class PrimeNumbers{
        boolean[] isPrimeNumbers;
        void initializePrimeNumbers(int max){
           isPrimeNumbers = new boolean[max+1];
           for(int i = 2; i <= max; i++){
               isPrimeNumbers[i] = true;
           }

           for(int p =2; p*p <= max; p++){
               if(isPrimeNumbers[p]){
                   for(int m = p*2; m <= max; m+=p){
                       isPrimeNumbers[m] = false;
                   }
               }
           }
        }
        int[] getPart(int min,int max){
            int count = 0;
            for(int i = min; i <= max; i++){
                if(isPrimeNumbers[i]){
                    count++;
                }
            }
            int[] part = new int[count];
            int index = 0;
            for(int n = min; n <= max; n++){
                if(isPrimeNumbers[n]){
                    part[index] = n;
                    index++;
                }

            }
            return part;
        }
    }

