package Greedy_algorithm;
// 백준 2720번 문제 세탁소 사장 동혁
// 가장 비효율적인 코드

import java.util.Scanner;
public class ChargeProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수 
							  // 124, 25, 194 3개의 테스트 케이스
		
		// 거슬러 줄 동전 종류의 금액 단위
		int[] coins = {25, 10, 5, 1};
		
		// 테스트 케이스 수만큼 반복, 각 케이스별 최소 갯수의 거스름돈을 출력
		for(int i=0; i < T; i++) {
			int C = sc.nextInt(); //  거스름돈 입력
			
			int q = C / coins[0]; // 쿼터의 갯수 저장
			C %= coins[0];	// 쿼터 동전으로 거슬러주고 남은 금액	
			
			int d = C / coins[1]; // 다임의 갯수 저장
			C %= coins[1];  // 다임 동전으로 거슬러주고 남은 금액
			
			int n = C / coins[2]; // 니켈의 갯수 저장
			C %= coins[2];  // 니켈 동전으로 거슬러주고 남은 금액
			
			int p = C / coins[3]; // 페니의 갯수 저장
			
			// 거슬러 준 동전의 최소 갯수 결과값
			System.out.printf("%d %d %d %d ",q,d,n,p);
		}
		
		sc.close();
	}
}
