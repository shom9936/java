package io;

import java.io.*;

class Sungjuk implements Serializable{
	
	String name = "홍길동";
	int java = 100;
	
}

public class Ex11 {

	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:" + File.separator + "zzz");
		File file = new File(dir, "ddd.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		Sungjuk sj = new Sungjuk();
		
		oos.writeObject(sj);
		
		oos.close();
		bos.close();
		fos.close();
		
	}

}
