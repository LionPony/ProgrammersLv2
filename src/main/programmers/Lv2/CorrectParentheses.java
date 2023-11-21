// 올바른 괄호
// https://school.programmers.co.kr/learn/courses/30/lessons/12909
import java.util.Stack;

public class CorrectParentheses {
    boolean solution(String s) {
        Stack<Character> left = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            if(letter == '('){
                left.push(letter);
            }
            else{
                // When you meet ')'
                if(!left.isEmpty()){
                    left.pop();
                }
                else {
                    return false;
                }
            }
        }
        return left.isEmpty();
    }
}
