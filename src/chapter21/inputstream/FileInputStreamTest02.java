package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest02 {

	public static void main(String[] args) {
		//한글 깨짐
		//FileInputStream fis = null;
		FileReader fis = null;
		
		try {
			//fis=new FileInputStream("input.txt");
			fis=new FileReader("input.txt");
			int i;
			//fis.read() : 파일을 끝까지 읽으면 -1을 반환
			while((i=fis.read()) != -1) {
				System.out.print((char) i + " ");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
			fis.close();
		} catch (IOException e) {
				System.out.println(e);
				//NullPounterException을 잡지 못해 죽음
				//catch
		}catch (NullPointerException e) {
			System.out.println(e);
		}
	}
		System.out.println("END");
	}
}

