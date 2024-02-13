package org.meqdad.one;

import java.util.Arrays;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public int arrayCount9(int[] nums) {
        return (int) Arrays.stream(nums).filter(n -> n == 9).count();
    }

    public int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);
        return (aDiff == bDiff) ? 0 : (aDiff < bDiff) ? a : b;
    }

    public boolean hasTeen(int a, int b, int c) {
        return Stream.of(a, b, c).anyMatch(n -> n >= 13 && n <= 19);
    }

    public int intMax(int a, int b, int c) {
        return Stream.of(a, b, c).max(Integer::compare).get();
    }

    public static Vector union(Vector v1, Vector v2) {
        return (Vector) v1.stream().distinct().filter(v2::contains).collect(Collectors.toCollection(Vector::new));
    }


    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
    }
}
