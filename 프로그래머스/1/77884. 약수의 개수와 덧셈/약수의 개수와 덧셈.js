function solution(left, right) {
    var answer = 0;
    
    for (let i = left; i <= right; i++) {
        var count = 0; // 약수 개수, left가 증가하면 초기화
        
        for (let j = 1; j <= i; j++) {
            if (i % j === 0) count++;
        }
        
        // 약수 개수가 짝수면 더하기, 홀수면 빼기
        answer += (count % 2 === 0) ? i : -i;
    }
    
    return answer;
}