function solution(num) {
    var answer = 0;
    var count = 0; // 작업 반복 횟수
    
    while (num != 1) {
        if (count === 500) { // 작업을 500번 반복하면 -1 리턴
            count = -1;
            break;
        }
        
        if (num % 2 === 0) {
            num /= 2;
        } else {
            num = (num * 3) + 1;
        }
        count++;
    }
    
    return answer = count;
}