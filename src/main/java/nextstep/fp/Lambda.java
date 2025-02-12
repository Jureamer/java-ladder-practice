package nextstep.fp;

import java.util.List;

public class Lambda {
    public static void printAllOld(List<Integer> numbers) {
        numbers.forEach(System.out::println);
    }

    public static void printAllLambda(List<Integer> numbers) {
        numbers.forEach(System.out::println);
    }

    public static void runThread() {
        new Thread(System.out::println).start();
    }

    public static int sumAll(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static int sumAllEven(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 == 0).reduce((a, b) -> a + b).orElse(0);
    }

    public static int sumAllOverThree(List<Integer> numbers) {
        return numbers.stream().filter(number -> number > 3).reduce((a, b) -> a + b).orElse(0);
    }
}
