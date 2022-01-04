package me.gaegle.programmers.완주하지_못한_선수;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};
        String result = solution.solution(participant, completion);
        assertEquals(result, "leo");
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = new String[]{"josipa", "filipa", "marina", "nikola"};
        String result = solution.solution(participant, completion);
        assertEquals(result, "vinko");
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};
        String result = solution.solution(participant, completion);
        assertEquals(result, "mislav");
    }

}