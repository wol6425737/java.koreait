package com.kita.first.practice;

public class Practice28 {
	public static void main(String[] args) {
//		국어합계:?, 평균 : ? 00.0
//		수학합계:?, 평균 : ?
//		영어합계:?, 평균 : ?
//		전체합계:?, 평균 : ?
		int[][] arr = {
				{90, 100, 88},
				{34, 99 ,45},
				{89, 65, 74}
		};
		
		String[] clsArr = {"국어", "수학", "영어"};
		int[] sumArr = new int[clsArr.length];
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
			sumArr[i] += arr[i][k];
			}
			System.out.printf("%s합계: %d, 평균 : %.1f\n",clsArr[i],sumArr[i],((float)sumArr[i]/clsArr.length));

			}

		int totalSum = 0;
		int totalCnt = 0;
		for(int i=0; i<sumArr.length; i++) {
			totalSum += sumArr[i];
			totalCnt += arr[i].length;
			
		}
		System.out.printf("전체합계: %d, 평균 : %.1f",totalSum,(float)totalSum/totalCnt);

	

	}

}
