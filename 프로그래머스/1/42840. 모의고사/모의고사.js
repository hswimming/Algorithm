function solution(answers) {
    var arr1 = [1, 2, 3, 4, 5];
    var arr2 = [2, 1, 2, 3, 2, 4, 2, 5];
    var arr3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    
    // 수포자가 찍는 방식과 정답 배열의 일치하는 요소만 추출한 배열의 길이
    // i가 배열의 길이를 초과하더라도 배열의 인덱스를 순환하도록 설정
    // % 연산은 나누어지는 숫자보다 작은 값은 그대로 유지됨 (1 % 5 => 5)
    var result1 = answers.filter((e, i) => e === arr1[i % arr1.length]).length;
    var result2 = answers.filter((e, i) => e === arr2[i % arr2.length]).length;
    var result3 = answers.filter((e, i) => e === arr3[i % arr3.length]).length;
    
    // 배열 길이가 제일 길면 문제를 가장 많이 맞힌 사람
    var max = Math.max(result1, result2, result3);
    var answer = [];
    
    if (max === result1) answer.push(1);
    if (max === result2) answer.push(2);
    if (max === result3) answer.push(3);
    
    return answer;
}