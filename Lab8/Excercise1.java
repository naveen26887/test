package Lab8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CopyDataThread extends Thread{
	int num;
	CopyDataThread(int num){
		this.num=num;
	}
	
	public void run() {
		try {
			// read
			//C:\Users\rskum\OneDrive\Desktop
			FileReader fr = new FileReader("C:\\Users\\ADMIN\\Documents\\Internship\\Fi;es\\abc.txt");
			// bis = new BufferedInputStream(fis);
			
			// write
			FileWriter fw = new FileWriter("C:\\Users\\ADMIN\\Documents\\Internship\\Fi;es\\xyz.txt");
			//bos = new BufferedOutputStream(fos);

			int num;
			while ((num = fr.read()) %10!=0 && fr.read()!=-1) {
				System.out.println((char) num);
				fw.write(num);
			}
			System.out.println("10 characters copied");
			new CopyDataThread((int)num+1).start();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
	}
}
}

public class Excercise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CopyDataThread cd=new CopyDataThread(1);
		cd.start();
		//cd.join();

	}
}
