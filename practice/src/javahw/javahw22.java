package javahw;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class javahw22 {

	public static void main(String[] args) throws IOException{
		//Scanner 대신 사용 -> 속도가 훨씬 더 빠르다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int res_x = 1;  // 결과값 x변수
		int res_y = 1;	// 결과값 y변수 
		
		System.out.print("정수를 입력해주세요.(1<=n<=100) : ");
		int n = Integer.parseInt(br.readLine());  // 정사각형 크기 설정 (readLine()은 문자열 형태로 입력되기 때문에 형변환 필요)
		
		System.out.print("계획서를 입력해주세요.(L/R/U/D) : ");
		String[] plans = br.readLine().split(" "); // 이동 계획서 설정
		
		for(int i = 0; i < plans.length; i++) {	// 이동 계획서만큼 반복문 실행
			
			if(plans[i].equals("L")) {
				if(res_y > 1) res_y--; // 공간의 벗어남이 없으면 한칸 왼쪽으로 이동
			} else if (plans[i].equals("R")) {
				if(res_y < n) res_y++; // 공간의 벗어남이 없으면 한칸 오른쪽으로 이동
			} else if (plans[i].equals("U")) {
				if(res_x > 1) res_x--; // 공간의 벗어남이 없으면 한칸 위쪽으로 이동
			} else if (plans[i].equals("D")) {
				if(res_x < n) res_x++; // 공간의 벗어남이 없으면 한칸 아래쪽으로 이동
			} else {
				System.out.println("입력형식이 잘 못 되었습니다."); break;	// 입력 형식을 벗어난 경우 종료
			}
		}
		
		System.out.println("최종 도착 지점의 좌표는 " + res_x + ", " + res_y + "입니다.");
		// 결과물 산출
	}

}
