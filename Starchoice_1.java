package Class1;
// 백준 2438번 별 찍기-1 문제

import java.util.Scanner;
public class Starchoice_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 출력 라인 수
		StringBuffer star = new StringBuffer(); //별을 담을 객체 생성
		
		for(int i = 0; i < N; i++) {
			star.append("*"); // 문자열로 별 하나씩 추가
			System.out.println(star);
		}
		
		sc.close();
		
	}

}
