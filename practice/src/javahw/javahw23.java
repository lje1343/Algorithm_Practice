package javahw;

import java.util.Scanner;

public class javahw23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이트의 위치를 설정해주세요 : ");
		String knight = sc.next();
		int c = knight.charAt(0) - 'a';
		int r = knight.charAt(1) - '1';
//		입력받은 문자열에서 각각 열('c'olumn)과 행('r'ow)을 분리하여 정수 형태로 바꿔준다.
//	    ex.> a1 -> a:0 1:0
		
		int[][] m_arr = {
				{c-2,r-1}, {c-2,r+1}, {c+2, r-1}, {c+2, r+1}, 
				{c-1, r-2}, {c-1, r+2}, {c+1, r-2}, {c+1, r+2}
				};	//나이트가 L자 형태로 이동할 수 있는 모든 8가지 경우의 수를 담아준다.
		       		// ex.> (c-2, r-1)
		        	// c-2 : 왼쪽으로 두번 이동후, r-1 : 아래로 한칸 이동 (L자 모양)
		
		int cnt = 0; // 결과값 변수
		
		for(int i=0; i<m_arr.length; i++) {	// 체스판의 경계를 벗어나지 않으면 cnt+1 해준다.
			if(m_arr[i][0]>=0 && m_arr[i][0]<=7) {
				if(m_arr[i][1]>=0 && m_arr[i][1]<=7) {
					cnt++;
				}
			}
		}
		
		System.out.println("나이트가 이동할 수 있는 경우의 수는 " + cnt + "가지 입니다.");
		// 결과물 산출
		

	}

}
