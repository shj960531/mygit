import java.util.*; // util 클래스 안에 있는 모든걸 import 한다

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> hi = new ArrayList<Integer>(); // 크기가 변하지않는 표준배열과 달리 초과하면 자동으로 늘어난다

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) hi.add(arr[i]); // arr 배열에 원소를 divisor 로 나누었을때 나머지가 0인 원소 hi에 추가
        }
        if (hi.isEmpty()) {
            hi.add(-1); // 추가된 원소가 없어서 hi가 비어있을땐 -1 추가
        }
        answer = new int[hi.size()]; // answer 를 hi 의 size 만큼 설정

        for (int i = 0; i < hi.size(); i++) {
            answer[i] = hi.get(i); // hi 에 있는 원소들을 get 으로 꺼내어 answer 에 저장
        }

        Arrays.sort(answer); // answer 를 Arrays.sort 이용하여 오름차순 정렬
        return answer;
    }
}

public class cotae14 {
    public static void main(String[] args) {
        Solution answer = new Solution();
        System.out.println(answer);
    }
}
