package io;

import java.io.*;

public class Ex09 {

	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:" + File.separator + "zzz");
		File file = new File(dir, "ccc.txt");
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.print("안녕하세요 ");
		pw.println("자바강사 입니다.");
		pw.println("내일이 마지막이네요 너무 좋습니다.");
		pw.print(20);
		
		pw.close();
		

	}

}
