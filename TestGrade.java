package Class1;
// 백준 9498번 시험성적 문제

import java.io.*;

public class TestGrade {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 키보드 입력
	
		
		while(true) {
			int score = Integer.parseInt(br.readLine()); // 점수 저장
			
			
			if(0 <= score && score <= 100) { // 점수로 입력 가능 범위: 0~100
				if(90 <= score) { // 100~90점
					System.out.println('A');
				}else if(80 <= score) { // 89~80점
					System.out.println('B');
				}else if(70 <= score) { // 79~70점
					System.out.println('C');
				}else if(60 <= score) { // 69~60점
					System.out.println('D');
				}else { // 59점 이하
					System.out.println('F');
				}
				break;
			}else { // 0~100 범위 이외의 점수 입력 시 다시 입력
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}
