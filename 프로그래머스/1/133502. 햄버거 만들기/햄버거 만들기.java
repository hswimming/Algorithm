import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> st = new Stack<Integer>();
        
        for (int i : ingredient) {
            st.push(i);
            
            // 스택은 최근 값부터 불러오기 때문에 반대로 index 계산
            if (4 <= st.size() &&
                st.get(st.size() - 4) == 1 && // 빵
                st.get(st.size() - 3) == 2 && // 야채
                st.get(st.size() - 2) == 3 && // 고기
                st.get(st.size() - 1) == 1) { // 빵
                
                answer++;
                
                // 완성된 햄버거 재료 제거
                for (int j = 4; 0 < j; j--) {
                    st.pop(); // clear() 사용 시 이전 재료도 날려버림
                }
            }
        }
        
        return answer;
    }
}