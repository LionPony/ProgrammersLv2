// 올바른 괄호
// https://school.programmers.co.kr/learn/courses/30/lessons/12909
import org.junit.Assert;
import org.junit.Test;

public class CorrectParenthesesTest {

    @Test
    public void solution() {
        CorrectParentheses correctParentheses = new CorrectParentheses();
        Assert.assertEquals(true, correctParentheses.solution("()()"));
    }
    @Test
    public void solution1() {
        CorrectParentheses correctParentheses = new CorrectParentheses();
        Assert.assertEquals(true, correctParentheses.solution("(())()"));
    }
    @Test
    public void solution2() {
        CorrectParentheses correctParentheses = new CorrectParentheses();
        Assert.assertEquals(false, correctParentheses.solution(")()("));
    }
    @Test
    public void solution3() {
        CorrectParentheses correctParentheses = new CorrectParentheses();
        Assert.assertEquals(false, correctParentheses.solution("(()("));
    }
}