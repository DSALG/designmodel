package com.zlw.dm.observer;

/**
 * 数字观察者，会打印出变化的数字
 * 
 * @author zlwei
 *
 */
public class NumberObserver implements Observer {

	@Override
	public void update(NumberGenerator numberGenerator) {
		System.out.println("NumberObserver: " + numberGenerator.getNumber());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
