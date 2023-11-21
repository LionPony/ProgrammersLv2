// 최댓값과 최솟값
// https://school.programmers.co.kr/learn/courses/30/lessons/12939?language=java
import org.junit.Assert;
import org.junit.Test;

public class MaxAndMinTest {
    @Test
    public void solution() {
        MaxAndMin maxAndMin = new MaxAndMin();
        Assert.assertEquals("1 4", maxAndMin.solution("1 2 3 4"));
    }
    @Test
    public void solution1() {
        MaxAndMin maxAndMin = new MaxAndMin();
        Assert.assertEquals("-4 -1", maxAndMin.solution("-1 -2 -3 -4"));
    }
    @Test
    public void solution2() {
        MaxAndMin maxAndMin = new MaxAndMin();
        Assert.assertEquals("-1 -1", maxAndMin.solution("-1 -1"));
    }
}