package io;

import java.io.*;

public class Ex10 {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:" + File.separator + "zzz");
		File file = new File(dir, "ccc.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			
			String msg = br.readLine();
			
			if(msg == null) { // text에서 파일의 끝은 null이다.
				break;
			}
			
			System.out.println(msg);
			
		}
		
		br.close();
		fr.close();

	}

}
