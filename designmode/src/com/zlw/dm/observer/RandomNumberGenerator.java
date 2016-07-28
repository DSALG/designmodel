package com.zlw.dm.observer;

import java.util.Random;

/**
 * 产生随机数的类，继承于NumberGenerator
 * @author zlwei
 *
 */
public class RandomNumberGenerator extends NumberGenerator{

	private Random random = new Random();
	
	private int number;
	
	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void genreate() {
		for(int i=0;i<5;i++){
			number = random.nextInt(10);
			//有产生新的数字，通知所有的观察者
			notifyObservers();
		}
		
	}

}
