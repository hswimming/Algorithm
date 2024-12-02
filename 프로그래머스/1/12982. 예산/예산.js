function solution(d, budget) {
    var answer = 0;
    var sum = 0;
    
    d.sort((a, b) => (a - b)); // 오름차순 정렬
    
    for (let i = 0; i < d.length; i++) {
        sum += d[i];
        
        if (budget < sum) {
            break; // 예산 초과
        }
        answer++; // 예산 내로 신청한 부서 카운트
    }
    
    return answer;
}