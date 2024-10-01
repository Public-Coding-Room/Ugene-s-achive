package Class1;
// 백준 2475번 "검증수" 문제

import java.util.Scanner;

public class VerificationNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] uniqueArr = new int[5]; 
		
		for(int i=0; i < 5; i++) {
			int uniqueNum = sc.nextInt();
			uniqueArr[i] = uniqueNum;
		}
		
		int sum = 0;
		for(int i=0; i<uniqueArr.length; i++){
			sum += Math.pow(uniqueArr[i], 2);
		}
		
		System.out.println(sum % 10);
	}

}
