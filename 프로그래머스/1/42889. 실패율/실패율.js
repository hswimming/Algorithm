function solution(N, stages) {
    var answer = [];
    var person = stages.length; // 스테이지에 도전한 사람의 수
    
    for (let i = 1; i <= N; i++) {
        // 실패한 사람의 수
        var fail = stages.filter(e => e === i).length;
        
        // 스테이지 번호(키), 실패율(값)
        answer.push([i, fail / person]);
        
        // 실패한 사람을 제외한 다음 스테이지 사람의 수
        person -= fail;
    }
    
    // 실패율 내림차순 정렬 후 스테이지 리턴
    // answer 배열 요소는 스테이지 번호(0), 실패율(1)
    return answer.sort((a, b) => b[1] - a[1]).map(e => e[0]);
}