// 최솟값 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12941
import org.junit.Assert;
import org.junit.Test;

public class MakingMinimumTest {

    @Test
    public void solution() {
        MakingMinimum makingMinimum = new MakingMinimum();
        Assert.assertEquals(29, makingMinimum.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
    }
    @Test
    public void solution1() {
        MakingMinimum makingMinimum = new MakingMinimum();
        Assert.assertEquals(10, makingMinimum.solution(new int[]{1, 2}, new int[]{3, 4}));
    }
}