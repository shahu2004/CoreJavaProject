package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo {

	int a = 10;
	int b = 20;

	public Demo(int c, int d) {
		System.out.println("The subtraction :" + (a - b));

	}

	public void add() {
		System.out.println("addition is :" + (a + b));
	}

	public static void main(String[] args) {

		Set<Integer> s = new HashSet<>();
		s.add(20);
		s.add(30);
		s.add(90);
		s.add(78);
		s.add(30);
		System.out.println(s);

		Demo d = new Demo(10, 20);

		d.add();

	}

}
