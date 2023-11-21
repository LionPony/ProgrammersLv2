// 최댓값과 최솟값
// https://school.programmers.co.kr/learn/courses/30/lessons/12939?language=java

import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class MaxAndMin {
    public String solution(String s) {
        // Preprocess.
        HashSet<Integer> findMaxAndMin = new HashSet<>();
        StringTokenizer line = new StringTokenizer(s);
        while (line.hasMoreTokens()){
            findMaxAndMin.add(Integer.parseInt(line.nextToken()));
        }

        // Find out max and min.
        int max = findMaxAndMin.isEmpty() ? -1 : Collections.max(findMaxAndMin);
        int min = findMaxAndMin.isEmpty() ? -1 : Collections.min(findMaxAndMin);

        // Make form.
        StringBuilder result = new StringBuilder();
        result.append(min);
        result.append(" ");
        result.append(max);

        return result.toString();
    }
}