package com.egt.tests;

import org.testng.annotations.Test;

import com.egt.linked.list.DoubleLinkedLits;

public class AddFirstTest {
    @Test
    public static void test() {

	DoubleLinkedLits<Integer> list = new DoubleLinkedLits<Integer>();

	list.addFirst(100);
	list.addFirst(200);
	list.addFirst(300);
	list.addFirst(400);
	list.addFirst(500);
	list.addFirst(600);
	list.addFirst(700);

	assert list.getSize() == 7;

	System.out.println("list size: " + list.getSize());

	list.print();

    }

}
