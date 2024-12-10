function solution(k, score) {
    var answer = [];
    var arr = [];
    
    for (let i = 0; i < score.length; i++) {
        arr.push(score[i]); // arr 길이 => k
        arr.sort((a, b) => b - a); // 내림차순 정렬
        
        if (k < arr.length) {
            arr.pop(); // 배열의 길이가 k를 넘으면 마지막 값 빼기
        }
        answer.push(arr[arr.length - 1]); // 내림차순 정렬로 마지막 값 => 최하위 점수
    }
    
    return answer;
}