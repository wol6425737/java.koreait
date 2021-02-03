package com.kita.first.level4;

import java.io.File;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) {
		File file1 = new File("C:/java_kimsuhan/file_test");
		
		boolean isExist = file1.exists();
		
		if(isExist == false) {
			file1.mkdirs();
			try {
				file1.createNewFile(); //기본적으로  throws IOException 돼있어서 try catch 하거나 다시 throw 하거나, 
				//기능 : 만약에 파일 디렉토리가 안만들어졌을 때 만들어 준다.
			}catch(IOException e) {
				
			}catch(Exception e) {
				
			}
		
			String file1Path = file1.getPath(); //파일의 경로값을 알고 싶을 때
			System.out.println(file1Path);
			boolean result2 = file1.isDirectory(); // 이 주솟값 가진 애가 폴더냐?
			boolean result3 = file1.isFile(); // 이 주솟값 가진 애가 파일이냐?
			
			
		}
	
		
	}
	

}
