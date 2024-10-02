class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for (int i = 0; i < num_list.length; i++) {
            // 배열의 길이 - 1 => 마지막 인덱스
            // 0부터 시작하는 i를 추가로 빼서 뒤에서부터 원소 넣기
            answer[i] = num_list[(num_list.length - 1) - i];
        }
        
        return answer;
    }
}