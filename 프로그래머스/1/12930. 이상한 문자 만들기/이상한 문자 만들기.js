function solution(s) {
    // 각 단어는 하나 이상의 공백문자로 구분
    var arr = s.split(' ');
    var answer = '';
    
    for (let i = 0; i < arr.length; i++) {
        var str = arr[i].split(''); // 단어 쪼개기
        
        for (let j = 0; j < str.length; j++) {
            str[j] = (j % 2 === 0) ? str[j].toUpperCase() : str[j].toLowerCase();
        }
        arr[i] = str.join(''); // 쪼갠 단어 합치기
    }
    
    return answer = arr.join(' '); // 배열 => 문자열
}