import org.junit.Assert;
import org.junit.Test;

public class MaxAndMinTest {
    @Test
    public void solution() {
        MaxAndMin maxAndMin = new MaxAndMin();
        Assert.assertEquals("1 4", maxAndMin.solution("1 2 3 4"));
    }
}