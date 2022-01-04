package me.gaegle.programmers.약수의_개수와_덧셈;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        int left = 13;
        int right = 17;
        int result = new Solution().solution(left, right);

        assertEquals(result, 43);
    }

    @Test
    void test2() {
        int left = 24;
        int right = 27;
        int result = new Solution().solution(left, right);

        assertEquals(result, 52);
    }

}