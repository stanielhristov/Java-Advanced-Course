package functionalProgramming;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class P06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int lowerBound = Integer.parseInt(input[0]);
        int upperBound = Integer.parseInt(input[1]);

        String evenOrOdd = scanner.nextLine();

        Predicate<Integer> filterCondition =
                evenOrOdd.equals("odd") ?
                        (x -> x % 2 != 0) :
                        (x -> x % 2 == 0);

        IntStream.rangeClosed(lowerBound, upperBound)
                .filter(num -> filterCondition.test(num))
                .forEach(num -> System.out.print(num + " "));





    }
}
