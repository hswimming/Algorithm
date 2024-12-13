function solution(nums) {
    var answer = 0;
    
    // 중복 없으면 최대값 리턴 (Set 객체는 중복값 허용 X => Set 객체로 변환 후 객체에 들어있는 데이터 수 리턴)
    return answer = (nums.length / 2 < new Set(nums).size) ? nums.length / 2 : new Set(nums).size;
}