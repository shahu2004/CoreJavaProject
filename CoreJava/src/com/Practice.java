package com;

public class Practice {

	int a = 10;

	public void show() {

		System.out.println(a);
		a++;
		++a;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Practice p = new Practice();
		p.show();
	}

}
