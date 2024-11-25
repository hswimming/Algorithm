function solution(absolutes, signs) {
    var answer = 0;
    
    for (let i = 0; i < absolutes.length; i++) {
        // true => 양 / false => 음
        absolutes[i] = signs[i] ? absolutes[i] : -absolutes[i];
        answer += absolutes[i];
    }
    
    return answer;
}