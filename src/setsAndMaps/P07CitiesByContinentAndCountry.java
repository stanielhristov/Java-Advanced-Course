package setsAndMaps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class P07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> towns = new LinkedHashMap<>();

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String[] input = scanner.nextLine().split(" ");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            if (!towns.containsKey(continent)) {
                towns.put(continent, new LinkedHashMap<>() {{ put(country, new ArrayList<>(){{ add(city);}});}});
            } else {
                if (!towns.get(continent).containsKey(country)) {
                    towns.get(continent).put(country, new ArrayList<>() {{add(city);}});
                } else {
                    towns.get(continent).get(country).add(city);
                }
            }
        }
    }
}
