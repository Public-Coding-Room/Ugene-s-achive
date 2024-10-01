package Array_List;
// 백준 11720번 숫자의 합
import java.util.Scanner;

public class Array_NumberSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 데이터의 갯수 N을 입력 받는 곳
		int N = scan.nextInt();
		// 연속된 숫자로 된 문자열을 String 객체의 변수 sNum 입력받아 저장하는 곳 
		String sNum = scan.next();
		// 문자열을 문자 배열로 형변환 후 변수 cNum에 저장
		char[] cNum = sNum.toCharArray();
		
		int sum = 0; // 누적합계하는 변수 sum 초기화
		for(int i = 0; i< cNum.length; i++) {
			sum += cNum[i] - 48; // sum = sum + (cNum[i] - 48). 인덱스로 값을 찾아 아스키코드로 정수형 변환 후 누적합계
		}
		
		// 결과값 sum 출력
		System.out.println(sum);
	}

}
