function solution(arr, divisor) {
    var answer = [];
    
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] % divisor === 0) {
            answer.push(arr[i]);
        }
    }
    
    // 나누어 떨어지는 element가 하나도 없다면 [-1] 리턴
    // 있을 경우 배열의 길이가 0이 아님, 오름차순 정렬
    return answer = (answer.length != 0) ? answer.sort((a, b) => a - b) : [-1];
}