package top.zhacker.learning.jvm.c8;

import java.util.concurrent.TimeUnit;

/**
 * 单分派、多分派演示
* @author zzm
 */
public class Dispatch {

	static class QQ {}

	static class _360 {}

	public static class Father {
		public void hardChoice(QQ arg) {
			System.out.println("father choose qq");
		}

		public void hardChoice(_360 arg) {
			System.out.println("father choose 360");
		}
	}

	public static class Son extends Father {
		public void hardChoice(QQ arg) {
			System.out.println("son choose qq");
		}

		public void hardChoice(_360 arg) {
			System.out.println("son choose 360");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Father father = new Father();
		Father son = new Son();
		_360 a = new _360();
		father.hardChoice(a);
		TimeUnit.MINUTES.sleep(5L);
		son.hardChoice(new QQ());
	}
}

