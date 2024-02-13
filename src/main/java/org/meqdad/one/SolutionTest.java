package org.meqdad.one;

import org.junit.jupiter.api.Assertions;



class SolutionTest {

    @org.junit.jupiter.api.Test
    void arrayCount9() {

        Solution solution = new Solution();
        int[] arr;
        int result;

        // fault 1 : the array is empty

        arr = new int[]{};

        result = solution.arrayCount9(arr);

        Assertions.assertEquals(0 , result);


        // fault 1 : the array is empty

        arr = new int[]{1,2,3};

        result = solution.arrayCount9(arr);

        Assertions.assertEquals(0 , result);




    }

    @org.junit.jupiter.api.Test
    void close10() {
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