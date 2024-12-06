function solution(s) {
    var answer = 0;
    var number = [['0', 'zero'], ['1', 'one'], ['2', 'two'], ['3', 'three'], ['4', 'four'], 
                  ['5', 'five'], ['6', 'six'], ['7', 'seven'], ['8', 'eight'], ['9', 'nine']];
    
    for (let i = 0; i < number.length; i++) {
        // 값과 동일한 문자열 => 키 문자열로 변경
        if (s.includes(number[i][1])) {
            s = s.replaceAll(number[i][1], number[i][0]); // replaceAll => 문자열 모두 검색
        }
    }
    
    return answer = parseInt(s); // 문자열 => 정수
}