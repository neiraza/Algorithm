public class PrimeNumberFaster {
    public static void main(String args[]) {

        // nまでの素数を出力する
        int maxNum = 100;
        for (int i = 2; i <= maxNum; i++) {
            boolean isPrime = true;
            int sqrtNum = (int) Math.sqrt(i);
            for (int j = 2; j <= sqrtNum; j++) {
                if (i != j && i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("prime num : " + i);
            }
        }
    }
}
