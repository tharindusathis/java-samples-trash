package com.github.examples.functional_interfaces.a1_iterators_demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(12, 34, 56, 54, 78);

        // #1
        for (int value = 0; value < marks.size(); value++) {
            System.out.println(marks.get(value));
        }

        // #2
        for(int value: marks){
            System.out.println(value);
        }

        // #3 Note that: Consumer is a functional interface
        marks.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer value) {
                System.out.println(value);
            }
        });

        // #4
        marks.forEach( (Integer value) -> { System.out.println(value); });

        // #5
        marks.forEach( (value) -> { System.out.println(value); });

        // #6
        // parenthesis are optional, ONLY when 1 parameter
        marks.forEach( value ->  System.out.println(value) );

        // #7 with passing method reference
        marks.forEach( System.out::println );

        // ------------------------------------------------------------------------

        // with a map
        Map<String,Integer> scores = new HashMap<>();
        scores.put("EN87342", 78);
        scores.put("EN87346", 90);
        scores.put("EN87353", 56);

        // old way
        scores.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String enNumber, Integer score) {
                System.out.println("Score of " + enNumber + " is " + score);
            }
        });

        // better way
        scores.forEach( (enNumber, score) -> System.out.println("Score of " + enNumber + " is " + score) );
    }
}
