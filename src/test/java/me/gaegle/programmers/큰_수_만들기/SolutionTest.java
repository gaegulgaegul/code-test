package me.gaegle.programmers.큰_수_만들기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test1() {
        String number = "1924";
        int k = 2;
        Solution solution = new Solution();
        String result = solution.solution(number, k);
        assertEquals(result, "94");
    }

    @Test
    void test2() {
        String number = "1231234";
        int k = 3;
        Solution solution = new Solution();
        String result = solution.solution(number, k);
        assertEquals(result, "3234");
    }

    @Test
    void test3() {
        String number = "4177252841";
        int k = 4;
        Solution solution = new Solution();
        String result = solution.solution(number, k);
        assertEquals(result, "775841");
    }

}