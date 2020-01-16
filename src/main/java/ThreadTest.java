
public class ThreadTest {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("zhangs");
		t1.start();
		for (int i = 0; i < 20; i++) {
			if (i%2==0) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				System.out.println("git");
			}
		}
	}

}

class MyThread extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			if (i%2==0) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
			}
		}
	}
	public MyThread(String name) {
		super(name);
	}
	
}
