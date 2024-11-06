function solution(numbers) {
    // 정수형에서 표현 가능한 가장 작은 안전 값 -9007199254740991
    // 맨 처음 최댓값 중 음수가 있을 수 있으므로 사용
    var answer = Number.MIN_SAFE_INTEGER;
    
    for (let i = 0; i < numbers.length; i++) {
        for (let j = i + 1; j < numbers.length; j++) {
            // 다음 인덱스와 곱하기, 가장 큰 수 반환
            answer = Math.max(answer, numbers[i] * numbers[j]);
        }
    }
    
    return answer;
}