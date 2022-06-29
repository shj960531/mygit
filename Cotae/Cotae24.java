import java.util.Arrays;
import java.util.Collections;

class Solution {
    public static long solution(long n) {
        String[] answer = String.valueOf(n).split("");
        // long n 을 String[] answer 로 변환.
        // String[] 로 변환 할때는 .split("") 있어야 됨.
        Arrays.sort(answer, Collections.reverseOrder()); // 배열 내림차순으로 정렬
        return Long .parseLong(String.join("", answer)); // String[] 을 long으로 변환
    }
}

public class Cotae24 {
    public static void main(String[] args) {
        long answer = Solution.solution(7981239);
        System.out.println(answer);
    }
}
