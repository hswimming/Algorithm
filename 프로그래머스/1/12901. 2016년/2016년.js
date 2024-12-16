function solution(a, b) {
    var week = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT'];
    var month = (10 <= a) ? a : '0' + a;
    var day = (10 <= b) ? b : '0' + b;
    var findDay = 2016 + '-' + month + '-' + day; // YYYY-MM-DD
    var result = new Date(findDay).getDay(); // 매개변수로 들어오는 날짜의 요일 반환
    var answer = '';
    
    return answer = week[result];
}