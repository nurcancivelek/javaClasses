package com.class29;

public abstract class File {
	 
	abstract void open();
	 
	 public void edit() {
		 System.out.println("open");
	 }
	 public void close() {
		 System.out.println("close");
	 }

}
class WordFile extends File{

	@Override
	void open() {
		System.out.println("to open .doc file we need microsoft word to be installed");
	}
	public void edit() {
		 System.out.println("open wordfile");
	 }
	 public void close() {
		 System.out.println("close wordfile");
	 }
}
class JavaFile extends File{

	@Override
	void open() {
		System.out.println("to open a .java file we need notepad++ or sublime");
	}
	public void edit() {
		 System.out.println("open javafile");
	 }
	 public void close() {
		 System.out.println("close javafile");
	 }
}
class PDFFile extends File{

	@Override
	void open() {
		System.out.println("to open pdf file we need adobe");
	}
	public void edit() {
		 System.out.println("open pdffile");
	 }
	 public void close() {
		 System.out.println("close pdffile");
	 }
	
}







