function solution(n, arr1, arr2) {
    var answer = [];
    
    /*
    for (let i = 0; i < n; i++) {
        // 비트 연산자 OR => 비교하는 비트 중에서 하나라도 1이면 1반환
        // 01001 (9) | 11110 (30) => 11111 (31)
        // 비트 연산 결과값을 2진수로 toString(2) 변환하면 앞의 0이 생략됨
        var result = (arr1[i] | arr2[i]).toString(2).padStart(n, 0);
        answer.push(result.replaceAll(0, ' ').replaceAll(1, '#'));
    }
    */
    
    return answer = arr1.map((e, i) => { // 새로운 배열 반환
        var result = (e | arr2[i]).toString(2).padStart(n, 0);
        return result.replaceAll(0, ' ').replaceAll(1, '#');
    });
}