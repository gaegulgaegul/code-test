package me.gaegul.programmers.폰켓몬;

import java.util.Arrays;

public class Solution {
    public int solution(int[] nums) {

        int distinctCount = (int) Arrays.stream(nums)
                .distinct()
                .count();

        return distinctCount < (nums.length/2) ? distinctCount : (nums.length/2);
    }
}
