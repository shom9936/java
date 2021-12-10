package io;

import java.io.*;

public class Ex05 {

	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:" + File.separator + "zzz");
		File file = new File(dir, "GOODDOCTOR.jpeg");
		
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(dir + File.separator + "Copy.jpeg");
		
		while(true) {
			
			int data = fis.read();
			
			if(data == -1) break;
			
			fos.write(data);
			
		}
		
		fos.close();
		fis.close();
		

	}

}
