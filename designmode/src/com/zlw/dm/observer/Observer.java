package com.zlw.dm.observer;


/**
 * 表示观察者的接口，要成为观察者必须实现此接口
 * @author zlwei
 *
 */
public interface Observer {
	
	void update(NumberGenerator numberGenerator);
}
