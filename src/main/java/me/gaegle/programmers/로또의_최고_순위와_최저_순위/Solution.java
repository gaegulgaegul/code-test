package me.gaegle.programmers.로또의_최고_순위와_최저_순위;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> matchNumbers = new ArrayList<>();
        int unknown = 0;

        for (int i = 0; i < lottos.length; i++) {
            int lotto = lottos[i];
            // 알 수 없는 로또 번호
            if (lotto == 0) {
                unknown++;
            }
            // 결과값과 매칭된 수
            if (Arrays.stream(win_nums).anyMatch(num -> num == lotto)) {
                matchNumbers.add(lotto);
            }
        }

        int min = matchNumbers.size();
        int max = min + unknown;
        int[] answer = {getRank(max), getRank(min)};
        return answer;
    }

    private int getRank(int num) {
        switch (num) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}
