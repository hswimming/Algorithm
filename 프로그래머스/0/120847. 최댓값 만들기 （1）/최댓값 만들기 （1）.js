function solution(numbers) {
    var answer = 0;
    var num = 0;
    
    for (let i = 0; i < numbers.length; i++) {
        for (let j = i + 1; j < numbers.length; j++) {
            // 다음 인덱스와 곱하기
            num = numbers[i] * numbers[j];
            
            if (answer <= num) { // 현재 최댓값보다 크면 변경
                answer = num;
            }
        }
    }
    
    return answer;
}