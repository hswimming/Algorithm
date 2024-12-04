function solution(numbers) {
    var answer = [];
    
    for (let i = 0; i < numbers.length; i++) {
        for (let j = i + 1; j < numbers.length; j++) {
            answer.push(numbers[i] + numbers[j]);
        }
    }
    
    // Set 객체는 중복값 허용 X => Set 객체로 변환 후 다시 배열로 변환
    return answer = [...new Set(answer)].sort((a, b) => a - b);
}