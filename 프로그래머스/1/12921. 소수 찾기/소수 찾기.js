function solution(n) {
    /*
    에라토스테네스의 체 => 1을 제외하고 2부터 N까지 자신을 제외하고
    순차적으로 자신의 배수들을 지워가면 결국에는 소수들만 남는다는 원리
    */
    
    // 0부터 n까지 true로 초기화한 배열
    var arr = Array(n + 1).fill(true);
    var answer = 0;
    
    // 0, 1 소수 X
    arr[0] = false;
    arr[1] = false;
    
    // 약수의 대칭성에 의해 제곱근까지만 소수 확인
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (arr[i]) { // true = 소수
            // 배수만큼(i) 더하면 다음 배수 (ex. 9, 12, 15, ...)
            for (let j = i * i; j <= n; j += i) {
                arr[j] = false; // 배수 제거
            }
        }
    }
    
    // Boolean 함수는 false 제거 => true 개수 리턴
    return answer = arr.filter(Boolean).length;
}