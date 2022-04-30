package utils;

public class HardWaitUtils {
	public static void hardWait(int second) {
		try {
			Thread.sleep(5000 * second);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
