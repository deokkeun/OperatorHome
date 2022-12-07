package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("인원 수 : " );
		int person = sc.nextInt();
		System.out.print("사탕 개수 : " );
		int candy = sc.nextInt();
		System.out.println();
		
		System.out.println("1인당 사탕 개수 : " + candy / person);
		System.out.println("남은 사탕 개수 : " + candy % person);
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(정수만) : " );
		int grade = sc.nextInt();
		System.out.print("반(정수만) : " );
		int classNumber = sc.nextInt();
		System.out.print("번호(정수만) : " );
		int number = sc.nextInt();
		System.out.println("성별(남학생/여학생) : 남학생");		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		float score = sc.nextFloat();
		System.out.println();
		
		System.out.println(grade + "학년 " + classNumber + "반 "
				+ number + "번 " + name + " 남학생의 성적은 " + score + "이다");
	}

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int language = sc.nextInt();
		System.out.print("영어 : ");
		int english = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		System.out.println();
		
		int sum = (language + english + math);
		float average = ((language + english + math) / 3);
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
	}
}
