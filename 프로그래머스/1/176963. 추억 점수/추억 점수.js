function solution(name, yearning, photo) {
    var answer = [];
    var result = {}; // 이름(키), 그리움 점수(값) 객체
    
    // 이름에 해당하는 점수 매핑 => {may: 5, kein: 10, kain: 1, radi: 3}
    for (let i = 0; i < name.length; i++) {
        result[name[i]] = yearning[i];
    }
    
    /*
    // 풀이(1)
    for (let i = 0; i < photo.length; i++) {
        var score = 0; // 사진 별 그리움 점수 합
        
        for (let j = 0; j < photo[i].length; j++) {
            if (result[photo[i][j]]) {
                score += result[photo[i][j]];
            }
        }
        answer.push(score);
    }
    */
    
    // 풀이(2) 예외 처리 하지 않으면 null 발생
    return answer = photo.map((arr) => 
                        arr.reduce((acc, cur) => acc + (result[cur] || 0), 0)
                    );
}