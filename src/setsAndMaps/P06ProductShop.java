package setsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class P06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String, Double>> shopProducts = new TreeMap<>();


        String input = scanner.nextLine();

        while (input.equals("Revision")) {
            String[] inputParts = input.split(", ");
            String shop = inputParts[0];
            String product = inputParts[1];
            Double price = Double.parseDouble(inputParts[2]);




            shopProducts.putIfAbsent(shop, new LinkedHashMap<>());
            shopProducts.get(shop).put(product, price);


            input = scanner.nextLine();
        }

        System.out.println(shopProducts.entrySet()
                .stream()
                .map(shop ->
                        String.format("%s->%n%s", shop.getKey(),
                                shop.getValue()
                                        .entrySet()
                                        .stream()
                                        .map(product ->
                                                String.format("Product: %s, Price: %.1f",
                                                        product.getKey(),
                                                        product.getValue()))
                                        .collect(Collectors.joining(System.lineSeparator()))
                        )
                )
                .collect(Collectors.joining(System.lineSeparator())));

    }
}
