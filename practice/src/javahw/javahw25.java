package javahw;

import java.util.Scanner;	// Scanner import
public class javahw25 {
	public static void main(String[] args) {	// 메인메서드 선언
		Scanner sc = new Scanner(System.in);	// Scanner 입력문 선언
		System.out.println("version1 = ");	// version1 입력문구
		String version1 = sc.next();	// version1 입력
		System.out.println("version2 = ");	// version2 입력문구
		String version2 = sc.next();	// version2 입력

		tt t = new tt();	// tt 클래스 t 객체 선언
		int res = t.t_version(version1, version2);	
		// t객체로 t_version메서드에 입력받은 변수 version1,2를 대입하고, 결과값은
		//	res 변수에 대입한다.
 		System.out.println(res);	// 결과물 산출
	}
}
class tt {	// tt 클래스 선언
	
	int t_version(String version1, String version2) {	
		//t_version 메서드에 매개변수로 version1, version2를 받게된다.
		String[] arr1 = version1.split("\\.");	// arr1을 \\.을 기준으로 split
		String[] arr2 = version2.split("\\.");	// arr2을 \\.을 기준으로 split
						//  String안에서 이스케이프 문자인 \를 사용할 경우 꼭 \\로 해준다.
						//  그래야 최종적으로 \\. -> .로 인식을 한다.
		int i = 0;	// while반복문에 사용될 i변수 선언 (0으로 초기화해준다.)
		while (i < arr1.length || i < arr2.length) {
				// arr1의 길이가 i보다 크거나 arr2의 길이가 클 동안 반복문이 돌아간다.
			if (i < arr1.length && i < arr2.length) {
				// arr1의 길이가 i보다 크고, arr2또한 i보다 크면 if조건문이 성립된다.
				if (Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])) {
					return -1;	// arr1[i]의 값이 arr2[i]의 값보다 작으면 return -1
				} else if (Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])) {
					return 1;	// arr1[i]의 값이 arr2[i]의 값보다 크면 return 1
				}
			} else if (i < arr1.length) { // arr1의 길이가 i보다 클 경우
				if (Integer.parseInt(arr1[i]) != 0) {
					return 1;	// arr1[i]가 0이 아닐 경우 1을 리턴해준다.
				}
			} else if (i < arr2.length) { // arr2의 길이가 i보다 클 경우
				if (Integer.parseInt(arr2[i]) != 0) {
					return -1;	// arr2[i]가 0이 아닐 경우 -1을 리턴해준다.
				}
			}

			i++;	// i를 계속 더해준다.
		}

		return 0;	// return 0 -> 메서드 끝
	}
}
