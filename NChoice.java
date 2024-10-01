package Class1;
// 백준 2741번 N찍기문제

import java.util.Scanner;

public class NChoice {

	public static void main(String[] args) {
		while(true) {
			Scanner scan = new Scanner(System.in);
			int N = scan.nextInt();
			if(N < 1 || N > 100000) {
				System.out.println("다시 입력해주세요");
			}else {
				for(int i=1; i <= N; i++) {
					System.out.println(i);
				}
				break;
			}
		}
	}
}
