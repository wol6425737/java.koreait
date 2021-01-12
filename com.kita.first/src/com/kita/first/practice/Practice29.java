package com.kita.first.practice;

import java.util.Scanner;

public class Practice29 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int LEN = 3;
		int[] rArr = new int[LEN];
		int[] myArr = new int[LEN];
		int strike=0;
		int ball=0;

		
		System.out.println("숫자야구게임시작");
		for(int i=0; i<3; i++) {
			rArr[i] = (int)((Math.random()*9)+1);
			for(int z=0; z<i; z++) {
				if(rArr[i]==rArr[z]) {
					i--;
					break;
				}
			}
		}

		while(true) {
			strike = 0; ball = 0;
			
			for(int z=0; z<3; z++) {
				System.out.printf("값%d : ",z+1);
				myArr[z]=scan.nextInt();
			}
			for(int k=0; k<3; k++) {
				if(myArr[k]==rArr[k]) {
					strike++;
				}
			}
			for(int j=0; j<3; j++) {
				if(myArr[j]!= rArr[j]) {
					for(int l=0; l<3; l++) {
						if(myArr[j]==rArr[l]) {
							ball++;
						}
					}
					
				}

			}
			if(strike==3) {
				System.out.printf("S: %d/ B: %d, O: %d\n",strike,ball,LEN-strike-ball);

				break;
			}
			else {
				System.out.printf("S: %d/ B: %d, O: %d\n", strike, ball, LEN-strike-ball);
			}
		
		}
		System.out.println("End");
		scan.close();
		
		
			
	}

}
