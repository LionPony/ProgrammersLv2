// 이진 변환 반복하기
// https://school.programmers.co.kr/learn/courses/30/lessons/70129
public class KeepBinaryConversion {
    public int[] solution(String s) {
        int zeroCount = 0;
        int ackCount = 0;

        while (!s.equals("1")){
            ackCount++;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0'){
                    zeroCount++;
                }
            }

            s = s.replaceAll("0", "");
            s = Integer.toBinaryString(s.length());
        }
        int[] answer = {ackCount, zeroCount};
        return answer;
    }
}
