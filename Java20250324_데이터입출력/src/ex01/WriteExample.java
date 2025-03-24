package ex01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


//단축키 ctrl+2+L 입력 (객체생성 알아서 해주기~!)
public class WriteExample {

	public static void main(String[] args) {
		
		String path = "c:/data/test1.db";
		
		OutputStream os = null;
		try {
			 os = new FileOutputStream(path);
			 byte a = 10;
			 byte b = 20;
			 byte c = 30;
			 
			 os.write(a);
			 os.write(b);
			 os.write(c);
			 
			 os.flush(); 
			 os.close(); 
			 
		} catch (FileNotFoundException e) { // 경로가 잘못됐을때 
			e.printStackTrace();
		} catch (IOException e) { //파일 쓰다가 잘못됐을때
			e.printStackTrace();
		}
		
		
	}

}
