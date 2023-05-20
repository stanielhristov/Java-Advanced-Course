package advancedExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01Bouquets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tulipsInput = scanner.nextLine();
        String daffodilsInput = scanner.nextLine();

        ArrayDeque<Integer> tulips = new ArrayDeque<>();
        ArrayDeque<Integer> daffodils = new ArrayDeque<>();

        Arrays.stream(tulipsInput.split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(tulips::push);

        Arrays.stream(daffodilsInput.split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(daffodils::offer);

        int bouquets = 0;
        int leftFlowers = 0;

        while (!tulips.isEmpty() && !daffodils.isEmpty()) {
            int tulip = tulips.peek();
            int daffodil = daffodils.peek();
            int sum = tulip + daffodil;

            if (sum == 15) {
                bouquets++;
                tulips.pop();
                daffodils.poll();
            } else if (sum > 15) {
                tulips.pop();
                tulips.push(tulip - 2);
            } else if (sum < 15) {
                leftFlowers += sum;
                tulips.pop();
                daffodils.poll();

            }
        }
        int bouquetsLeftFlowers = leftFlowers / 15;
        bouquets += bouquetsLeftFlowers;

        if (bouquets >= 5) {
            System.out.printf("You made it! You go to the competition with %d ", bouquets);
        } else {
            System.out.printf("You failed... You need more %d bouquets.", 5 - bouquets);
        }
    }

}
