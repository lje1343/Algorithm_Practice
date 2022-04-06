package javahw;

import java.util.*;

public class javahw27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 배열크기입력
		Integer[] arr = new Integer[n];	// n크기 배열선언
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();	// 배열값 입력
		}
		
		Arrays.sort(arr, Collections.reverseOrder());	//Collections클래스의 reverseOrder함수를 이용해서 거꾸로 정렬
		System.out.println(Arrays.toString(arr));	// 결과물 산출 
	}

}
