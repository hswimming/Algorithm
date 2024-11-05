function solution(strlist) {
    var answer = [strlist.length];
    
    // answer 배열 요소 => strlist 배열의 i번째 문자열 길이
    for (let i = 0; i < strlist.length; i++) {
        answer[i] = strlist[i].length;
    }
    
    return answer;
}