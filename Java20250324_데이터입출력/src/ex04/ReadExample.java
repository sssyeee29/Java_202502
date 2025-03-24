package ex04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		
		String path = "c:/data/test1.db";
		try {
			InputStream is = new FileInputStream(path);
			
			while(true) {
				int data = is.read();
				
				//data == -1이란 더 이상 읽어올 데이터가 없다(파일 끝!)
				if(data == -1) break;
				System.out.println(data);
			}
			
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
