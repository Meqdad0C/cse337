package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public int intMax(int a,int b, int c){
        return Math.max(Math.max(a,b),c);
    }

    public int close10(int a, int b) {
        return Stream.of(a, b).map(n -> Math.abs(n - 10)).distinct().toList().size() == 1
                ? 0
                : Stream.of(a, b).min(Comparator.comparingInt(n -> Math.abs(n - 10))).get();
    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
    }
}
