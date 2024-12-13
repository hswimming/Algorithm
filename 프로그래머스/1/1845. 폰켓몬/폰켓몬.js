function solution(nums) {
    var answer = 0;
    
    // 중복 없으면 최대값 리턴
    return answer = (nums.length / 2 < [...new Set(nums)].length) ? nums.length / 2 : [...new Set(nums)].length;
}