function solution(score) {
    // 구조 분해 할당 후 평균 계산 (2차원 => 1차원)
    var avg = score.map(([a, b]) => (a + b) / 2);
    var answer = [];
    
    // 평균 점수를 기준으로 등수 리턴
    // 평균 점수 배열(avg)의 각 요소(el)에 대해 순위를 계산 후
    // 현재 점수(el)보다 높은 점수(cur)의 개수 세기, 기본 등수는 1로 시작
    return answer = avg.map(el => 
                            avg.reduce((acc, cur) => 
                                       acc + (el < cur ? 1 : 0), 1));
}