function solution(babbling) {
    var reg = ['aya', 'ye', 'woo', 'ma']; // 가능한 발음
    var answer = 0;
    
    for (let word of babbling) {
        let prev = '';
        let temp = word;
        
        // 같은 발음이 2번 연속되는지 확인
        for (let r of reg) {
            if (temp.includes(r + r)) {
                // 연속된 발음이 있으면 종료
                prev = null;
                break;
            }
        }
        
        if (prev !== null) {
            // 정규 표현식에 일치하면 빈 문자열로 치환
            let str = temp.replace(/aya|ye|woo|ma/g, '');
            
            if (str === '') answer++;
        }
    }
    
    return answer;
}