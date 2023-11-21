// JadenCase 문자열 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12951
import org.junit.Assert;
import org.junit.Test;

public class JadenCaseTest {

    @Test
    public void solution() {
        JadenCase jadenCase = new JadenCase();
        Assert.assertEquals("3people Unfollowed Me", jadenCase.solution("3people unFollowed me"));
    }
    @Test
    public void solution1() {
        JadenCase jadenCase = new JadenCase();
        Assert.assertEquals("For The Last Week", jadenCase.solution("for the last week"));
    }

    @Test
    public void solution2() {
        JadenCase jadenCase = new JadenCase();
        Assert.assertEquals("  For The What 1what  ", jadenCase.solution("  for the what 1what  "));
    }
}