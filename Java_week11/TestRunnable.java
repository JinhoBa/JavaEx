package java0516;
/*
 class TimerRunnable  implements Runnable{
	int n = 0;
	@Override
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
			} catch (Exception e) {
				return;
			}
		}
	}
}
*/
//람다로 구현
public class TestRunnable {
	public static void main(String[] args) {
		// Thread th = new Thread();
		Thread th1 = new Thread(()->{
			int n = 0;
			while(true) {
				System.out.println(n);
				n++;
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					return;
				}
			}
		});
		th1.start();
	}
}
