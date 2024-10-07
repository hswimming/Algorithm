import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 입력받을 수의 개수
		int[] arr = new int[n]; // 처음 입력한 수 길이의 배열
		int temp;
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) { // 자신과 비교할 필요가 없으므로 + 1
				if (arr[i] > arr[j]) { // > : 오름차순, < : 내림차순
					temp = arr[i]; // 값 변경을 위해 임시 저장
					arr[i] = arr[j]; // j를 i로 변경
					arr[j] = temp; // i를 j로 변경
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]); // 정렬 후 출력
		}
	}
}