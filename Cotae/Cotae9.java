class Solution {
    public String solution(String phone_number) {
        String answer = "answer";

        for (int i = 0; i < phone_number.length()-4; i++) { // 전화번호 뒷자리 4개를 제외한 숫자는 *로 표현
            answer += "*";
        }
        for (int i = phone_number.length()-4; i < phone_number.length(); i++) { // 전화번호 뒷자리 4개는 숫자로 표현
            answer += phone_number.charAt(i);
        }

        return answer;// 마지막 결과를 반환
    }
}

public class Cotae9 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String answer = solution.solution("answer");
        System.out.println(answer);
    }
}
