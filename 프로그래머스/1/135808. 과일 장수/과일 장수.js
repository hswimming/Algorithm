function solution(k, m, score) {
    var answer = 0;
    
    // 내림차순 정렬 후 앞에서부터 사과 상자를 만들면 최대 이익 순
    score.sort((a, b) => b - a);
    
    /*
    마지막 값이 최저 사과 점수, 한 상자에 담을 수 있는 사과 개수로 끊어서 계산
    [3, 3, 2, 2, 1, 1, 1]
        => 최저 사과 점수 score[3]
    [4, 4, 4, 4, 4, 4, 2, 2, 2, 2, 1, 1]
        => 최저 사과 점수 score[2], score[5], score[8], score[11]
    */
    
    // 배열 길이 / m (한 상자에 들어가는 사과의 수) => 사과 상자의 총 개수
    for (let i = 1; i <= Math.floor(score.length / m); i++) {
        answer += score[(i * m) - 1] * m; // 최저 사과 점수 * m
    }
    
    return answer;
}