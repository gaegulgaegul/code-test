package me.gaegul.programmers.폰켓몬;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] nums) {
        return (int) Arrays.stream(nums)
                .distinct()
                .count();
    }
}
