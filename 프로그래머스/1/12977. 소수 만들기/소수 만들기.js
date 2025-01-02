function solution(nums) {
    var answer = 0;
    
    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            for (let k = j + 1; k < nums.length; k++) {
                var sum = nums[i] + nums[j] + nums[k];
                var check = true;
                
                // 제곱근까지만 배수 제거
                for (let p = 2; p <= Math.sqrt(sum); p++) {
                    if (sum % p === 0) {
                        check = false;
                        break;
                    }
                }
                // 위 조건을 만족하지 않으면 계속 true
                if (check) answer++;
            }
        }
    }
    
    return answer;
}