package io;

import java.io.*;

public class Ex08 {

	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:" + File.separator + "zzz");
		File file = new File(dir, "aaa.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		int a = dis.readInt();
		double b = dis.readDouble();
		String c = dis.readUTF();
		
		System.out.println("a : " + a  + " b : " + b + " c : " + c);
		
		dis.close();
		bis.close();
		fis.close();
		
		
		
	}

}
