// JadenCase 문자열 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12951

public class JadenCase {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();

        boolean mode = true;
        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);

            // If white space appered mode is on.
            if(letter == ' '){
                result.append(letter);
                mode = true;
            }
            else if (mode){
                if(String.valueOf(letter).matches("[a-z]")){
                    result.append(Character.toUpperCase(letter));
                }
                // In case not alphabet
                else {
                    result.append(letter);
                }
                mode = false;
            }
            else {
                result.append(Character.toLowerCase(letter));
            }
        }

        return result.toString();
    }
}
