package me.gaegul.programmers.폰켓몬;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();
        int[] nums = new int[]{3,1,2,3};
        int result = solution.solution(nums);
        assertEquals(result, 2);
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        int[] nums = new int[]{3,3,3,2,2,4};
        int result = solution.solution(nums);
        assertEquals(result, 3);
    }


    @Test
    void test3() {
        Solution solution = new Solution();
        int[] nums = new int[]{3,3,3,2,2,2};
        int result = solution.solution(nums);
        assertEquals(result, 2);
    }


}