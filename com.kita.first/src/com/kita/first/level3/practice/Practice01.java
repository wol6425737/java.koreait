package com.kita.first.level3.practice;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자만 입력하시오: ");
		String result = scan.next();
		int num;
		
		try {num = Integer.parseInt(result);
			//문자열 정수로 변환 시도
		}catch(Exception e) {
			e.printStackTrace();
			//변환 실패 출력
			num = 0;
			System.out.println("변환 실패");
		}finally {
			
			
		}
		System.out.println("14+값 = "+ (14 + num));

		
		
	}

}
