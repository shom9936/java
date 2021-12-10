package io;

import java.io.*;

public class Ex12 {

	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:" + File.separator + "zzz");
		File file = new File(dir, "ddd.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Sungjuk sj = (Sungjuk)ois.readObject();
		
		System.out.println("이름 : " + sj.name);
		System.out.println("성적 : " + sj.java);
		
		ois.close();
		bis.close();
		fis.close();

	}

}
