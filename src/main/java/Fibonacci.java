public class Fibonacci {

    public static boolean isInFibonacci(int number, int a, int b) {
        if (number == 0 || number == 1 || b == number) {
            return true;
        } else if (b > number) {
            return false;
        } else {
            return isInFibonacci(number, b, a + b);
        }
    }

}
