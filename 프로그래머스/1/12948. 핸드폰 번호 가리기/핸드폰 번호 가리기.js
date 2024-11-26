function solution(phone_number) {
    var answer = '';
    
    // 전화번호 시작 ~ 뒤 4자리 전 문자열 치환 + 끝에서 뒤 4자리 전까지 자른 문자열
    return answer = '*'.repeat(phone_number.length - 4) + phone_number.substring(phone_number.length, phone_number.length - 4);
}