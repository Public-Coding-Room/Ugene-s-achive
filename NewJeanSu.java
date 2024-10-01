package Brute_force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.io.IOException;

public class NewJeanSu {

	public static void main(String[] args) throws IOException{ // IO객체 예외처리 작업 필요
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 키보드 입력, 입력된 데이터가 버퍼를 거쳐 전달
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 할당된 버퍼에 값을 저장
	      
	      while(true) {
	    	  int n = Integer.parseInt(br.readLine()); //  정수형 타입으로 입력값을 저장하는 변수 선언
	    	  
	    	  if(n <= 2147483647 && n > 0) { // 범위에 해당하는 값만 입력값으로 받는 조건주기
	    		  String N = Integer.toString(n); // 정수타입으로 받은 값을 문자열로 형변환하여 저장하는 변수 선언.
	    		  
		    	  char[] arrStr = N.toCharArray();// String 객체 타입을 char 문자형 배열로 저장하는 배열 선언.
		    	  
		    	  int[] arrInt = new int[arrStr.length]; // 위의 선언한 char 배열과 같은 배열크기를 가진 정수형 배열 선언.
			      
		    	  // arrStr 배열에 저장된 배열의 주소값을 arrInt 배열의 값으로 저장. 
			      for(int i = 0; i < arrStr.length; i++) {
			         arrInt[i] = arrStr[i] - '0'; 
			      }
			        
			      int[] num1 = new int[arrInt.length]; // 원래 순서대로 비교할 값을 저장한 배열인 num1.
			      									   //arrInt배열의 크기와 같은 크기로 지정해야 인덱스가 맞음. 

			      for(int i = 0; i < arrInt.length; i++) {
			    	  if(i == 0) { 				// 인덱스가 0일때는
			    		  num1[i] = arrInt[i]; 	// arrInt[0]의 값을 num1[0]에 저장함.
			    	  }else {							   // 예) 인덱스가 1~3일때는
			    		  num1[i] = num1[i-1] * arrInt[i]; // 예) num[2]에 num[1] * arrInt[2] 값을 대입. 
			    	  }
			      }
			         
			      int[] num2 = new int[arrInt.length];  // 역순으로 비교할 값을 저장한 배열인 num2.
					   									// 똑같이 arrInt배열의 크기와 같은 크기로 지정해야 인덱스가 맞음. 
			      
				  for(int j = arrInt.length - 1; 0 <=  j ; j--){ // arrInt.length - 1 이렇게 초기값을 주어야 원래순서의 배열()에서 
					  											 // 마지막 인덱스의 값을 처음 인덱스로 저장하는 형태인 배열 num2를 생성할 수 있음.
					  if(j == arrInt.length - 1) {				 // 배열 arrInt 마지막 인덱스의 값이 시작 인덱스 값과 같을 때, 
						  num2[j] = arrInt[arrInt.length - 1];	 // 배열 arrInt 마지막 인덱스의 값을 시작 인덱스 값에 대입
					  }else {									 // 예) 이후 배열의 인덱스를 3~1로 감소시킬때, 
						  num2[j] = num2[j + 1] * arrInt[j];	 // 예) num2[2] = num2[3] * arrInt[2] 값을 대입.
					  }      
				  }
				  
			      String result = "NO"; // 결과값에 유진수가 아닐때 초기값 NO가 출력됨.
				  for(int e = 0; e < arrInt.length - 1; e++) {
					  if(num1[e] == num2[e+1]) { // num1 배열의 마지막 값과 num2 배열의 처음 값은 모든 수를 더한 수이기에 유진수로서 비교할 가치가 없음.
						  result = "YES"; // 비교 후 두 배열의 값, 즉 유진수가 존재한다면 결과값 변수에 YES를 다시 저장(이전의 객체(NO)는 삭제되고 새로운 객체로 선언됨)
						  break; // 유진수가 존재하므로 for문 탈출.
					  }
				  }
				  
			      bw.write(result); // 버퍼에 담긴 값(result 저장값) 출력
				  break; // 입력값의 범위를 주기 위한 while문 탈출
	    	  }else {
	    		  System.out.println("다시 입력해주세요"); // 처음 입력값의 범위가 "2,147,483,647보다 작거나 같은 자연수"가 아니면 재입력
	    	  }
	      }
	      
	      // 남아있는 데이터를 모두 출력시키고, 스트림을 닫음.
	      bw.flush();
	      bw.close();
	      br.close();
	   }
}