package me.gaegul.anunfinishedrunner;

import java.util.Arrays;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        String answer = "";

        for (int i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                answer = participant[i];
                break;
            }
        }

        if("".equals(answer)) {
            answer = participant[participant.length - 1];
        }

        return answer;
    }
}
