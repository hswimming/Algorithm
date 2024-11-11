function solution(sides) {
    var answer = 0;
    var max = 0; // 가장 긴 변
    var num = 0; // 가장 긴 변의 될 수 있는 나머지 한 변의 개수
    var count = 0; // 나머지 한 변이 가장 긴 변인 경우 될 수 있는 한 변
    
    // sides의 길이는 2
    // sides의 요소 중 큰 요소 = max, 나머지 요소 = num
    for (let i = 0; i < sides.length; i++) {
        if (sides[0] < sides[1]) {
            max = sides[1];
            num = sides[0];
        } else {
            max = sides[0];
            num = sides[1];
        }
        
        // 나머지 한 변이 2일 경우 1 리턴
        answer = num <= 1 ? 1 : sides[0] + sides[1];
    }
    
    // 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 함
    if (answer != 1) {
        for (let i = max + 1; i < (max + num); i++) {
            count++;
            answer = num + count;
        }
    }
    
    return answer;
}