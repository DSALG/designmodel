package com.zlw.dm.observer;

public class Test {
	public static void main(String[] args) {
		NumberGenerator ng = new RandomNumberGenerator();
		
		Observer o1 = new NumberObserver();
		Observer o2 = new SymbolObserver();
		
		ng.addObserver(o1);
		ng.addObserver(o2);
		
		ng.genreate();
	}

}
