package Labs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.labs.one.*;


class LabOneTest {

    @Test
    void intMaxTest1(){
        Solution solution = new Solution();
        Assertions.assertEquals(30,solution.intMax(10,20,30),"test1");
    }
    @Test
    void intMaxTest2_allEqual(){
        Solution solution = new Solution();
        Assertions.assertEquals(30,solution.intMax(30,30,30),"allEqual");
    }
    @Test
    void intMaxTest_aEqualsb(){
        Solution solution = new Solution();
        Assertions.assertEquals(40,solution.intMax(40,40,30),"a=b");
    }
    @Test
    void intMaxTest_bEqualsC(){
        Solution solution = new Solution();
        Assertions.assertEquals(50,solution.intMax(20,50,50),"b=c");
    }

    @Test
    void intMaxTest1_Neg(){
        Solution solution = new Solution();
        Assertions.assertEquals(10,solution.intMax(-5,10,-30),"test1_neg");
    }
    @Test
    void intMaxTest1_Neg2(){
        Solution solution = new Solution();
        Assertions.assertEquals(-5,solution.intMax(-5,-20,-30),"test2_neg");
    }
    @Test
    void intMaxTest2_allEqual_Neg(){
        Solution solution = new Solution();
        Assertions.assertEquals(-30,solution.intMax(-30,-30,-30),"allEqual_neg");
    }
    @Test
    void intMaxTest_aEqualsb_Neg(){
        Solution solution = new Solution();
        Assertions.assertEquals(-40,solution.intMax(-40,-40,-100),"a=b neg");
    }
    @Test
    void intMaxTest_bEqualsC_Neg(){
        Solution solution = new Solution();
        Assertions.assertEquals(-50,solution.intMax(-70,-50,-50),"b=c");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    void close10_Test(){
        Solution solution = new Solution();
        Assertions.assertEquals(0,solution.close10(9,9),"tie");
    }
    @Test
    void close10_Test2(){
        Solution solution = new Solution();
        Assertions.assertEquals(0,solution.close10(9,11),"tie");
    }
    @Test
    void close10_Test3(){
        Solution solution = new Solution();
        Assertions.assertEquals(9,solution.close10(9,8),"9,8->9 closer to 10");
    }
    @Test
    void close10_Test4(){
        Solution solution = new Solution();
        Assertions.assertEquals(10 ,solution.close10(10,12),"10,12 ->closer to 10");
    }

    @Test
    void close10_Test_neg(){
        Solution solution = new Solution();
        Assertions.assertEquals(0,solution.close10(-5,-5),"tie");
    }
    @Test
    void close10_Test2_neg(){
        Solution solution = new Solution();
        Assertions.assertEquals(0,solution.close10(-2,22),"tie");
    }
    @Test
    void close10_Test3_neg(){
        Solution solution = new Solution();
        Assertions.assertEquals(8,solution.close10(-9,8),"-9,8-> 8 closer to 10");
    }
    @Test
    void close10_Test4_neg(){
        Solution solution = new Solution();
        Assertions.assertEquals(12 ,solution.close10(-10,12),"-10,12 -> 12 is closer to 10");
    }


    @Test
    void main() {
    }
}