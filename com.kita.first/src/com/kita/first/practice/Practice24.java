package com.kita.first.practice;

public class Practice24 {
	public static void main(String[] args) {
		int[] arr = {34, 67, 2, 11, 6, 90};
		int min = 0;
		int temp = 0;
		// 선택정렬
		
		for(int i=0;i<arr.length-1;i++) {
			min = i;
			for(int z=i+1;z<arr.length;z++) {
				//비교
				if(arr[min]>arr[z]) {
					min = z;
				}
			}
			if(min!=i) {
				// 자리바꾸기
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		for(int val : arr) {
			System.out.print(val + ", ");
		}
	}

}
