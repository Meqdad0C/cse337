package org.sheets.one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public int arrayCount9(int[] nums) {
        return (int) Arrays.stream(nums).filter(n -> n == 9).count();
    }

    public int close10(int a, int b) {
        return Stream.of(a, b).map(n -> Math.abs(n - 10)).distinct().toList().size() == 1
                ? 0
                : Stream.of(a, b).min(Comparator.comparingInt(n -> Math.abs(n - 10))).get();
    }

    public boolean hasTeen(int a, int b, int c) {
        return Stream.of(a, b, c)
                .anyMatch(n -> n >= 13 && n <= 19);
    }

    public int intMax(int a, int b, int c) {
        return Stream.of(a, b, c)
                .max(Integer::compare)
                .get();
    }

    public static <T> Vector<T> union(Vector<T> v1, Vector<T> v2) {
        return Stream.concat(v1.stream(), v2.stream())
                .distinct()
                .collect(Collectors.toCollection(Vector::new));
    }


    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
    }
}
