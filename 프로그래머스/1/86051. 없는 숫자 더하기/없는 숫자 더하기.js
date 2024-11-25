function solution(numbers) {
    var num = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
    var arr = num.filter(i => !numbers.includes(i)); // num, numbers 차집합 배열
    var answer = -1;
    
    // 배열을 사용할 때는 initialValue(초기값) 생략 가능
    // 배열에서는 initialValue가 없으면 첫 번째 배열 요소를 자동으로 초기값으로 사용
    return answer = arr.reduce((a, b) => (a + b));
}