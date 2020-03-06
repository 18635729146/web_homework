public class Fibonacci {
    public static void main(String[] args) {
        int n = 200;
        for (int i = 1; i < n; i++) {
            System.out.println("Fibonacci.of("+i+")="+Fibonacci_of(i));
        }


    }

    public static int Fibonacci_of(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else if (n > 1) {
            return Fibonacci_of(n - 1) + Fibonacci_of(n - 2);
        } else {
            return 0;
        }
    }
}
