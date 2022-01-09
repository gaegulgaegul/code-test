package me.gaegle.programmers.로또의_최고_순위와_최저_순위;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void test1() {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] solution = this.solution.solution(lottos, win_nums);
        assertEquals(solution[0], 3);
        assertEquals(solution[1], 5);
    }

    @Test
    void test2() {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};
        int[] solution = this.solution.solution(lottos, win_nums);
        assertEquals(solution[0], 1);
        assertEquals(solution[1], 6);
    }

    @Test
    void test3() {
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        int[] solution = this.solution.solution(lottos, win_nums);
        assertEquals(solution[0], 1);
        assertEquals(solution[1], 1);
    }
}