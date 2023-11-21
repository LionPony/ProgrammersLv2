// 숫자의 표현
// https://school.programmers.co.kr/learn/courses/30/lessons/12924
import org.junit.Assert;
import org.junit.Test;

public class ExpressNumberTest {

    @Test
    public void solution() {
        ExpressNumber expressNumber = new ExpressNumber();
        Assert.assertEquals(4, expressNumber.solution(15));
    }
}