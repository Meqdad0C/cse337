package org.meqdad.one;

import org.junit.jupiter.api.Assertions;



class SolutionTest {

    @org.junit.jupiter.api.Test
    void arrayCount9() {

        Solution solution = new Solution();
        int[] arr;
        int result;

        // fault 1 : not handling empty array

        arr = new int[]{};

        result = solution.arrayCount9(arr);

        Assertions.assertEquals(0 , result);


        // fault 2 : start counting from the second element

        arr = new int[]{9,2,3,23,3};

        result = solution.arrayCount9(arr);

        Assertions.assertEquals(1 , result);


        // fault 3 : stop iterating before the last element

        arr = new int[]{9,2,3,23,9};

        result = solution.arrayCount9(arr);

        Assertions.assertEquals(2 , result);


        // fault 4 : counter is in wrong position

        arr = new int[]{2,2,3,23,1,2,3,4,5};

        result = solution.arrayCount9(arr);

        Assertions.assertEquals(0 , result);


        // fault 5 : returning after first 9 only

        arr = new int[]{1,2,9,9,12};

        result = solution.arrayCount9(arr);

        Assertions.assertEquals(2 , result);


        // fault 6 : returning the number of count - 1

        arr = new int[]{1,2,9,9,9,9,9,12};

        result = solution.arrayCount9(arr);

        Assertions.assertEquals(5 , result);


        // fault 7 : not detecting the last 9

        arr = new int[]{9,9,9,9,9,9,9};

        result = solution.arrayCount9(arr);

        Assertions.assertEquals(7 , result);


        // fault 8 : increment counter for negative numbers

        arr = new int[]{-9,-9,-9,9,9,-9,-9};

        result = solution.arrayCount9(arr);

        Assertions.assertEquals(2 , result);



    }

    @org.junit.jupiter.api.Test
    void close10() {

        int x, y, result;

        Solution solution = new Solution();

        // fault 1: not including 10 in comparison

        x = 10; y = 3;

        result = solution.close10(x,y);

        Assertions.assertEquals(10, result);


        // fault 2: not including negative numbers considering -9 nearest than 0

        x = -9; y = 0;

        result = solution.close10(x,y);

        Assertions.assertEquals(0, result);


        // fault 3:
//
//        x = -9; y = 0;
//
//        result = solution.close10(x,y);
//
//        Assertions.assertEquals(0, result);

    }

    @org.junit.jupiter.api.Test
    void hasTeen() {
    }

    @org.junit.jupiter.api.Test
    void intMax() {
    }

    @org.junit.jupiter.api.Test
    void union() {
    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}