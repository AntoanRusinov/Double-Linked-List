package com.egt.linked.list;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class DoubleLinkedLits<E> {

    private Node<E> head;
    private Node<E> current;

    private int size;

    public DoubleLinkedLits() {
	current = null;
	head = null;
    }

    public int getSize() {
	return size;
    }

    public void addByIndex(E value, int index) {

	if (index < 0) {
	    throw new InputMismatchException("Can not add element at negative index!");
	}

	if (index > size) {
	    throw new ArrayIndexOutOfBoundsException("Index " + index + " can not be inserted here!");
	}

	if (index == 0) {
	    addFirst(value);
	    return;
	}

	Node<E> iter = head;
	Node<E> newNode = new Node<E>(value);

	for (int k = 0; k < index - 1; k++) {
	    iter = iter.next;
	}

	final Node<E> nextNext = iter.next;

	iter.next = newNode;
	newNode.previous = iter;

	newNode.next = nextNext;
	nextNext.previous = newNode;

	size++;

    }

    public void addFirst(E value) {

	Node<E> firstNode = new Node<E>(value);

	if (head == null) {
	    this.head = firstNode;
	    this.current = this.head;
	} else {

	    head.setPrevious(firstNode);
	    firstNode.setNext(head);
	    head = firstNode;

	}
	size++;
    }

    public void addLast(E value) {

	Node<E> currentNode;

	if (head == null) {
	    addFirst(value);
	    return;
	}

	currentNode = head;

	while (currentNode.getNext() != null) {
	    currentNode = currentNode.getNext();
	}

	Node<E> newNode = new Node<E>(value);
	currentNode.setNext(newNode);
	size++;

    }

    public void removeFirst(){

	
	
	
    }
    
    public void reverse() {

	reverseElements(head);

	final Node<E> temp = head;
	head = current;
	current = temp;
    }

    private Node<E> reverseElements(Node<E> current) {

	if (current == null) {
	    throw new NoSuchElementException("List is empty!");
	}

	if (current.next == null) {
	    return current;
	}

	Node<E> nextItem = reverseElements(current.next);

	nextItem.next = current;
	current.next = null;

	return current;

    }

    public void print() {

	Node<E> iter = this.head;

	while (iter != null) {
	    System.out.println("[" + iter.value + "]");
	    iter = iter.next;
	}
	System.out.println();
    }

}