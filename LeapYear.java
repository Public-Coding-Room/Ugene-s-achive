package Class1;
// 백준 2735번 윤년 문제

import java.io.*;

public class LeapYear {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 키보드 입력 받는 곳
		
		while(true) {
			int year = Integer.parseInt(br.readLine()); // 변수 선언과 입력된 연도값 저장
			if(year >= 1 && year <= 4000) { // 연도가 1보다 크거나 같고, 4000보다 작거나 같은 자연수일때
				
				if(((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 ==0)) { // 윤년에 맞는 조건일 때 '1' 출력
					System.out.println('1');
				}else { // 윤년에 맞지 않는 조건이라면 '0' 출력
					System.out.println('0');
				}
				break; // 반복문 탈출
			}else { // 입력되어야 할 값의 범위가 맞지 않다면 다시 입력
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}
