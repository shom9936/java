package io;

import java.io.*;

public class Ex06 {

	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:" + File.separator + "zzz");
		File file = new File(dir, "string.txt");
		
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(dir + File.separator + "copy.txt");
		
		byte[] buffer = new byte[5];
		
		while(true) {
			
			int count = fis.read(buffer);
			// 데이터는 byte[] 배열에 들어간다.
			// count는 몇개나 새로운 데이터를 읽었는지를 의미한다.
			
			if(count == -1) break;
			
			fos.write(buffer, 0 , count);
			// 맨 처음부터 count 개수만큼만 써줘
			
		}
		
		fis.close();
		fos.close();

	}

}
