package LeetCode75._7_238_ProductofArrayExceptSelf;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Solution solution;

    @BeforeAll
    public static void setup(){
        solution=new Solution();
    }

    @Test
    public void testProductExpectSelf_whenValidRequest_ThenPass(){
        int [] list1 = {1,2,3,4};
        int [] list2 = {24,12,8,6};


        assertArrayEquals(list2,solution.productExceptSelf(list1));
    }





}