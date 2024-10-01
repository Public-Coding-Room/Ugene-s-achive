package Class1;
// 백준 10869 사칙연산 문제

import java.util.Scanner;

public class FourFundamentalArithmeticOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 키보드 입력
	
		while(true) {
			int A = sc.nextInt(); // 입력 받는 A값
			int B = sc.nextInt(); // 입력 받는 B값
			
			if(!(1 <= A && A <= 10000)) { 
				if(!(1 <= B && B <= 10000)) { // 1 <= A,B <= 10000가 아닐때 다시 입력
					System.out.println("다시 입력해주세요.");
				}
			}else{ // 범위에 맞는 값이 입력되면 연산식 출력
				System.out.println(A+B);
				System.out.println(A-B);
				System.out.println(A*B);
				System.out.println(A/B);
				System.out.println(A%B);
				break;
			}
		}
	}
}
