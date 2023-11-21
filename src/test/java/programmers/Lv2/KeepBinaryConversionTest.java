// 이진 변환 반복하기
// https://school.programmers.co.kr/learn/courses/30/lessons/70129
import org.junit.Assert;
import org.junit.Test;

public class KeepBinaryConversionTest {

    @Test
    public void solution() {
        KeepBinaryConversion keepBinaryConversion = new KeepBinaryConversion();
        Assert.assertArrayEquals(new int[]{3, 8}, keepBinaryConversion.solution("110010101001"));
    }
    @Test
    public void solution1() {
        KeepBinaryConversion keepBinaryConversion = new KeepBinaryConversion();
        Assert.assertArrayEquals(new int[]{3, 3}, keepBinaryConversion.solution("01110"));
    }
    @Test
    public void solution2() {
        KeepBinaryConversion keepBinaryConversion = new KeepBinaryConversion();
        Assert.assertArrayEquals(new int[]{4, 1}, keepBinaryConversion.solution("1111111"));
    }
}