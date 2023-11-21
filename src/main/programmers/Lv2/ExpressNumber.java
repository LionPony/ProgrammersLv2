// 숫자의 표현
// https://school.programmers.co.kr/learn/courses/30/lessons/12924
public class ExpressNumber {
    public int solution(int n) {
        // Find the most sequence length.
        int goal = goal(n);

        int count = 0;
        for(int i = 1; i <= goal; i++){
            // If i numbers can make n count
            if(canMakeInteger(n, i)){
                count++;
            }
        }
        return count;
    }
    public boolean canMakeInteger(double n, double depth){
        double result = (2*n+depth-Math.pow(depth, 2)) / (2*depth);
        // If int sequence can make n
        return result == (int) result;
    }
    public int goal(int n){
        int count = 1;

        while(count*(count+1)/2 < n){
            count++;
        }

        return count;
    }
}
