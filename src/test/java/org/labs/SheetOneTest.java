package org.labs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sheets.one.*;

import java.util.Arrays;
import java.util.Vector;


class SheetOneTest {

    @Test
    void arrayCount9() {

        Solution solution = new Solution();
        int[] arr;
        int result;

        // fault 1 : not handling empty array
        arr = new int[]{};
        result = solution.arrayCount9(arr);

        Assertions.assertEquals(0, result);


        // fault 2 : start counting from the second element

        arr = new int[]{9, 2, 3, 23, 3};

        result = solution.arrayCount9(arr);

        Assertions.assertEquals(1, result);


        // fault 3 : stop iterating before the last element

        arr = new int[]{9, 2, 3, 23, 9};

        result = solution.arrayCount9(arr);

        Assertions.assertEquals(2, result);


        // fault 4 : counter is in wrong position

        arr = new int[]{2, 2, 3, 23, 1, 2, 3, 4, 5};

        result = solution.arrayCount9(arr);

        Assertions.assertEquals(0, result);


        // fault 5 : returning after first 9 only

        arr = new int[]{1, 2, 9, 9, 12};

        result = solution.arrayCount9(arr);

        Assertions.assertEquals(2, result);


        // fault 6 : returning the number of count - 1

        arr = new int[]{1, 2, 9, 9, 9, 9, 9, 12};

        result = solution.arrayCount9(arr);

        Assertions.assertEquals(5, result);


        // fault 7 : not detecting the last 9

        arr = new int[]{9, 9, 9, 9, 9, 9, 9};

        result = solution.arrayCount9(arr);

        Assertions.assertEquals(7, result);


        // fault 8 : increment counter for negative numbers

        arr = new int[]{-9, -9, -9, 9, 9, -9, -9};

        result = solution.arrayCount9(arr);

        Assertions.assertEquals(2, result);


    }

    @Test
    void close10() {

        int x, y, result;

        Solution solution = new Solution();

        // fault 1: not including 10 in comparison

        x = 10;
        y = 3;

        result = solution.close10(x, y);

        Assertions.assertEquals(10, result);


        // fault 2: not including negative numbers considering -9 nearest than 0

        x = -9;
        y = 0;

        result = solution.close10(x, y);

        Assertions.assertEquals(0, result);


        // fault 3: return number even there is a tie

        x = 8;
        y = 8;

        result = solution.close10(x, y);

        Assertions.assertEquals(0, result);


        // fault 4: return the other value (not the correct one)

        x = 6;
        y = 7;

        result = solution.close10(x, y);

        Assertions.assertEquals(7, result);


        // fault 5: if both negative, use math.abs

        x = -6;
        y = -7;

        result = solution.close10(x, y);

        Assertions.assertEquals(-6, result);


        // fault 6: use math.abs for one positive and other negative

        x = 6;
        y = -7;

        result = solution.close10(x, y);

        Assertions.assertEquals(6, result);

    }

    @Test
    void hasTeen() {

        int a, b, c;
        boolean result;

        Solution solution = new Solution();


        // fault 1: return true even all values not teen

        a = 6;
        b = 70;
        c = 12;

        result = solution.hasTeen(a, b, c);

        Assertions.assertEquals(false, result);


        // fault 2: return true, take math.abs if values are negative

        a = -16;
        b = -15;
        c = -14;

        result = solution.hasTeen(a, b, c);

        Assertions.assertEquals(false, result);


        a = -16;
        b = 10;
        c = -14;

        result = solution.hasTeen(a, b, c);

        Assertions.assertEquals(false, result);


        a = 11;
        b = 10;
        c = -14;

        result = solution.hasTeen(a, b, c);

        Assertions.assertEquals(false, result);


        // fault 3: return false if there is 19 or 13

        a = 19;
        b = 10;
        c = 11;

        result = solution.hasTeen(a, b, c);

        Assertions.assertEquals(true, result);

        a = 13;
        b = 10;
        c = 11;

        result = solution.hasTeen(a, b, c);

        Assertions.assertEquals(true, result);


        // fault 4: return true if the values are 0

        a = 0;
        b = 0;
        c = 0;

        result = solution.hasTeen(a, b, c);

        Assertions.assertEquals(false, result);


        // fault 5: considering only the two values

        a = 0;
        b = 0;
        c = 15;

        result = solution.hasTeen(a, b, c);

        Assertions.assertEquals(true, result);


        //fault 6: return true if there is INTEGER.min or INTEGER.max

        a = 0;
        b = 0;
        c = Integer.MIN_VALUE;

        result = solution.hasTeen(a, b, c);

        Assertions.assertEquals(false, result);

        a = 0;
        b = 0;
        c = Integer.MAX_VALUE;

        result = solution.hasTeen(a, b, c);

        Assertions.assertEquals(false, result);


    }

