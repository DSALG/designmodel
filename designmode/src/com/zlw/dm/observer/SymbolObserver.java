package com.zlw.dm.observer;

/**
 * 符号观察者,打印N 个符号,打印多少个符号，由接受到的数值确定
 * @author zlwei
 *
 */
public class SymbolObserver implements Observer{

	@Override
	public void update(NumberGenerator numberGenerator) {
		System.out.println("SymbolObserver");
		int count = numberGenerator.getNumber();
		for(int i=0; i< count;i++){
			System.out.print("*^_^* ");
		}
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
