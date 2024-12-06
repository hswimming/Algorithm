function solution(food) {
    var answer = '';
    
    for (let i = 1; i < food.length; i++) {
        // 음식의 종류와 양이 같아야 하므로 음식은 2개 이상
        if (1 < food[i]) {
            // 음식의 양을 절반으로 나눈 수 만큼 인덱스 반복 출력
            answer += String(i).repeat(food[i] / 2);
        }
    }
    // 가운데는 항상 물(0), 문자열 뒤집어서 결합
    return answer += 0 + answer.split('').reverse().join('');
}