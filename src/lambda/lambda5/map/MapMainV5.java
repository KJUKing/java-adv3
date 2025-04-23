package lambda.lambda5.map;

import lambda.lambda5.filter.GenericFilter;

import java.util.List;

public class MapMainV5 {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange");
        // String -> String
        List<String> upperFruits = GenericMap.map(fruits, s -> s.toUpperCase());
        System.out.println("upperFruits = " + upperFruits);

        // String -> Integer
        List<Integer> lengthFruits = GenericMap.map(fruits, s -> s.length());
        System.out.println("lengthFruits = " + lengthFruits);

        // Integer -> String
        List<Integer> integers = List.of(1, 2, 3);
        List<String> starList = GenericMap.map(integers, n -> "*".repeat(n));
        System.out.println("starList = " + starList);
    }
}
