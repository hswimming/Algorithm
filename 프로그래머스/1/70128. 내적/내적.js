function solution(a, b) {
    var answer = 0;
    
    /*
    for (let i = 0; i < a.length; i++) {
        answer += a[i] * b[i];
    }
    */
    
    // 누적값, a 배열 현재 요소, 인덱스, 초기값 0
    return answer = a.reduce((s, c, i) => s + c * b[i], 0);
}