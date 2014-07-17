package com.egt.tests;

import org.testng.annotations.Test;

import com.egt.linked.list.DoubleLinkedLits;

public class AddLastTest {

    @Test
    public static void test() {

	DoubleLinkedLits<Integer> list = new DoubleLinkedLits<Integer>();

	list.addFirst(3);
	list.addFirst(2);
	list.addFirst(1);
	list.addLast(0);
	list.addLast(-1);
	list.addLast(-2);
	list.addLast(-3);
	list.addFirst(100);
	
	assert list.getSize() == 8;
	list.print();

    }

}
