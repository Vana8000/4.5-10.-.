import java.util.stream.IntStream;

public class ArithmeticProgression {

    public static long getArithmeticProgressionSum(int a, int b) {
        return IntStream.range(a, b).asLongStream().sum();
    }

    public static void main(String[] args) {
        int a = 10000000;
        int b = 1000000000;
        System.out.println("Сумма чисел от " + a + " до " + (b - 1) + ": " + getArithmeticProgressionSum(a, b));
    }
}
