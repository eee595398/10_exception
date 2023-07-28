package edu.kh.exception.model.service;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionService {

	
	// 예외(Exception) : 소스코드의 수정으로 해결 가능한 오류 
	
	// 예외는 두 종류로 구분됨 
	// 1) Unchecked Exception : 선택적으로 예외 처리
	// 2) Checked Exception : 필수적으로 예외 처리
	
	private Scanner sc = new Scanner(System.in);
	
	
	public void ex1() {
		
		System.out.println("두 정수를 입력 받아 나누기한 몫을 출력");
		
		System.out.println("정수 1 입력 :");
		int input1= sc.nextInt();
		
		System.out.println("정수 2 입력 :");
		int input2= sc.nextInt();
		
		try {
			System.out.println("결과 : " + input1 / input2);
			//ArithmeticException : 산술적 예외 0으로 나눌수 없다 
			
			
			
		}catch(ArithmeticException e) {
			// try에서 던져진 예외룰 catch 문 매개변수 e로 잡음 
			
			System.out.println("infinity"); //처리 코드(아무거나)
			
		}
		
		//발생하는 예외 중 일부 예외는 try - catch 구문 사용 안해도 (if문)
		// 예외 상황을 방지 할 수 있다 
		// 일부 예외 == 대부분  Unchecked Exception
		
		
		
		
		
		
	}
	public void ex2() {
		// 여러가지 예외에 대한 처리 방법 
		
		
		
		try {
			System.out.print("입력 1 :");
			int num1 = sc.nextInt(); //  java.util.InputMismatchException
			
			
			String str = null;
			
			System.out.println(str.charAt(0));
			// java.lang.NullPointerException : 참조하지 않는 참조변수를 이용해서 코드 수행시 발생 
			
		}catch(Exception e){
			System.out.println("예외 발생 처리함 ");
			// 모든 예외를 처리하기에 무슨 에러인지 알지는 모름 
			// 에러 원인마다 catch를 붙여서 이유를 쓸 수 있음 
			
			
			//예외처리 + 다형성 
			
			// Exception 클래스 : 모든 예외의 최상위 부모 
			// 다향성 - 업캐스팅 : 부모 타입 참조 젼수로 자식 객체를 참조 
			
			// ** 상위 타입의 예외 클래스를 catch문에 작성하면 
			// 다형성 없 캐스팅에 의해 모두 잡아서 처리 가능 
			
			
		}
		
		
	}
	
	public void ex3() {
		//1) try - catch - finally
		// finally : try 구문에서 예외가 발생하든 말든 무조건 마지막에 수행 
		
		try {
			
			System.out.println( 4/0);
			
			
		}catch(ArithmeticException e) {
			System.out.println("예외처리됨");
		
		//2)  catch문 매개 변수 활용
		// 매개변수 e : 예외 관련된 정보 + 예외 관련 기능 
		
		System.out.println( e.getClass() );// 어떤 예외 클래스인가?
		
		System.out.println(e.getMessage() );// 예외 발생시 출력된 내용
		
		System.out.println(e); // e.toString();
		//java.lang.ArithmeticException
		e.printStackTrace(); // 예외 발생위치를 찾아줌 
		
		
		}finally {
			System.out.println("무조건 수행됨");
		}
	}
	
	public void ex4() {
		//throws : 호출한 메서드에게 예외를 던짐 
		// -> 호출한 메서드에게 예외를 처리하라고 위임하는 행위 
		
		// throw : 예외 강제 발생 구문 
		
		try{methodA();
		
		} catch(Exception e){
			// Exception : 모든 예외의 최상위 부모 
			// Exception이 catch 매개변수로 작성되었다 
			// == 예외 종류 상관없이 모두 처리

			
			
			e.printStackTrace();
			// 발생한 예외 모든 내용을 출력 
			
		}
	}
	public void methodA()throws IOException {
		methodB();
	}
	public void methodB()throws IOException {
		methodC(); 
	}
	public void methodC() throws IOException{
		
		// 예외 강제 발생 구문 
		throw new IOException();
		
		
		
	}
	
}
