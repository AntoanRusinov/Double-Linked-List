package com.egt.tests;

import org.testng.annotations.Test;

import com.egt.linked.list.DoubleLinkedLits;

public class ReverseTest {
    @Test
    public static void test() {

	DoubleLinkedLits<Integer> list = new DoubleLinkedLits<Integer>();

	list.addFirst(5);
	list.addFirst(4);
	list.addFirst(3);
	list.addFirst(2);
	list.addFirst(1);
	list.addFirst(0);

	System.out.println("Before: ");
	list.print();

	list.reverse();

	System.out.println("After: ");
	list.print();

	assert list.getSize() == 6;

    }

}
