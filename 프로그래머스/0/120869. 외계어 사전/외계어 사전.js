function solution(spell, dic) {
    // spell 정렬 후 문자열 배열 => 문자열로 변환
    var reg = spell.sort().join('');
    var answer = 0;
    
    for (let i = 0; i < dic.length; i++) {
        // dic 배열의 문자열 요소를 자르고 정렬한 후 문자열로 변환
        var str = dic[i].split('').sort().join('');
        
        // 일치하는 문자가 있으면 종료
        if (str === reg) {
            answer = 1;
            break;
        } else {
            answer = 2;
        }
    }
    
    return answer;
}