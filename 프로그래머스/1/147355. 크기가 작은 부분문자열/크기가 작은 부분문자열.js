function solution(t, p) {
    var answer = 0;
    var arr = [];
    
    for(let i = 0; i < t.length; i++) {
        // i가 증가하므로 문자열을 자르는 end 값도 i만큼 증가
        var str = t.slice(i, i + p.length);
        
        // 문자열 끝으로 갈수록 부분문자열 길이가 짧아지므로 조건 추가
        if (str.length === p.length) arr.push(str);
    }
    
    for (let i = 0; i < arr.length; i++) {
        // 0으로 시작하고 뒤에 숫자가 하나 이상 있는 문자열 정규 표현식
        // ex) 02, 03 해당 => 0으로 시작하는 부분을 공백으로 치환 => 2, 3
        arr[i] = (/^0\d+/.test(arr[i])) ? arr[i].replace(/^0/, '') : arr[i];
        answer += (Number(arr[i]) <= Number(p)) ? 1 : 0;
    }
    
    return answer;
}