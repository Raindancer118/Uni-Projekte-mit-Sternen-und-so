public class PrimeTester{
    public void divisors(int n){
        System.out.print("Teiler von " + n + " sind");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i == n){
                    System.out.print(" " + i);
                }
                else{
                    System.out.print(" "+ i + ",");
                }
            }
        }
        System.out.println();
    }
    
    public void properDivisors(int n){
        System.out.print("Echte Teiler von " + n + " sind");
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                if (i == n/2){
                    System.out.print(" " + i);
                    break;
                }
                System.out.print(" " + i + ",");
            }
        }
        System.out.println();
    }
    
    public boolean isPrime(int n){
            boolean isPrime = true;
            int i = 2;
            while (i < n) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            return n == 2 || (n > 2 && isPrime);
    }
}