package me.gaegle.programmers.짝지어_제거하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String s = "baabaa";
        int result = solution.solution(s);
        assertEquals(result, 1);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String s = "cdcd";
        int result = solution.solution(s);
        assertEquals(result, 0);
    }

}