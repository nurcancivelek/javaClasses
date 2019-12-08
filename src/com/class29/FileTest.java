package com.class29;

public class FileTest {

	public static void main(String[] args) {
		File f1=new WordFile();
		f1.open();
		//f1.close();
		//f1.close();
		
		File f2=new JavaFile();
		f2.open();
		
		File f3=new PDFFile();
		f3.open();
		
	}

}
