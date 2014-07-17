package com.egt.tests;

import java.util.InputMismatchException;

import org.testng.annotations.Test;

import com.egt.linked.list.DoubleLinkedLits;

public class AddByIndexTest {

    @Test
    public static void test() {
	DoubleLinkedLits<Integer> list = new DoubleLinkedLits<Integer>();

	// test for index < 0
	InputMismatchException ex = null;
	try {
	    list.addByIndex(10, -1);
	} catch (InputMismatchException e) {
	    ex = e;
	}

	assert ex != null;

	// test for index > size
	ArrayIndexOutOfBoundsException ae = null;

	try {
	    list.addByIndex(150, 1);
	} catch (ArrayIndexOutOfBoundsException e) {
	    ae = e;
	}

	assert ae != null;

	// test for add on empty of index != 0
	ArrayIndexOutOfBoundsException outOfBound = null;

	try {
	    list.addByIndex(100, 1);
	} catch (ArrayIndexOutOfBoundsException e) {
	    outOfBound = e;
	}
	assert outOfBound != null;

	// test for add on empty correctly
	list.addByIndex(100, 0);
	assert list.getSize() == 1;

	// test for add a few more
	list.addByIndex(100, 0);
	int index = 1;

	for (int k = 2; k < 6; k++) {
	    list.addByIndex(k * 100, index++);
	}

	list.print();

	assert list.getSize() == 6;

    }

}