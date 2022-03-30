package javahw;
 
import java.util.Scanner;

public class javahw21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt=0;
		
		while(true) {
			while(N%K==0) {
				N = N/K;
				cnt++;
			}
			
			if(N==1) {
				break;
			}
			
			N--;
			cnt++;
		}
		
		System.out.println(cnt);

	}

}
