package io;

import java.io.*;

public class Ex07 {

	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:" + File.separator + "zzz");
		File file = new File(dir, "aaa.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 버퍼에 담는다.
		DataOutputStream dos = new DataOutputStream(bos);
		
		// FileOutputStream : byte출력으로 여러 자료형을 출력할 때
		// BufferedOutputStream으로 버퍼에 담는다.
		// DataOutputStream은 내가 원하는 데이터 형태로 집어넣는다.
		
		int a = 10;
		double b = 10.23;
		String c = "Hello Java";
		
		dos.writeInt(a);
		dos.writeDouble(b);
		dos.writeUTF(c);
		
		dos.close();
		bos.close();
		fos.close();
		
		// 메모장에는 데이터형으로 저장이 되었기 때문에 인코딩이 안되서 읽지를 못한다.
		// 다시 이걸 데이터형으로 읽어서 출력
		
		
		
	}

}
