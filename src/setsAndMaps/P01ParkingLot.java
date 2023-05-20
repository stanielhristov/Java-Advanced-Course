package setsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> cars = new LinkedHashSet<>();

        while (!input.equals("END")) {

            String[] inputParts = input.split(", ");
            String inOrOut = inputParts[0];
            String carNumber = inputParts[1];

            if (inOrOut.equals("IN")) {
                cars.add(carNumber);
            } else if (inOrOut.equals("OUT")) {
                cars.remove(carNumber);
            } else {
                System.out.println("UNKNOWN DIRECTION");
            }



            input = scanner.nextLine();
        }

        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car:cars) {
                System.out.println(car);
            }
        }
    }
}
