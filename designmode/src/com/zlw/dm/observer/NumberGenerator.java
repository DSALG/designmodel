package com.zlw.dm.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 表示产生数值的抽象类
 * 
 * @author zlwei
 *
 */
public abstract class NumberGenerator {

	// 存储Observer
	private ArrayList<Observer> observers = new ArrayList<Observer>();

	// 添加观察者
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	// 删除观察者
	public void delObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		Iterator<Observer> it = observers.iterator();
		while (it.hasNext()) {
			Observer o = it.next();
			o.update(this);
		}
	}

	//获取数字
	public abstract int getNumber();
	//产生数字
	public abstract void genreate();

}
