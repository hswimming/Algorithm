function solution(array, commands) {
    var answer = [];
    
    for (let i = 0; i < commands.length; i++) {
        // commands 배열의 각 0번 인덱스 값 ~ 1번 인덱스 값까지 자른 후 정렬
        var arr = array.slice(commands[i][0] - 1, commands[i][1]).sort((a, b) => a - b);
        answer.push(arr[commands[i][2] - 1]); // 찾는 순서 - 1 => 인덱스
    }
    
    return answer;
}