    @Test
    void intMax() {

        int a, b, c;
        int result;

        Solution solution = new Solution();

        // fault 1: return the last element

        a = 6;
        b = 70;
        c = 12;

        result = solution.intMax(a, b, c);

        Assertions.assertEquals(70, result);


        // fault 2: return the largest with math.abs

        a = 6;
        b = -70;
        c = 12;

        result = solution.intMax(a, b, c);

        Assertions.assertEquals(12, result);


        // fault 3: return 0 if all values are negative

        a = -6;
        b = -70;
        c = -12;

        result = solution.intMax(a, b, c);

        Assertions.assertEquals(-6, result);


        // fault 4: handle the case where all the same correct

        a = 6;
        b = 6;
        c = 6;

        result = solution.intMax(a, b, c);

        Assertions.assertEquals(6, result);


        // fault 5: return value close to max

        a = 1000;
        b = 1001;
        c = 999;

        result = solution.intMax(a, b, c);

        Assertions.assertEquals(1001, result);

        // fault 5: return value instead of INTEGER.max

        a = 1000;
        b = 1001;
        c = Integer.MAX_VALUE;

        result = solution.intMax(a, b, c);

        Assertions.assertEquals(Integer.MAX_VALUE, result);


        // fault 6: return INTEGER.min

        a = 1000;
        b = 1001;
        c = Integer.MIN_VALUE;

        result = solution.intMax(a, b, c);

        Assertions.assertEquals(1001, result);

        // fault 7: return value even the max is 0

        a = 0;
        b = -1;
        c = -2;

        result = solution.intMax(a, b, c);

        Assertions.assertEquals(0, result);

    }

    @Test
    void union() {

        Vector vector1 = new Vector<>();
        Vector vector2 = new Vector<>();
        Vector resultV;

        // fault 1: return the intersection instead of union

        vector1.add(1);
        vector1.add(2);
        vector2.add(3);
        vector2.add(4);

        resultV = Solution.union(vector1, vector2);


        Assertions.assertEquals(new Vector<Integer>(Arrays.asList(1, 2, 3, 4)), resultV);

        // fault 2: return the union with duplicate elements
        vector1.clear();
        vector2.clear();

        vector1.add(1);
        vector1.add(2);
        vector2.add(2);
        vector2.add(4);

        resultV = Solution.union(vector1, vector2);

        Assertions.assertEquals(new Vector<Integer>(Arrays.asList(1, 2, 4)), resultV);


        // fault 3: return the union with size larger than the union
        vector1.clear();
        vector2.clear();

        vector1.add(1);
        vector1.add(2);
        vector2.add(2);
        vector2.add(4);

        resultV = Solution.union(vector1, vector2);

        Assertions.assertEquals(3, resultV.size());


        // fault 4: return empty vector if one of them is empty
        vector1.clear();
        vector2.clear();

        vector1.add(1);
        vector1.add(2);

        resultV = Solution.union(vector1, vector2);

        Assertions.assertEquals(new Vector<Integer>(Arrays.asList(1, 2)), resultV);

        // fault 5: return elements even both are empty
        vector1.clear();
        vector2.clear();


        resultV = Solution.union(vector1, vector2);

        Assertions.assertEquals(new Vector<Integer>(Arrays.asList()), resultV);

        // fault 6: return only integer intersections

        vector1.clear();
        vector2.clear();

        vector1.add(1);
        vector1.add("youssef");

        vector2.add(1);
        vector2.add('M');
        vector2.add(2.2);


        resultV = Solution.union(vector1, vector2);

        Assertions.assertEquals(new Vector<>(Arrays.asList(1, "youssef", 'M', 2.2)), resultV);


        // fault 7: case insensitive union

        vector1.clear();
        vector2.clear();

        vector1.add(1);
        vector1.add("youssef");

        vector2.add(1);
        vector2.add("Youssef");


        resultV = Solution.union(vector1, vector2);

        Assertions.assertEquals(new Vector<>(Arrays.asList(1, "youssef", "Youssef")), resultV);

        // fault 8: consider null as non element

        vector1.clear();
        vector2.clear();

        vector1.add(null);

        vector2.add(1);
        vector2.add(3);

        resultV = Solution.union(vector1, vector2);

        Assertions.assertEquals(new Vector<>(Arrays.asList(null, 1, 3)), resultV);


        // fault 9: not handling inner vectors

        vector1.clear();
        vector2.clear();

        Vector<Integer> innerVector1 = new Vector<>(Arrays.asList(5, 6));

        vector1.add(innerVector1);

        vector2.add(7);

        resultV = Solution.union(vector1, vector2);

        Assertions.assertTrue(resultV.containsAll(Arrays.asList(innerVector1, 7)));


    }

    @Test
    void main() {
    }
}