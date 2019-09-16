package com.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream08 {
	public static void main(String[] args) throws Exception{
		/*File f = new File("D:/test.txt");
		FileInputStream fis = new  FileInputStream(f);*/
		
		/*byte b[] = new byte[102];
		int a = fis.read(b);
		String s = new String(b,0,a);
		
		System.out.println(s);
		System.out.println(s.length());
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		System.out.println(a);
		fis.close();*/
		
		/*byte b [] = new byte[1];
		StringBuffer sb = new StringBuffer();
		int len = 0;
		while((len=fis.read(b))!=-1) {
			sb.append(new String(b));
		}
		System.out.println(sb);*/
		
		/* writing files */
		/*File f = new File("D:/java.txt");
		String str = "xyzs\n";
		FileOutputStream fos = new FileOutputStream(f,true);
		fos.write(str.getBytes());
		fos.close();*/
		
		/*copy file*/
		/*File f = new File("D:/java.txt");
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream("E:/java.txt");
		byte b [] = new byte[1];
		int len = 0;
		while((len=fis.read(b))!=-1) {
			fos.write(b,0,len);
		} 
		fis.close();
		fos.close();*/
	}
}
