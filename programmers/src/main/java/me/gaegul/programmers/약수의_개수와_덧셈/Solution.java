package me.gaegul.programmers.약수의_개수와_덧셈;

import java.util.stream.IntStream;

public class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int value = i;
            long count = IntStream.rangeClosed(1, i)
                    .filter(n -> (value % n) == 0)
                    .count();

            if (count % 2 == 0) {
                answer += value;
            } else {
                answer -= value;
            }
        }

        return answer;
    }
}
