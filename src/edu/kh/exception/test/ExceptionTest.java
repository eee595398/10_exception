package edu.kh.exception.test;

import java.util.Scanner;

public class ExceptionTest {
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 
	 
	 while(true) {
		 System.out.println("정수 입력(0 입력시 종료) : ");
		 int input =sc.nextInt();
		 
		// int a = 9.9
		//컴파일 에러 -> 개발자가 코드 잘못 쓴것
		// 자료형이 맞지않아 연산을 못해서 "컴파일 에러"가 발생(코드 틀림)
		// 코드 수정 가능 		 
				 
		 
		 
		 if(input == 0) {
			 break;
			 
		 }
		 
		 
	 }
	 
	 // 런타임 에러 예제
	 // 런타임 에러 : 프로그램 수행 중 발생하는 에러
	 // 주로 if문으로 처리가 가능하다 
	 
	 int[] arr = new int[3];// 길이 3 : 인덱스 0,1,2까지
	 
	 arr[0]=10;
	 arr[1]=20;
	 arr[2]=30;
	 arr[3]=30;
	 // 배열 범위 초과 예외
	 
	 if(3>=arr.length) { //배열 인덱스 범위 초과시
		 System.out.println("초과 했습니다.");
		 
	 }
	 else {
		 arr[3] =30;
	 }
	 
 }
 
  
}
