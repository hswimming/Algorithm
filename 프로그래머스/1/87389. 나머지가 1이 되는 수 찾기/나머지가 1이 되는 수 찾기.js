function solution(n) {
    var arr = [];
    var answer = 0;
    
    for (let i = 1; i < n; i++) {
        if (n % i === 1) {
            arr.push(i);
        }
    }
    
    // 전개 연산자로 배열을 풀어 최소값 리턴
    return answer = (Math.min(...arr));
}