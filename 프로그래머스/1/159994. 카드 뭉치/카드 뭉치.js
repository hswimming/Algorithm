function solution(cards1, cards2, goal) {
    var answer = '';
    
    for (let i = 0; i < goal.length; i++) {
        // goal 배열 단어와 일치하면 앞에서부터 제거
        if (goal[i] === cards1[0]) {
            cards1.shift();
        } else if (goal[i] === cards2[0]) {
            cards2.shift();
        } else {
            return 'No'; // 다른 단어가 먼저 등장
        }
    }
    
    return answer = 'Yes';
}