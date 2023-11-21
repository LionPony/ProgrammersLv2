// 최솟값 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12941
import java.util.Arrays;
import java.util.Collections;

public class MakingMinimum {
    public int solution(int[] A, int[] B) {
        // Sort Ascending
        Arrays.sort(A);

        // To use Arrays.sort(), Make array of wrapper class.
        Integer[] BInteger = new Integer[B.length];
        for(int i = 0; i < B.length; i++){
            BInteger[i] = B[i];
        }

        // Sort Descending
        Arrays.sort(BInteger, Collections.reverseOrder());

        int result = 0;
        for(int i = 0; i < A.length; i++){
            result += A[i] * BInteger[i];
        }
        return result;
    }
}
