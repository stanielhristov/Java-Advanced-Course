package definingClassesCar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split(" ");

            Car car = new Car();
            car.setBrand(carInfo[0]);
            car.setModel(carInfo[1]);
            car.setHorsePower(Integer.parseInt(carInfo[2]));

            System.out.println(car);
        }

    }
}
