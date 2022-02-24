package Lab8;
import java.time.LocalTime;

class MyThread extends Thread{
	public void run() {
		System.out.println();
	try {
		System.out.println(LocalTime.now());
		Thread.sleep(10000);
		MyThread m=new MyThread();
		m.run();
    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}

public class Excercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt=new MyThread();
		mt.start();
	}

}
