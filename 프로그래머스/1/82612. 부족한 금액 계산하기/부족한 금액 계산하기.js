function solution(price, money, count) {
    var answer = 0;
    
    for (let i = 1; i <= count; i++) {
        answer += price * i; // 놀이기구 n번 이용 => 이용료의 n배
    }
    
    return answer = (answer < money) ? 0 : answer - money;
}